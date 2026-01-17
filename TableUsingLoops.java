import java.util.*;
class TableUsingLoops{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i < 11; i = i + 1){
            System.out.println(n*i);
        }
    }
}