import java.util.*;
class CircleArea{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a radius of the circle: ");
        int radius = sc.nextInt();

        int diameter = 2 * radius;
        int area = (int)(3.14 * radius * radius);
        System.out.println("Diameter: "+ diameter);
        System.out.println("The area of the ciecle is: "+ area);
    }
}