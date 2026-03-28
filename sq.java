import java.util.*;
public class sq {
    public static void main(String[]args){
        int[] arr={-4,-1,0,3,10};
        for(int i=0;i<arr.length;i++){
            int temp=arr[i]*arr[i];
            arr[i]=temp;
        }
        Arrays.sort(arr);
        System.out.print(Arrays.toString(arr));
    }
    
}
