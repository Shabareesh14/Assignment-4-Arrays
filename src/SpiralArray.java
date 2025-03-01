import java.util.Arrays;
import java.util.Scanner;

public class SpiralArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Input : ");
        int n = scanner.nextInt();

        int[][] arr = new int[n][n];
        int top = 0;
        int bottom = n-1;
        int right = n-1;
        int left = 0;
        int num = 1;

            while(top <= bottom && left <= right) {

            for (int i = left; i <= right; i++) {
                arr[top][i] = num++;
            }
            top++;

            if(left <= right){
                for(int i = top; i <= bottom; i++){
                    arr[i][right] = num++;
                }
                right--;
            }

            if(top <= bottom){
                for(int i = right; i >= left; i--){
                    arr[bottom][i] = num++;
                }
                bottom--;
            }

            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    arr[i][left] = num++;
                }
                left++;
            }
        }

        for (int[] its : arr) {
            System.out.println(Arrays.toString(its));
        }
    }
}