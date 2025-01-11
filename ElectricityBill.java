import java.util.Scanner;

public class ElectricityBill {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the units of electricity consumed: ");
        double units = scanner.nextDouble();
        
        double billAmount = 0;
        
        if (units <= 100) {
            billAmount = units * 1;
        } else if (units <= 200) {
            billAmount = 100 * 1 + (units - 100) * 2;
        } else {
            billAmount = 100 * 1 + 100 * 2 + (units - 200) * 3;
        }
        
        System.out.println("Your electricity bill is: $" + billAmount);
        
        scanner.close();
    }
}
