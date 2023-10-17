import java.util.Scanner;
public class Netsalary {
    public static void main(String[] args){
        System.out.println("enter basic salary");
        Scanner sc=new Scanner(System.in);
        float bs=sc.nextFloat();
        float hra=(bs*30)/100;
        float ta=(bs*20)/100;
        float da=(bs*10)/100;
        int pf=1500;
        float net_salary=bs+hra+da+ta-pf;
         System.out.println(net_salary);
         sc.close();
    }
}
