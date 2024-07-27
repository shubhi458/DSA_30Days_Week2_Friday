import java.util.*;

public class EvenOddSum {
    // Function to calculate Sum of elements at even and odd index positions separately
    static void EvenOddSumInArray(List<Integer> a, int n)
    {
        int even = 0;
        int odd = 0;
        for (int i = 0; i < n; i++) {
            // Loop to find even, odd Sum
            if ((i | 1) == i) {
                odd += a.get(i);
            }
            else {
                even += a.get(i);
            }
        }
        // Print the sum of elements at odd and even index positions
        System.out.println(odd + " "+ even);
    }

    // Driver Function
    public static void main(String[] args)
    {
        // Create a list of integers
        List<Integer> arr = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        // Get the size of the list
        int n = arr.size();
        // Call the EvenOddSum function
        EvenOddSumInArray(arr, n);
    }
}

