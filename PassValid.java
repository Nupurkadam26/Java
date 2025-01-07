import java.util.Scanner;
public class PassValid {
    
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
    System.out.println("Please enter your password : ");
    
        String password = sc.nextLine();

        if (password.length() >= 8) 
        {
            System.out.println("Password is valid.");
        }
         else 
        {
            System.out.println("Password is invalid. It must be at least 8 characters long.");
        }

        sc.close();
    }
}


    

