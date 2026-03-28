import java.util.*;
public class climb{
    public static int climbstair(int n){
        if(n <= 2){
            return n;
        }
        int fir = 1;
        int sec = 2;
        for( int i=3; i<=n; i++){
            int tird = fir +sec;
            fir = sec ;
            sec = tird;
        }
        return sec;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the stairs:");
        int num = sc.nextInt();
        System.out.println("Number of ways to climb " + num + " stairs: " + climbstair(num));
    }
}