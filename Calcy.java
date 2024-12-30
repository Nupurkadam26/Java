import java.util.Scanner;

public class Calcy {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide 2 numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Please select the operation");
        System.out.println("addition(+),subtraction(-),multiplication(*),division(/),remainder(%)");
        char operation = sc.next().charAt(0);
        calcy(a, b, operation);
    }
        public static int calcy(int a,int b,char operation)
        {
            int result=0;
            if(operation=='+')
            {
                result=a+b;
                System.out.println("your addition is :"+result);
            }
            else if(operation=='-')
            {
                result=a-b;
                System.out.println("your subtraction is :"+result);
            }
            else if(operation=='*')
            {
                result=a*b;
                System.out.println("your multiplication is :"+result);
            }
            else if(operation=='/')
            {
                result=a/b;
                System.out.println("your division is :"+result);
            }
            else
            {
                result=a%b;
                System.out.println("your remainder is :"+result);
            }

            return result;
        }

    }


