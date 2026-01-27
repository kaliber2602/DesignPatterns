
public class Main {
    public static void main(String[] args) {
        int[] data = {5, 2, 9, 1, 3};
        SortStrategy sortStrategy;

        // Using Quick Sort
        sortStrategy = new QuickSort();
        System.out.println("Original array: "+ java.util.Arrays.toString(data));
        sortStrategy.sort(data);
        System.err.println("Sorted array: " + java.util.Arrays.toString(data));

        // Using Merge Sort
        data = new int[]{5, 2, 9, 1, 3};
        sortStrategy = new MergeSort();     
        System.out.println("Original array: "+ java.util.Arrays.toString(data));
        sortStrategy.sort(data);
        System.err.println("Sorted array: " + java.util.Arrays.toString(data));

        // Using Bubble Sort
        data = new int[]{5, 2, 9, 1, 3};
        sortStrategy = new BubbleSort();    
        System.out.println("Original array: "+ java.util.Arrays.toString(data));
        sortStrategy.sort(data);
        System.err.println("Sorted array: " + java.util.Arrays.toString(data));
    }
}
