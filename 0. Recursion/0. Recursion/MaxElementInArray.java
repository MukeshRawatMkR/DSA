//8th file. -> DONE

public class MaxElementInArray {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 3 };
        System.out.println(maxEle(arr, 0));
    }

    public static int maxEle(int arr[], int idx) {
        if (idx >= arr.length-1)
            return arr[idx];
        
        return Math.max(arr[idx], maxEle(arr,idx + 1));
    }
}

/*public class MaxElementInArray {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 3 };
        System.out.println(maxEle(arr, Integer.MIN_VALUE, 0));
    }

    public static int maxEle(int arr[], int maxi, int idx) {
        if (idx >= arr.length)
            return maxi;
        if (arr[idx] > maxi)
            maxi = arr[idx];
        return maxEle(arr, maxi, idx + 1);
    }
}
*/