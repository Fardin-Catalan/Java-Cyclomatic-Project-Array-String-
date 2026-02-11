import java.util.Scanner;
public class phone_num_validity{
 public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter a phone number:");
     String s1=sc.nextLine();
     int zero_index=0;
     int one_index=0;
     char target=0;
     boolean valid=true;
     boolean no_dupli_zero=true;
     boolean no_dupli_one=true;
     if(s1.length()==11){
         target=s1.charAt(2);
         for(int i=0;i<=s1.length()-1;i++){
             char ch=s1.charAt(i);
             if(ch=='0'){
                 if(no_dupli_zero){
                     zero_index=i;
                     no_dupli_zero=false;
                 }
             }
             else if(ch=='1'){
                 if(no_dupli_one){
                     one_index=i;
                     no_dupli_one=false;
                 }
             }
             else if(!(ch>='0' && ch<='9')){
                 valid=false;
             }
         }
     }
     else{
         valid=false;
     }
     if(!(zero_index==0 && one_index==1)){
         valid=false;
     }
     if(!(target>='3' && target<='9')){
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
