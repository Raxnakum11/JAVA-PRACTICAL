import java.util.Scanner;

public class RVN_1_6 {
    
    public static void main(String[] args) {
        int rem, rev=0;
        System.out.println("Enter a number: ");
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
 
        sc.close();
        while(num!=0){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.println("The reversed number is: " + rev);
    }
}