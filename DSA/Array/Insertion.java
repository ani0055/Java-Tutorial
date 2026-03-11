import java.util.*;
public class Insertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        for(int i = 0; i< size;i++){
            System.out.println("Element at " + i + " : ");
            arr[i] = sc.nextInt();
        }

        System.out.print("The array is : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println("--------------Array Insertion Operations--------------");
        System.out.println("1 for insertion at start");
        System.out.println("2 for insertion at position");
        System.out.println("3 for insertion at end");
        System.out.println("4 for Exit");
        System.out.println("Enter Your Choice : ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter the element to insert at start : ");
                int e = sc.nextInt();
                insertStart(arr,e);
                break;
            
            case 2:
                System.out.println("Enter the position for the element: ");
                int pos = sc.nextInt();
                System.out.println("Enter the element to insert at position : ");
                int el = sc.nextInt();
                insertAtPosition(arr, el, pos);
                break;

            case 3:
                System.out.println("Enter the element to insert at end : ");
                int ele = sc.nextInt();
                insertEnd(arr, ele);
                break;

            case 4:
                break;
        
            default:
                System.out.println("Give Valid Choice.");
        }

        sc.close();
    }

    public static int[] insertStart(int arr[], int ele){

        int[] newArr = new int[arr.length+1];

        for(int i = 0; i<newArr.length; i++){
            if(i==0) newArr[i]=ele;
            else newArr[i] = arr[i-1];
        }
        for(int i=0;i<newArr.length;i++){
            System.out.print(newArr[i] + " ");
        }
        return newArr;
    }
    public static int[] insertEnd(int arr[], int ele){

        int newArr[] = new int[arr.length+1];

        for(int i = 0; i<newArr.length;i++){
            if(i<newArr.length-1) newArr[i] = arr[i];
            else newArr[i] = ele;
        }
        for(int i=0;i<newArr.length;i++){
            System.out.print(newArr[i] + " ");
        }

        return newArr;
    }
    public static int[] insertAtPosition(int arr[], int ele, int pos){
        if(pos<0 || pos > arr.length){
            throw new IllegalArgumentException("Invalid Position");
        }

        int newArr[] = new int[arr.length + 1];
        for(int i = 0; i < newArr.length; i++){
            if(i<pos){
                 newArr[i] = arr[i];
            }
            else if(i==pos){
                newArr[i]=ele;
            }
            else{
                newArr[i] = arr[i-1];
            }
        }
        for(int i=0;i<newArr.length;i++){
            System.out.print(newArr[i] + " ");
        }
        return newArr;
    }

}
// Is mostly correct just use while(true) istead of switch case and store arr = insertFun;