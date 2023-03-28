import java.util.Scanner;

public class A1103358_0324_1{
    public static void main(String[] args){ 
        animal animal1 = new animal("雪寶", 1.1, 52.0, 100.0);
        animal animal2 = new animal("驢子", 1.5, 99.0, 200.0);
        animal animal3 = new animal("安那", 1.7, 48.0, 120.0);
        animal animal4 = new animal("愛沙", 1.7, 50.0, 120.0);
        animal[] animals ={animal1, animal2, animal3, animal4};
        
        System.out.printf("項目姓名\t身高(公尺)\t體重(公斤)\t速度(公尺/分鐘)\n");
        for (animal each : animals){
            each.show();
        }
        System.out.println();

        Scanner input = new Scanner(System.in);
        
        for (animal each : animals){
            System.out.printf("請輸入%s奔跑時間(單位:分鐘): ", each.name);
            double x = input.nextDouble();
            System.out.printf("請輸入%s奔跑加速度(若不輸入此變數即輸入0):", each.name);
            double y = input.nextDouble();
            if(y == 0){
                double distance = each.distance(x);
                System.out.printf("%s的奔跑距離為%.0f公尺\n", each.name, distance);
                System.out.println();
            }
            else{
                double distance = each.distance(x, y);
                System.out.printf("%s的奔跑距離為%.0f公尺\n", each.name, distance);
                System.out.println();
            }
        }
        input.close();
    }
}

class animal{
    String name;
    double height, weight, speed;
    public animal(String name, double height, double weight, double speed) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        
    }

    public void show(){
        System.out.printf("%-6s\t", name);
        System.out.printf("%-10.1f\t", height);
        System.out.printf("%-10.1f\t", weight);
        System.out.printf("%.1f\t", speed);
        System.out.println();
    }

    public double distance(double x, double y){
        return x * y * speed;
    }

    public double distance(double x){
        return x * speed;
    }
}