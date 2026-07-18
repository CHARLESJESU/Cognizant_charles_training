package sorting;

import java.util.Arrays;

public class mergesort{
    public static void main(String[] args) {
        int[] arr = {64, 25, 11, 22, 64};
        int[] result = beforemergesortanswer(arr);
        System.out.print(Arrays.toString(result));
    }
    static int[] beforemergesortanswer(int[] arr){
        if(arr.length<=1){
            return arr;
        }
        int mid=arr.length/2;
        int[] left=beforemergesortanswer(Arrays.copyOfRange(arr, 0, mid));
        int[] right=beforemergesortanswer(Arrays.copyOfRange(arr, mid, arr.length));
        return mergesortanswer(left,right);
    }
    static int[] mergesortanswer(int[] left, int[] right){
        int i=0,j=0,k=0;
        int[] join=new int[left.length+right.length];
        while(i<left.length&&j<right.length){
if(left[i]<=right[j]){
join[k++]=left[i++];
}
else{
    join[k++]=right[j++];
}
        }
        while(i<left.length){
            join[k++]=left[i++];
        }
  while(j<right.length){
            join[k++]=right[j++];
        }
        return join;
    }
}