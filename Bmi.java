import java.util.Scanner;
public class Bmi {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter youir weight in kg");
        float weight=sc.nextFloat();
        System.out.println("enter youir height in m");
        float height=sc.nextFloat();
        float BMI=weight/(height)*(height);
        System.out.println("body mass index:"+BMI);   
        sc.close();
}
}
