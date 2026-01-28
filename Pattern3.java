import java.util.*;

class Pattern3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //outer loop -> rows;
        for(int i = 1; i <= n; i = i + 1){
            //inner loop -> columns;
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}