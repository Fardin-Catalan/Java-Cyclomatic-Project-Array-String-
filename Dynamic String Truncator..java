import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string:");
        String s1=sc.nextLine();
        System.out.print("Enter number of characters to be cut:");
        int ch_cut=sc.nextInt();
        System.out.print("From the back?");
        boolean flag_back=sc.nextBoolean();
        String temp_str="";
        if(!flag_back){
            for(int i=ch_cut;i<=s1.length()-1;i++){
                temp_str+=s1.charAt(i);
            }
        }
        else if(flag_back){
            for(int i=0;i<s1.length()-ch_cut;i++){
                temp_str+=s1.charAt(i);
            }
        }
        if(!((s1.length()-ch_cut)>=1)){
            System.out.println("Number of characters cannot be larger than the String");
        }
        else{
            System.out.println(temp_str);
        }
    }
}
