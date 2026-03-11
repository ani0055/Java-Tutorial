package DSA.Sorting;
// Maximum value goes at the end
// Swapping is done in the outer loop
public class SelectionSort {
     public static void main(String[] args) {
        int[] arr = {36,28,45,12,78,96,14,15,30};
        for(int num : arr) System.out.print(num + " ");
        System.out.println();
        for(int num : Selection(arr)) System.out.print(num+ " ");;
        
    }
    public static int[] Selection(int[] arr){
        int maxIndex = Integer.MIN_VALUE;
        int temp = 0;
        for(int i = 0; i<arr.length-1;i++){
            maxIndex = arr.length-i-1;
            for(int j = 0; j<arr.length-i-1;j++){
                if(arr[maxIndex] < arr[j]){
                    maxIndex = j;
                }
            }
            temp = arr[maxIndex];
            arr[maxIndex] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        return arr;
    }
}
