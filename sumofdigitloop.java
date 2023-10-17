import java.util.Scanner;
public class sumofdigitloop {
    public static void main(String[] args) {
        System.out.println("enter the digit");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        while(n>0){
            int a=n%10;
            n=n/10;
            sum=sum+a;
        }
        System.out.println("sum of number:"+sum);
        sc.close();
    }
}
