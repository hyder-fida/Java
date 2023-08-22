import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
class addition
{
    public static void main (String[] args)
    {
        int a,b,c;
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the ist number:");
        a=obj.nextInt();
        System.out.println("enter the second number:");
        b=obj.nextInt();
        c=a-b;
        System.out.println("sum is:"+c);
    }
}