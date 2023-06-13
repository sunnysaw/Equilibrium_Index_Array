import java.util.Scanner;

/*
Question : You are given an array Arr consisting of N integer. You need to find the equilibrium index of the array
An index is considered as an equilibrium index if the sum of elements of the array to the left of that index is equal
to the sum of elements to the right of it.
 */
public class Main {
    static int EquilibriumIndex(int[] array){
        int start,divisibleCount,sumOfIndex = 0,secondSumOfIndex = 0;
        divisibleCount = array.length / 2;
        for (start = 0; start < array.length; start++){
            if (divisibleCount < start){
                sumOfIndex += array[start];
            } else if (divisibleCount > start) {
                secondSumOfIndex += array[start];
            }
        }
        if (secondSumOfIndex == sumOfIndex){
            return array[divisibleCount];
        }else
            return -1;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start,sizeOfArray;
        System.out.println("Enter the length of array :");
        sizeOfArray = input.nextInt();
        System.out.println("Enter the element inside array :");
        int[] array = new int[sizeOfArray];
        for (start = 0; start < array.length; start++){
            array[start] = input.nextInt();
        }
        System.out.println("Printing the result : ");
        System.out.println(EquilibriumIndex(array));
    }
}