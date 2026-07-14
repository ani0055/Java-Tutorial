public class sortedArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,2,3,3,5};
        boolean sorted = isSorted(arr,0);
        System.out.println(sorted);
    }

    public static boolean isSorted(int[] nums, int i){
        if(i>nums.length-2) return true;
        if(nums[i] <= nums[i+1] ) return isSorted(nums, i+1);
        else return false;
    }
}
