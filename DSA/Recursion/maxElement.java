package DSA.Recursion;

public class maxElement {
    public static int ele(int[] arr,int i,int max){
        if(i == arr.length) return max;
        if(arr[i] > max) max = arr[i];
        max = ele(arr, i+1, max);
        return max;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{15,25,63,48,23};
        System.out.println(ele(arr, 0, 0));
    }
}
