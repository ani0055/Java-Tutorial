package DSA.Recursion;

public class binarySearch {
    public static int bs(int[] arr, int tar, int i, int j){
        int mid = (i+j)/2;
        if(i>j) return -1;
        if(arr[mid]==tar) return mid;
        if(tar < arr[mid]) bs(arr, tar,i, mid - 1);
        return bs(arr, tar,mid+1, j);

    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6};
        System.out.println(bs(arr, 5, 0, arr.length-1));
    }

}
