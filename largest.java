import java.util.*;
public class largest {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers ");
        System.out.print("Enter A : ");
        int a = sc.nextInt();
        System.out.print("Enter B : ");
        int b = sc.nextInt();
        System.out.print("Enter C : ");
        int c = sc.nextInt();

        if(a>b)
        {
            if(a>c)
            {
                System.out.println(a + " is Largest ");
            }
            else
            {
                System.out.println(c + " is Largest ");
            }
            }
        else
        {
        if(b>c)
        {
            System.out.println(b + " is Largest ");
        }
        else
        {
            System.out.println(c + " is Largest ");
        }
        }

        
    }
}
