import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
 class palindrome {
    public static void main(String[] args) {
        Scanner pa =new Scanner(System.in);
        int i,num,new_Num=0,rem;
        System.out.println("Enter any number");
        num= pa.nextInt();
         while(num>0) {
               rem= num%10;
               new_Num= new_Num*10+rem;
               num=num / 10;
         }
         System.out.println("new number is:"+new_Num);
    }
}