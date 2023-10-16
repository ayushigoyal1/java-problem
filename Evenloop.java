import java.util.*;
public class Evenloop {
    public static void main(String[] args) {
        System.out.println("enter the range");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        if(i%2==0)
        {
          System.out.println("even: "+i);  
        } 
        else{
            System.out.println("odd: "+i);
        }
        sc.close();
    }
    }
