import java.util.Scanner;
public class Evenodd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        System.out.println((n%2==0)?"even number":"odd number");
        sc.close();
    }
    }
    

