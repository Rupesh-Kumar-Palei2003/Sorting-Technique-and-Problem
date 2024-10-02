package SortingArray;

import java.util.Arrays;

/*
    input : 0 5 0 3 4 2
    output : 5 3 4 2 0 0
    non-zero element order are remaining same;

 */
public class Move0ToEnd {
    public static int[] move0ToLast(int[] nums){
        for(int i=0; i<nums.length; i++){
            for(int j=i; j<nums.length-1-i; j++){
                if(nums[j] == 0 && nums[j+1] != 0){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] arr = {0, 5, 0, 3, 4, 2, -1};
        System.out.println(Arrays.toString(move0ToLast(arr)));
    }
}

// hint : use bubble sort because we continue comparing and swapping......