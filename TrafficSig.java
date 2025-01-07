import java.util.Scanner;

public class TrafficSig {

    public static void main(String[] args) {
        // String color[] = { "Green", "Yellow", "red" };
      /*   Scanner sc = new Scanner(System.in);
        System.out.println("please provide color:Green,Yellow,Red");
        String color = sc.nextLine();

        if (color.equalsIgnoreCase("Green")) {
            System.out.println("Go");
        } 
        else if (color.equalsIgnoreCase("Yellow")) {
            System.out.println("Be careful while crossing the road");
        } 
        else if (color.equals("Red")) {
            System.out.println("Please stop your vehicles");
        } 
        else {
            System.out.println("there is an obstacle please stop all your vehicles");
        }
    }
*/
    String color = "obstacle";
    switch (color) {
      case "Green":
        System.out.println("go");
        break;
      case "yellow":
        System.out.println("be careful");
        break;
        case "red":
        System.out.println("stop");
      default:
        System.out.println("stop all vehicles");


}
    }
}