import java.util.Scanner;
public class Aofr {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter length and breadth");
     int l=sc.nextInt();
     int b=sc.nextInt();
     int A;
     A=l*b;
      System.out.println("area of rectangle(A)="+A);
      sc.close();
    }
}
