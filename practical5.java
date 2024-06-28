import java.util.Scanner;
public class practical5 {
     public static void main(String[] args) {
         int[] code={1,2,3,4,5,};
         float[] tax={8,12,5,7.5f,3};
         String[] product={"motor","fan","tube","wire","others"};
        int[] price={100,234,131,56,576};

        for(int i=0;i<code.length;i++){
        System.out.println(code[i] +" for " + product[i]);
        } System.out.println("Enter code for generate bill...");
        Scanner  sc= new Scanner(System.in);
        int x=sc.nextInt(); 
        sc.close();
        
    
        switch (x) {
            case 1:
                float a;
                System.out.print("Price of motor=");
                a=price[x-1]+price[x-1]*(tax[x-1])/100;
                System.out.println(a);
                break;
            case 2:
                float b;
                System.out.print("Price of fan=");
                b=price[x-1]+price[x-1]*(tax[x-1])/100;
                System.out.println(b);
                break;

            case 3:
                float c;
                System.out.print("Price of tube=");
                c=price[x-1]+price[x-1]*(tax[x-1])/100;
                System.out.println(c);
                break; 
             
            case 4:
                float d;
                System.out.print("Price of wire=");
                d=price[x-1]+price[x-1]*(tax[x-1])/100;
                System.out.println(d);
                break;     
            
           case 5:
                float e;
                System.out.print("Price of other=");
                e=price[x-1]+price[x-1]*(tax[x-1])/100;
                System.out.println(e);
                break;        
            default:
            System.out.println("INVALID CODE,ENTER CORRECT CODE!!");
                break;
        }
     }  
     
     
}
