package SortingArray;

import java.util.Arrays;

/*
      input :  ["papaya", "lime", "watermelon", "apple", "mango", "kiwi"]
      output : ["apple", "kiwi", "lime", "mango", "papaya", "watermelon"]

      explain : lexicographical order means dictionary name order....
      given : use selection sort for this....
      use compareTo() method.....
 */
public class LexicographicalOrderSelectionSort {
    public static String[] lexicographicalOrder(String[] nameSet){
        for(int i=0; i<nameSet.length-1; i++){
            int minIndex = i;
            for(int j=i+1; j<nameSet.length; j++){
                if(nameSet[j].compareTo(nameSet[minIndex]) < 0){
                    minIndex = j;
                }
            }
            //swap
            String temp = nameSet[minIndex];
            nameSet[minIndex] = nameSet[i];
            nameSet[i] = temp;
        }
        return nameSet;
    }
    public static void main(String[] args) {
        String[] fruits = {"papaya", "lime", "watermelon", "apple", "mango", "kiwi"};
        System.out.println(Arrays.toString(lexicographicalOrder(fruits)));
    }
}
