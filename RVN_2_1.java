import java.util.Scanner;

public class RVN_2_1 {  
    static  void front_times(String str,int x){
  int len=str.length();
        for(int i=0;i<x;i++){
       
           if(len>=3){
            System.out.print(str.substring(0,3));
           } 
           else if(len==2){
               System.out.print(str.substring(0,2));
       } else{
        System.out.print(str.substring(0,1));
       }
        }
             }    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
          String str=sc.nextLine();
          
     System.out.println("Enter number how many times you want to print:");
     int num=sc.nextInt();
   sc.close();
    
     
     front_times(str,num);
    
          } 

   
} 
