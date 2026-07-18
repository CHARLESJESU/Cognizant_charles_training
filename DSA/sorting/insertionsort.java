package sorting;

import java.util.Arrays;

public class insertionsort {
    public static void main(String[] args) {
        int[] result=insertionsortanswer(new int[]{64,25,11,22,64});
        System.out.print(Arrays.toString(result));
    }
    static int[] insertionsortanswer(int[] arr){
        
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0&&arr[j]>key){
                arr[j+1]=arr[j];
                --j;
            }
            arr[j+1]=key;
                }
        
    
        return arr;

        }

}
