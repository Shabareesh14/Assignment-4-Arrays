import java.util.Scanner;

public class RightRotate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the number of rotations: ");
        int rotations = scanner.nextInt();
        scanner.close();

        rotations = rotations % size;
        int[] temp = new int[size];

        for (int i = 0; i < size; i++) {
            temp[(i + rotations) % size] = array[i];
        }

        for (int i = 0; i < size; i++) {
            System.out.print(temp[i] + " ");
        }
        System.out.println();
    }
}