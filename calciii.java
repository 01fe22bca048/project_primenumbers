import java.util.*;
public class calciii {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("........BASIC ARITHEMETIC OPERATIONS........");

        System.out.print("Enter A : ");
        int a = sc.nextInt();

        System.out.print("Enter B : ");
        int b = sc.nextInt();

        System.out.println("Addition of two numbers = " + sum(a,b));

        System.out.println("Product of two numbers = " + prod(a,b));

        System.out.println("Division  of two numbers = " + div(a,b));

        System.out.println("Difference  of two numbers = " + diff(a,b));

    }

    
static float sum(float a , float b)
    {
        return a + b;
    }

   static float prod(float a , float b)
    {
        return a * b;
    }

    static float div(float a , float b)
    {
        return a  / b;
    }

   static  float diff(float a , float b)
    {
        return a  -  b;
    }


    
}

