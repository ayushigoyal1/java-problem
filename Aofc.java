import java.util.Scanner;
public class Aofc {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius of circle");
        int r=sc.nextInt();
        float A;
        A=(22*r*r)/7;
        System.out.println("area of circle="+A);
        sc.close();
}
}
