import java.util.Scanner;

public class week2_Q9{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("請輸入(小於2147483647)正整數: ");
        int num = input.nextInt();
        if(num > 0 && num < 2147483647){ 
            ///若超過2147483647會Overflow，若小於等於0便不能算是奇偶數
            if(num % 2 == 1){
                System.out.printf("%d是奇數!\n", num);
            }
            else{
                System.out.printf("%d是偶數!\n", num);
            }
        }
        else{
            System.out.println("輸入錯誤，請重新執行程式，並輸入正整數(小於2147483647)!");
        }
        input.close();    
    }
}