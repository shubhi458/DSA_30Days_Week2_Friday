// Java program to find minimum (or maximum) element in an array.
import java.util.Arrays;

class MinMaxElement {

    static int getMin(int[] arr, int n)
    {
        return Arrays.stream(arr).min().getAsInt();
    }

    static int getMax(int[] arr, int n)
    {
        return Arrays.stream(arr).max().getAsInt();
    }

    // Driver code
    public static void main(String[] args)
    {
        int[] arr = { 3, 1, 4, 6, 2, 7 };
        int n = arr.length;
        System.out.println(getMin(arr, n) + "," + getMax(arr, n));
    }
}