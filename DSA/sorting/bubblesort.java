package sorting;

import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int[] result=bubblesortanswer(new int[]{6,1,8,5,3});
        System.out.print(Arrays.toString(result));
    }
    static int[] bubblesortanswer(int[] arr){
        int i=0;
        while(i<arr.length-1){
            boolean swapped=false;
            int j=0;
            while(j<arr.length-1){

            if(arr[j]>arr[j+1]){
                int temp=arr[j+1];
                arr[j+1]=arr[j];
                arr[j]=temp;
                swapped=true;
            }
            j++;
        }
        // element is already sorted.
        if (!swapped) {
            break;
        }
    i++;
    }
        
        return arr;
    }
}
