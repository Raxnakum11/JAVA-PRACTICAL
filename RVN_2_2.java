
import java.util.Scanner;

public class RVN_2_2 {  
    static  void num_count(int arr[]){
  

        int len=arr.length,count=0,n;
        if(len>=4){
            n=4;
        }else{
            n=len;
        }
        for(int i=0;i<n;i++){
         if(arr[i]==9){
            count++;
         }
          
             } System.out.println("Numberof 9's in array:"+ count);   
            }
    public static void main(String[] args) { 

        int[] arr ={1,2,9,9};
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a array");
         
          
//      System.out.println("Enter number how many times you want to print");
//      int num=sc.nextInt();
 sc.close();
    
     
    num_count(arr);
    
          } 

   
 }