import java.util.Scanner;
public class TempConv {
    public static void main(String[] args) {
        
        //From Celsius to Fahrenheit: F=C×(9/5)+32
        //From Fahrenheit to Celsius: C=(F−32)×(5/9)

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter temperature to be converted:");
        Double Celcius=sc.nextDouble();
        Double Fahrenheit=sc.nextDouble();

        Fahrenheit=(Celcius*(9.0/5.0)+32);
        System.out.println("From Celsius to Fahrenheit : "+Fahrenheit);

        Celcius=((Fahrenheit-32)*(5.0/9.0));
        System.out.println("From Fahrenheit to Celsius : "+Celcius);
  
    }

}
