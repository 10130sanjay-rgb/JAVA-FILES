public class max {
    public static void main(String[] args) {
        int[] arr={45,65,78,98,1003};
        int max=arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Maximum Element is:" + max);
    }
}
