import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str="-100x+15y+5y-10x";
        int num=0;
        int sign=1;
        char ch1=' ';
        int sumOfX=0;
        int sumOfY=0;
        String sum_x_sign="";
        String sum_y_sign="";
        for(int i=0;i<=str.length()-1;i++){
            char ch=str.charAt(i);
                if(ch>='0' && ch<='9'){
                    num=num*10+(ch-'0');
                }
            else if(ch>='a' && ch<='z'){
                ch1=ch;
            }
            else if(ch=='+' || ch=='-'){
                num=num*sign;
                if(ch1=='x'){
                    sumOfX+=num;
                }
                if(ch1=='y'){
                    sumOfY+=num;
                }
                num=0;
                ch1=' ';
                if(ch=='+'){
                    sign=1;
                }
                else if(ch=='-'){
                    sign=-1;
                }
            }
        }
        num=num*sign;
          if(ch1=='x'){
                    sumOfX+=num;
                }
          if(ch1=='y'){
                   sumOfY+=num;
          }
          if(sumOfX>0){
              sum_x_sign+='+';
          }
          if(sumOfY>0){
              sum_y_sign+='+';
          }
              
        System.out.println(sum_x_sign+sumOfX+"x"+sum_y_sign+sumOfY+"y");
    }
}
            
                
