import java.util.Scanner;
public class username_validity{
 public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter the username:");
     String s1=sc.nextLine();
     boolean valid=true;
     if(s1.length()>=6 && s1.length()<=12){
         for(int i=0;i<=s1.length()-1;i++){
             char ch=s1.charAt(i);
             if(!((ch>='A' && ch<='Z')||(ch>='a' && ch<='z')||(ch>='0' && ch<='9')||ch=='_'))
             {
                 valid=false;
             }
     }
     }
     else{
         valid=false;
     }
     char index_1st=s1.charAt(0);
     if(!((index_1st>='A' && index_1st<='Z')||(index_1st>='a' && index_1st<='z'))){
         valid=false;
     }
     if(valid){
        System.out.println("Valid");
     }
     else{
         System.out.println("Invalid");
     }
     }
 }
