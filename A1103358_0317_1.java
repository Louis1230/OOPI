import java.util.Scanner;

public class A1103358_0317_1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("請輸入n的值: ");
        int n = input.nextInt();
        System.out.printf("請輸入m的值: ");
        int m = input.nextInt();
        int [][] product = new int [n][m];
        
        for (int row = 0 ; row < product.length ; row++){
            for (int column = 0 ; column < product[row].length ; column++){
                product[row][column] = (row + 1) * (column + 1);
            }
        }
 
        for (int[] temp : product) {
            for (int result : temp) {
                System.out.printf("%d\t", result);
            }
            System.out.println();
        }
        
        input.close();
    }
}