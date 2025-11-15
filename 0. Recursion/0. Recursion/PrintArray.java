//7th file -> DONE.
public class PrintArray {
    public static void main(String[] args) {
        int []arr = {10,20,3,4,5,6,7,8,9};
        displayEle(arr, 0);
}

public static void displayEle(int arr[], int idx){
    if(idx>=arr.length)return;
    System.out.println(arr[idx]);
    displayEle(arr, idx+1);
}
}

