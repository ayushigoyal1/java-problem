import java.util.Scanner;
public class atm {
    public static void main(String[] args){
    Scanner sc=new Scanner (System.in);
    System.out.println("enter your choices");
    System.out.println("1.balance enquiry");
    System.out.println("2.deposit");
    System.out.println("3.withdrawl");
    int ch=sc.nextInt();
    switch(ch)
    {
    case 1:{
        System.out.println("enter your balance");
        double balance=sc.nextDouble();
        System.out.println("your account balance is"+balance);
        break;
    }
    case 2:{
        System.out.println("enter the amount you want to deposit");
        double dep=sc.nextDouble();
        double balance=sc.nextDouble();
        double newbalance=balance+dep;
        System.out.println("your current balanceis:"+newbalance);
        break;
    }
    case 3:{
        System.out.println("enter the amount you want to eithdrawl");
        double witbal=sc.nextDouble();
        double balance=sc.nextDouble();
        double newbalance=balance-witbal;
        System.out.println("your new balance is:"+newbalance);
        break;
    }
    }
    sc.close();
}
}