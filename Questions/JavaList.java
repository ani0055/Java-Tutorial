import java.util.*;
//Given a list, ,L of  integers N, perform  queries Q on the list.
// Once all queries are completed, print the modified list as a single line of space-separated integers.
public class JavaList {
    public static int[] remove(int[] arr, int in) {
        if (arr == null || in < 0 || in >= arr.length) {
            return arr;
        }

        int[] arr2 = new int[arr.length - 1];

        for (int i = 0, k = 0; i < arr.length; i++) {
            if (i == in) continue;
            arr2[k++] = arr[i];
        }

        return arr2;
    }

    public static int[] add(int[] arr, int in, int value) {
        if (in < 0 || in > arr.length) {
            return arr;
        }

        int[] arr2 = new int[arr.length + 1];

        for (int i = 0, k = 0; i < arr2.length; i++) {
            if (i == in) {
                arr2[i] = value;
            } else {
                arr2[i] = arr[k++];
            }
        }

        return arr2;
    }

    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();
        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }

        int Q = sc.nextInt();
        sc.nextLine(); // consume newline after reading Q

        for (int i = 1; i <= Q; i++) {
    if (!sc.hasNextLine()) break;
    String command = sc.nextLine();

    if (command.equals("Insert")) {
        if (sc.hasNextInt()) {
            int addIndex = sc.nextInt();
            int addValue = sc.nextInt();
            arr = add(arr, addIndex, addValue);
        }
        if (sc.hasNextLine()) sc.nextLine(); // avoid crash
    } else if (command.equals("Delete")) {
        if (sc.hasNextInt()) {
            int removeIndex = sc.nextInt();
            arr = remove(arr, removeIndex);
        }
        if (sc.hasNextLine()) sc.nextLine(); // avoid crash
    }
}

        printArray(arr);
        sc.close();
    }
}
