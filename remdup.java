public class remdup {
    public static void main (String [] args){
    int [] n = {0,0,1,1,2,2,3,3};
    if(n.length==0) {
        System.out.println("Arry emt");
        return;
    }
    int k=1;
    for(int i = 1; i<n.length; i++){
        if(n[i] != n[i-1]){
            n[k] = n[i];
            k++;
        }
    }  
    System.out.println("Number of unq elm:" +k);
    System.out.println("Array aft remove dup:");
    for(int i=0; i<k; i++){
        System.out.println(n[i]+"");
    }
}
}