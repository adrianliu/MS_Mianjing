package MS;

import java.util.Arrays;

/**
 * Created by xiaopengliu on 3/04/16.
 */
public class WiggleSort {
    public static void main(String[] args) {
        int[] nums = {3,5,2,1,6,4};
        printArray(nums);
        wiggleSort3(nums);
        printArray(nums);

    }

    private static void printArray(int[] arr) {
        for(int x: arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    //sort the arrary first, O(nlogn)
    public static void wiggleSort1(int[] nums) {
        if(nums == null || nums.length == 0) {
            return;
        }
        int n = nums.length;
        Arrays.sort(nums);
        for(int i = 0;i < n;i++) {
            //if i is odd
            if((i != n - 1) && (i % 2 != 0)) {
                swap(nums, i, i + 1);
            }
        }
    }

    //do not need to sort the array first, O(n)
    public static void wiggleSort2(int[] nums) {
        if(nums == null || nums.length == 0) {
            return;
        }
        int n = nums.length;
        for(int i = 0;i < n;i++) {
            if(i % 2 != 0) {
                if(i + 1 < n) {
                    if(nums[i - 1] > nums[i + 1]) {
                        if(nums[i] < nums[i - 1]) {
                            swap(nums, i, i-1);
                        }
                    } else {
                        if(nums[i] < nums[i + 1]) {
                            swap(nums, i, i+1);
                        }
                    }

                } else {
                    //i+1 == n
                    if(nums[i] < nums[i - 1]) {
                        swap(nums, i, i-1);
                    }
                }

            }
        }
    }


    public static void wiggleSort3(int[] nums) {
        if(nums == null || nums.length == 0) {
            return;
        }
        int n = nums.length;
        for(int i = 1;i < n;i++) {
            if(i % 2 != 0 && nums[i] < nums[i-1] || i % 2 == 0 && nums[i] > nums[i - 1]) {
                swap(nums, i, i - 1);
            }
        }
    }


}
