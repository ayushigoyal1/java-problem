import java.util.Scanner;
public class Temperature {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter temperature in celsius");
        float tempincelsius=sc.nextFloat();
        float tempinfahrenheit=tempincelsius*(9/5)+32;
        System.out.println("Temperature in fahrenheit:"+tempinfahrenheit);
        sc.close();
    }
}
