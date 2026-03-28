import java.util.*;
public class pascalTri2{
    public static List<Integer> generate(int nums){
        List<Integer> row= new ArrayList<>();
        row.add(1);
        for(int i=1; i<=nums; i++){
            for(int j= i-1; j>0; j--){
                row.set(j,row.get(j)+row.get(j-1));
            }
            row.add(1);
        }
        return row;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int nums = sc.nextInt();
        List<Integer> pascalTri2 = generate(nums);
        System.out.println("Pascal triangle"+nums+"rows is:");
        System.out.println(pascalTri2);
    }
}