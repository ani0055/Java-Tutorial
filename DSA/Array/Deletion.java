import java.util.*;
public class Deletion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---------- Array Deletion ----------");
        System.out.println();
        System.out.println("Enter the number of Elements in the array : ");

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n;i++){
            System.out.println("Element at "+ i + " is : ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Therefore the Array is : ");
        for(int num : arr) System.out.println(num + " ");


        while(true){
            
        System.out.println("Enter your choice for the Deletion Operation : ");
        System.out.println("1 for Deletion at start");
        System.out.println("2 for Deletion from range");
        System.out.println("3 for Deletion from position");
        System.out.println("4 for Deletion from end");
        System.out.println("-1 for exit");
        System.out.print("Enter your Choice : ");

        int choice = sc.nextInt();

        switch(choice){
            case 1 :
            arr = deleteStart(arr);
            System.out.print("After the deletion of 1st element : ");
            for(int num : arr) System.out.print(num + " ");
            break;

            case 2:
            System.out.println("Start of the range : ");
            int s = sc.nextInt();
            System.out.println("end of the range : ");
            int e = sc.nextInt();

            arr = deleteRange(arr, s, e);

            System.out.println("Dletion after deleting from " + s + " to " + e + " is : ");
            for(int num : arr) System.out.print(num + " ");
            break;

            case 3:
            System.out.println("enter the position for deletion : ");
            int p = sc.nextInt();
            arr = deletePosition(arr, p);
            System.out.print("After the deletion of the element at" + p + " : ");
            for(int num : arr) System.out.print(num + " ");
            break;

            case 4 :

            arr = deleteEnd(arr);
            System.out.print("After the deletion of last element : ");
            for(int num : arr) System.out.print(num + " ");
            break;

            case -1:
            System.out.println("Exiting...");
            sc.close();
            return;

            default:
            System.out.println("Give valid Choice");
        }
        }
    }

    public static int[] deleteStart(int arr[]){
        int[] newArr = new int[arr.length-1];
        for(int i = 1; i<= arr.length-1;i++){
            newArr[i-1] = arr[i];
        }
        return newArr ;
    }

    public static int[] deleteRange(int arr[], int start, int end){
        int[] newArr = new int[arr.length - (end - start + 1)];
        if (start < 0 || end >= arr.length || start > end) {
            throw new IllegalArgumentException("Invalid Range");            
        }
        int index = 0;
        for(int i = 0; i < arr.length ; i++){
            if(i<start || i>end){
                newArr[index++] = arr[i];
            }
        }
        return newArr ;
    }

    public static int[] deletePosition(int arr[], int pos){
        if (pos < 0 || pos >= arr.length) {
            throw new IllegalArgumentException("Invalid Position");
        }
        int[] newArr = new int[arr.length-1];
        for(int i = 0 ; i<newArr.length;i++){
            if(i<pos){
                newArr[i] = arr[i];
            }
            else if(pos>i){
                newArr[i] = arr[i+1];
            }
        }
        return newArr ;
    }

    public static int[] deleteEnd(int arr[]){
        int[] newArr = new int[arr.length-1];
        for(int i = 0; i<newArr.length;i++){
            newArr[i] = arr[i];
        }
        return newArr ;
    }
}
