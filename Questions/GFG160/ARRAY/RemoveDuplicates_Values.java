public class RemoveDuplicates_Values {
     public int removeElement(int[] nums, int val) {
    int i = 0;

    for (int j = 0; j < nums.length; j++) {
        if (nums[j] != val) {
            nums[i] = nums[j];
            i++;
        }
    }

    return i;
}

public int removeDuplicates(int[] nums) {
    if (nums.length == 0) return 0;

    int i = 0;  // pointer for the position of last unique element

    for (int j = 1; j < nums.length; j++) {
        if (nums[j] != nums[i]) {
            i++;
            nums[i] = nums[j];  // overwrite duplicate
        }
    }

    return i + 1;  // new length of array without duplicates
}

}
