import java.util.Scanner;
public class pyramid {
    public static void main(String[] args) {
        System.out.println("enter the size :");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n-1;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        sc.close();
    }
    
}
