//9th file -> DONE
public class SumOfElementsInAnArray {
    public static void main(String[] args) {
        int[] arr = { 10,-2, 50};
        System.out.println(sum(arr, 0));
    }

    public static int sum(int[] arr, int idx) {
        if (idx >= arr.length - 1) {
            return arr[idx];
        }
        return arr[idx] + sum(arr, idx + 1);
        // 6 = + % `
    }
}
