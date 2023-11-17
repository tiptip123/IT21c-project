
package Sorting;

import java.util.Arrays;


public class Sorting {
    private int[] numbers;
    
    public Sorting(int[]numbers){
        this.numbers=numbers;
    }
    
    public void OriginalArray(){
        System.out.println("Original Array:" +Arrays.toString(numbers));
    }
    
    public void sortArray(){
     Arrays.sort(numbers);   
        System.out.println("sorted array: " +Arrays.toString (numbers));
        
    }
    public static void main(String [] args){
        int [] array = {9,7,8,15,3,2};
        Sorting Sorter = new Sorting(array);
        Sorter.OriginalArray();
        Sorter.sortArray();
    }
}
