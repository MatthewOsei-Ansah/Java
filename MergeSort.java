import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        Integer[] intArray = {5,7,2,78,4,8,89,32,9,45,67,66,72,100,99,3};
        Integer[] SortedArray;
        System.out.println("Before sorting: " + Arrays.toString(intArray));
        SortedArray = mergeSort(intArray, intArray);
        System.out.println("After sorting: " + Arrays.toString(SortedArray));
    }

    public static Integer[] mergeSort(Integer[] Array, Integer[]Copy) {
        if (Array.length <= 1) {
            return Array;
        }

        int mid = Array.length / 2;
        Integer[] LeftOfSlicedArray = Arrays.copyOfRange(Array,0,mid);
        Integer[] RightOfSlicedArray = Arrays.copyOfRange(Array,mid,Array.length - 1);

        Integer[] left = mergeSort(LeftOfSlicedArray, Copy);
        Integer[] right = mergeSort(RightOfSlicedArray, Copy);

        return merge(left, right, Copy);
    }

    public static Integer[] merge(Integer[] left, Integer[] right, Integer[] SortedArray) {
        int i = 0, j = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                SortedArray[i] = left[i];
                i++;
            } else {
                SortedArray[i] = right[j];
                j++;
            }
        }
        while (i < left.length) {
            SortedArray[i] = left[i];
            i++;
        }
        while (j < right.length) {
            SortedArray[i] = right[j];
            j++;
        }
        return SortedArray;
    }
}
