import java.util.Scanner;

public class Circle {
public static void main(String []args)
{
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter radius of your choice");
    int r= sc.nextInt();
    double Circumference= (2*3.14*r);
    System.out.println("Circumference of a Circle is : "+ Circumference);

    double Area=(3.14*r*r);
    System.out.println();
    System.out.println("Area of a circle with radius "+r+ " is " +Area);
}
}












