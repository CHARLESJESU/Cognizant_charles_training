package sorting;

import java.util.Arrays;

public class quicksort {
    public static void main(String[] args) {
               int[] arr = {64, 25, 11, 22, 64};
        int[] result = quicksortanswer(arr,0,arr.length-1);
        System.out.print(Arrays.toString(result));
    }
    static int[] quicksortanswer(int[] arr,int left,int right){
       if(1>=arr.length){
        return arr;
       }
    if(left<right){
           int p=partition(arr,left,right);

       quicksortanswer(arr,left,p-1);
       quicksortanswer(arr,p+1,right);
    }

       return arr;
    }
    static int partition(int[] arr,int left, int right){
        int pivot=right;
        int j=left-1;
        for(int i=left;i<right;i++){
            if(arr[i]<arr[pivot]){
                j++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        int temp=arr[j+1];
        arr[j+1]=arr[pivot];
        arr[pivot]=temp;

        return j+1;
    }

}
