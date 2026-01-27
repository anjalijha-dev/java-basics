import java.util.Scanner;

class MarksMenu{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.print("Enter 1 to input marks or 0 to stop: ");
            choice = sc.nextInt();

            if(choice == 1){
                System.out.print("Enter student's marks (0-100): ");
                int marks = sc.nextInt();

                if(marks >=90 && marks <= 100){
                    System.out.println("This is good.");
                }
                else if(marks >= 60 && marks <= 89){
                    System.out.println("This is also good.");
                }
                else if(marks >=0 && marks <=59){
                    System.out.println("This is good as well.");
                }
                else{
                    System.out.println("Invalid marks entered.");
                }
                System.out.println("Because marks don't matter but our effort does!");
            }
        }
        while(choice != 0);
        System.out.println("Program stopped!");
    }
}