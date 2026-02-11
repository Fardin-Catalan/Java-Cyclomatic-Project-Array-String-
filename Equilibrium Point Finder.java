import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<=arr.length-1;i++){
            System.out.print("Enter a number:");
            arr[i]=sc.nextInt();
        }
        int found_index=-1;
        int left_sum=0;
        int right_sum=0;
        
        for(int j=1;j<arr.length-1;j++){
            for(int k=0;k<j;k++){
                left_sum+=arr[k];
            }
            for(int m=j+1;m<=arr.length-1;m++){
                right_sum+=arr[m];
            }
            if(left_sum==right_sum && arr[j]==left_sum && arr[j]==right_sum){
                found_index=j;
                System.out.println(j);
            }
            left_sum=0;
            right_sum=0;
        }
        if(found_index==-1){
            System.out.println("Not applicable");
        }
    }
}
                
