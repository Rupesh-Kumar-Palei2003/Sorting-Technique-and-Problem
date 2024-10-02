package SortingArray;
/*
    how many minimum step required for sorting.
 */
public class BestBubbleSort {
    public static int bestBubble(int[] arr){
        int swap = 0;
        for(int i=0; i<arr.length; i++){
            boolean flag = false;
            for(int j=1; j<arr.length-i; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    flag = true;
                    swap++;
                }
            }
            if(!flag)
                break;
        }
        return swap;
    }
    public static void main(String[] args) {
        int[] nums = {5, 4, 3, 2, 1};
        System.out.println(bestBubble(nums));
    }
}
