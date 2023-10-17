import java.util.Scanner;
public class palindroneloop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int sum=0;
        int temp=n;
        while(n>0)
        {
            int r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum){
            System.out.println("palindrone number");
        }
        else{
            System.out.println("not a palindrone number");
        }
        sc.close();
    }
}
