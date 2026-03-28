import java.util.*;
public class EvenOdd {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of number:");
    int n = sc.nextInt();
    int [] num = new int[n];
    System.out.println("Enter the num:");
    for(int i=0; i<n; i++){
        num[i] = sc.nextInt();
    }
    int even=0;
    int odd=0;
    for(int i=0; i<n; i++){
        if(num[i] % 2 ==0){
            even++;
        }
        else{
            odd++;
        }
    }
    System.out.println("Even numbers: " + even);
    System.out.println("Odd numbers: " + odd);
}
}