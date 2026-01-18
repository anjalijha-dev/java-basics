import java.util.*;

class Calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //taking numbers as input
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        //Taking operation choice
        System.out.println("Choose an operation: ");
        System.out.println("1: Addition(+)");
        System.out.println("2 : Substraction(-)");
        System.out.println("3 : Multiplication(*)");
        System.out.println("4 : Division(/)");
        System.out.println("5 : Modulo(%)");

        int operation = sc.nextInt();

        //calculator logic
        switch(operation){
            case 1 :
                System.out.println("Result: "+ (a + b));
                break;
                
            case 2 :
                System.out.println("Result: "+ (a - b));
                break;
                
            case 3 :
                System.out.println("Result: "+ (a * b));
                break;
                
            case 4 :
                if( b != 0) {
                    System.out.println("Result: "+ (a / b));
                }
                else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
                
            case 5 :
                System.out.println("Result: "+ (a % b));
                break;
                
            default :
                System.out.println("Invalid operation!");
        }
    }
}
