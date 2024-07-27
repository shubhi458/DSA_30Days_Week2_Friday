public class MostFrequentElement
{

    static int maxFreq(int []arr, int n)
    {

        // using moore's voting algorithm
        int res = 0;
        int count = 1;
        for(int i = 1; i < n; i++) {
            if(arr[i] == arr[res]) {
                count++;
            } else {
                count--;
            }

            if(count == 0) {
                res = i;
                count = 1;
            }

        }

        return arr[res];
    }

    // Driver code
    public static void main (String[] args) {
        int[] arr = {1,3,2,1,4,1};
        int n = arr.length;
        int freq = maxFreq(arr , n);
        int count = 0;
        for (int j : arr) {
            if (j == freq) {
                count++;
            }
        }
        System.out.println(maxFreq(arr , n) +" appears " +count +" times in array." );
    }

}
