import java.util.Scanner;
public class factorialloop {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact = 1;
       for(int i=n;i>=1;i--){
        fact = fact * i;
       }
       System.out.println("factorial : "+fact);
       sc.close();
    }
}
