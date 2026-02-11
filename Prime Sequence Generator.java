import java.util.Scanner;
public class main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("N:");
    int n=sc.nextInt();
    int target_prime_flag=0;
    int i,j;
    if(n<=1){
      System.out.print("Invalid");
    }
    else if(n==2){
        System.out.println("2");
    }
    else{
       System.out.println("2");
      for( i=3;i<=n;i++){
    for( j=2;j<i;j++){
      if(i%j==0){
        break;
      }
      else{
        target_prime_flag+=1;
    }
    }
    if( target_prime_flag==i-2){
      System.out.println(i);
     }
       target_prime_flag=0;
      }
      }
    }
}
