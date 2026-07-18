package sorting;

import java.util.Arrays;

public class selectionsort {
     public static void main(String[] args) {
        int[] result=selectionsortanswer(new int[]{11,64,25,22,64});
        System.out.print(Arrays.toString(result));
    }
    static int[] selectionsortanswer(int[] arr){
      
        for(int i=0;i<arr.length-1;i++){
            int minindex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minindex]){
                   
                    minindex=j;
                }
            }

            int temp=arr[minindex];
            arr[minindex]=arr[i];
            arr[i]=temp;
        }
        
        return arr;
    }
}
