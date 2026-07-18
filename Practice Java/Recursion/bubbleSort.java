public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{62,21,16,45,75,23,71,68,11,5,42};
        
        bubbleS(arr, arr.length-1);
        for(int i : arr){
            System.out.print(i + ", ");
        }
    }

    public static void bubbleS(int[] arr, int i){
        if(i == 1) return;

        for(int j = 0 ; j<i; j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }

        bubbleS(arr, i-1);
    }

    public static void bubbleS2(int[] arr, int i, int j){
        if(i == 0) return;

        if(j<i){
            if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
            bubbleS2(arr, i, j+1);
        }
        else{
            bubbleS2(arr, i-1, 0);
        }
    }
}
