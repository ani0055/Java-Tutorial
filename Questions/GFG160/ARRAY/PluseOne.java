package Questions.GFG160.ARRAY;

public class PluseOne {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {9,9};
        int[] newArr = plusOne(arr);
        for(int num: newArr ){
            System.out.print(num + " ");
        }

    }
}
