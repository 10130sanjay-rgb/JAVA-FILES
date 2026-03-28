public class two_pointer {
    public static void main(String [] args){
        int[] arr ={10,20,35,50};
        int target = 70;
        boolean count=false;
        for(int i=0; i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int ans = arr[i] + arr[j];
                if(ans==target){
                    count=true;
                }
            }
        }
        System.out.println(count);
    }

    
}
