import java.util.Arrays;
import java.util.Scanner;

public class RightRotate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a Input : ");
        int n = scan.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println("Original Arrays : "+Arrays.toString(arr));

        System.out.println("Enter a Rotation :");
        int num = scan.nextInt();
        scan.close();

        num = num % n;
        int[] temp = new int[n];

        for(int i = 0; i < n; i++){
            temp[(i + num) % n] = arr[i];
        }

        for(int i = 0; i < n; i++){

            System.out.print(temp[i] + " ");
        }
        System.out.println();
    }
}