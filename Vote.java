import java.util.Scanner;

public class Vote {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Please enter your country");
        String country=sc.nextLine();

        if (age >= 18 && country.equalsIgnoreCase("India") )
        {
            System.out.println("You are eligible to vote as your age is " + age + " and country is " + country);
        } 

        else 
         {
            System.out.println("Please make sure your  country is India and age is at least 18");

        }
sc.close();

    
    }
}
