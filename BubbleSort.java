package SortingArray;

import java.util.Arrays;

public class BubbleSort {
    public static int[] useBubbleSort(int[] num){
        for(int i=0; i<num.length; i++){
            for(int j=1; j<num.length-i; j++){
                if(num[j] < num[j-1]){
                    int temp = num[j];
                    num[j] = num[j-1];
                    num[j-1] = temp;
                }
            }
        }
        return num;
    }
    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 0, 1, 8};
        System.out.println(Arrays.toString(useBubbleSort(arr)));
    }
}
