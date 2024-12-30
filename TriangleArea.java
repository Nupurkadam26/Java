import java.util.Scanner;
public class TriangleArea {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please provide base and height");
       
        double base=sc.nextDouble();
        double height=sc.nextDouble();

        double TriangleArea=triangleArea(base,height);
        System.out.println("Area of the triangle is : "+TriangleArea);        

        char area = sc.next().charAt(0);
       
    
    }
    public static double triangleArea(double base,double height)
    {  
        double area=0;
        area=(1.0/2)*base*height;
        return area;
    }
    

}
