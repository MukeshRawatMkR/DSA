//10th file -> DONE
public class FirstOccOfAnEleInAnArray{
    public static void main(String[] args) {
        int[] arr = { 10, 50,50,12,50,-2};
        System.out.println(FO(arr, 0, -20));
        System.out.println(FO(arr, 0, -2));
        System.out.println(FO(arr, 0, 50));
    }

    public static int FO(int[] arr, int idx, int x) {
        if (idx >= arr.length) {
            return -1;
        }
        if(arr[idx]==x)return idx;
        return FO(arr, idx+1, x);
        // 6 = + % `
    }
}
