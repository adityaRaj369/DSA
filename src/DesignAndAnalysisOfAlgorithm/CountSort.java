package DesignAndAnalysisOfAlgorithm;
import java.util.Scanner;

public class CountSort {

    private static int findMax(int arr[]) {
        int max = arr[0];
        for (int value : arr) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of elements in the array");
        int n = s.nextInt();
        int count=0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        count++;
        int max = findMax(arr);
        count++;
        int[] countArray = new int[max + 1];
        count++;
        for (int value : arr) { // for making frequency array
        	count++;
            countArray[value]++;
            count++;
        }
        count++;
        for (int i = 1; i < countArray.length; i++) {
        	count++;
            countArray[i] += countArray[i - 1];
            count++;
        }
        count++;
        // now we will build sorted array
        int[] sortedArray = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
        	count++;
            int value = arr[i];
            count++;
            int index = countArray[value] - 1;
            count++;
            sortedArray[index] = value;
            count++;
            countArray[value]--;
            count++;
        }
        count++;
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.println(sortedArray[i] + " ");
        }
        //System.out.println("Steps count is : "+ (5*n+4*max+6));
        System.out.println("Steps count is : "+ count);
    }
}