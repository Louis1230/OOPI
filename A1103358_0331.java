import java.util.Scanner;

public class A1103358_0331 {  
    public static void main(String[] args){ 
        animal animal1 = new animal("雪寶", 1.1, 52.0, 100.0);
        animal animal2 = new animal("驢子", 1.5, 99.0, 200.0);
        animal[] animals = {animal1, animal2};

        human human1 = new human("阿克", 1.9, 80.0, 150.0, "男");
        human human2 = new human("漢斯", 1.8, 78.0, 130.0, "男");
        human human3 = new human("安那", 1.7, 48.0, 120.0, "女");
        human[] humans = {human1, human2, human3};

        snow snow1 = new snow("愛沙", 1.7, 50.0, 120.0, "女", "Yes");
        snow[] snows = {snow1};
        
        animal.showinfo();
        
        for (animal each : animals){
            each.show();
        }
        for (human each : humans) {
            each.show();
        }
       
        for (snow each :snows){
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

        for (human each : humans){
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

        for (snow each : snows){
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
        System.out.printf("項目名稱:%-6s身高:%-7.1f體重:%-8.1f速度:%.1f\n", name, height, weight, speed);
    }

    public double distance(double x, double y){
        return x * y * speed;
    }

    public double distance(double x){
        return x * speed;
    }

    public static void showinfo() {
        System.out.println("歡迎進入冰雪奇緣系統\n");
    }
}

class human extends animal{
    String gender;
    public human(String name, double height, double weight, double speed, String gender){
        super(name, height, weight, speed);
        this.gender = gender;
    }
    public void show(){
        System.out.printf("項目名稱:%-6s身高:%-7.1f體重:%-8.1f速度:%-9.1f性別:%s\n", name, height, weight, speed, gender);
    }
    
}

class snow extends human{
    String frozen;
    public snow(String name, double height, double weight, double speed, String gender, String frozen){
        super(name, height, weight, speed, gender);
        this.frozen = frozen;
    }

    public void show(){
        System.out.printf("項目名稱:%-6s身高:%-7.1f體重:%-8.1f速度:%-9.1f性別:%-5s冰凍技能:%s\n", name, height, weight, speed, gender, frozen);
    }
    
    public double distance(double x, double y){
        return x * y * speed * 2;
    }   

    public double distance(double x){
        return x * speed * 2;
    }
}
