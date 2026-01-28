import java.util.*;

class Pattern1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        //nested loops concept:
        //outer loop
        for(int i = 1; i <= n; i = i + 1){
            //inner loop
            for(int j = 1; j <= m; j = j + 1){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}