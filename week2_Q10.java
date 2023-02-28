import java.util.Scanner;

public class week2_Q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("請輸入攝氏溫度: ");
        float num = input.nextFloat();
        float newNum = (num * 9 / 5) + 32;
        System.out.printf("華氏溫度為(四捨五入到小數點後兩位): %.2f\n",newNum);
        input.close();
    }
}
