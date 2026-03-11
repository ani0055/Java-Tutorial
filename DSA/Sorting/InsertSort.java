package DSA.Sorting;
// we put the numbers in the order in array we start with the initial number and put it at index 0 and then check it with another no. and compare them if it is greater then it goes to end and if smaller then it goes to start 

public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {5,7,15,1,23,18,45,12};
        int[] newArr = InsertionSort(arr);
        System.out.println("Sorted Array : ");
        for(int nums : newArr) System.out.print(nums + " ");
    }

    public static int[] InsertionSort(int[] arr){
        for(int i = 1; i < arr.length;i++){
            int key = arr[i];
            int j = i-1;

            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j -= 1;
            }
            arr[j+1] = key;
        }
        return arr;
    }
}
