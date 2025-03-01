import java.util.Scanner;

public class JaggedArray {

    public static void enterWeight(int[][] jaggedArray,int weight,int personIndex, int weightIndex){

        if(personIndex < 0 || personIndex >= jaggedArray.length){
            System.out.println("Invalid Person Index  : ");
            return;
        }

        if(weightIndex < 0 || weightIndex >= jaggedArray[personIndex].length){
            System.out.println("Invalid Weight Index Of The Person.");
            return;
        }

        jaggedArray[personIndex][weightIndex] = weight;
    }

    public  static int findMinimumWeight(int[] personWeight){
        int minWeight = personWeight[0];

        for (int i = 1; i < personWeight.length; i++){
            if(personWeight[i] < minWeight){
                minWeight = personWeight[i];
            }
        }
        return minWeight;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Number Of Rows :");
        int n = scanner.nextInt();
        int[][] jaggedArray = new int[n][];

        for(int i = 0; i < n; i++){
            System.out.println("Enter a Number Of Weight For A Person" + (i+1)+ " : ");
            int m = scanner.nextInt();
            jaggedArray[i] =  new int[m];
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.println("Enter a Weight " + (j+1) + " For a Person " + (i+1) + " : ");
                jaggedArray[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter a person Index to Update the Weight: ");
        int personIndex = scanner.nextInt();
        System.out.println("Enter the weight index of person : ");
        int weightIndex = scanner.nextInt();
        System.out.println("Enter a new Weight : ");
        int newWeight = scanner.nextInt();

        enterWeight(jaggedArray, personIndex-1, weightIndex-1, newWeight);

        System.out.println("Enter a person index to find the minimum weight : ");
        int findIndex = scanner.nextInt();

        int[] personWeights = jaggedArray[findIndex-1];
        int minWeight = findMinimumWeight(personWeights);
        System.out.println("The minimum weigh of person " + findIndex + " is : " + minWeight);
    }
}