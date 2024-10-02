package SortingArray;

import java.util.Arrays;

public class SelectionSort {
    public static int[] useSelectionSort(int[] nums){
        for(int i=0; i<nums.length-1; i++){
            int miniIndex = i;
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] > nums[j]){
                    miniIndex = j;
                }
            }
            if(miniIndex != i){
                int temp = nums[i];
                nums[i] = nums[miniIndex];
                nums[miniIndex] = temp;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 4, 0, 9};
        System.out.println(Arrays.toString(useSelectionSort(arr)));
    }
}
