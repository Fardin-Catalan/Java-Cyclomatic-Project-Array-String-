import java.util.Scanner;
public class pass_validity{
 public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter password:");
     String s1=sc.nextLine();
     boolean valid=true;
     int up_count=0;
     int low_count=0;
     int dig_count=0;
     int sp_count=0;
     if(s1.length()>=8 & s1.length()<=15){
         for(int i=0;i<=s1.length()-1;i++){
             char ch=s1.charAt(i);
             if(ch>='A' && ch<='Z'){
                 up_count+=1;
             }
             else if(ch>='a' && ch<='z'){
                 low_count++;
             }
             else if(ch>='0' && ch<='9'){
                 dig_count++;
             }
             else if(ch=='!' || ch=='@' || ch=='#' || ch=='$' || ch=='%' || ch=='^' ||ch=='&' ||ch=='*'){
                 sp_count++;
             }
             else if(ch==' '){
                 valid=false;
                 break;
             }
             else{
                 valid=false;
             }
         }
     }
         else{
             valid=false;
         }
         
         if(valid && up_count>=1 && low_count>=1 && dig_count>=1 && sp_count>=1){
             System.out.println("Valid");
         }
         else{
             System.out.println("Invalid");
         }
     }
 }
