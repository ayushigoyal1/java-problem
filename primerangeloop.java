import java.util.Scanner;
public class primerangeloop {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int  flag;
        System.out.printf("Enter first limit: ");
       int a = sc.nextInt(); 
        System.out.printf("Enter last number : ");
       int b = sc.nextInt(); 
        for (int i = a; i <= b; i++) {
            if (i == 1 || i == 0)
          continue;
            flag = 1;
            for (int j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1)
            {
            System.out.println(i);
            }
        }
        sc.close();
    }
}
