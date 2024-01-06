package DesignAndAnalysisOfAlgorithm;
import java.util.Arrays;
import java.util.Scanner;
public class QuickSort {
	
	public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array, and get the index of the pivot
            int pivotIndex = partition(arr, low, high);
            // Recursively sort the sub-arrays
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        // Choosing the rightmost element as the pivot
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            // If the current element is smaller than or equal to the pivot
            if (arr[j] <= pivot) {
                i++;
                //here we   Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        //here we  Swap arr[i+1] and arr[high] (pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        // Return the index of the pivot
        return i + 1;
    }
    
    public static void printArray(int arr[]) {
    	System.out.print("Sorted array is");
    	for(int i=0;i<arr.length;i++) {
    		System.out.print(arr[i]+" ");
    	}
    }

    public static void main(String[] args) {
    	Scanner s= new Scanner(System.in);
    	System.out.println("Enter Number Of Elements In The Array");
    	int n=s.nextInt();
        int[] arr = new int[n];
        int length = arr.length;
        for(int i=0;i<n;i++) {
        	arr[i]=s.nextInt();
        }
        System.out.println("Original array: " + Arrays.toString(arr));
        // Sort the array using QuickSort
        quickSort(arr, 0, length - 1);
        System.out.println("Sorted Array: "+Arrays.toString(arr));
    }
}