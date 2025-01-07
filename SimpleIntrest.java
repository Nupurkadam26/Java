import java.util.Scanner;
public class SimpleIntrest {


    //Simple Interest=(Principal×Rate×Time)/100
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter principle,Rate,Time to calculate the simple intrest");

        double principle=sc.nextDouble();
        double rate=sc.nextDouble();
        double time=sc.nextDouble();

        double SimpleInterest=((principle*rate*time)/100);
        System.out.println("your Simple Interest for the given values is : "+SimpleInterest);


    }
    
}
