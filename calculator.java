import java.util.Scanner;
public class calculator {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    Double num1,num2,result;
    System.out.println("choose your operator'+''-''*''/'");
   char operator=sc.next().charAt(0);
   System.out.println("enter first number");
   num1=sc.nextDouble();
   System.out.println("enter second number");
   num2=sc.nextDouble();
   switch(operator){
   case '+':
    result=num1+num2;
    System.out.println(num1+"+"+num2+"="+result);
    break; 
    case '-':
    result=num1-num2;
    System.out.println(num1+"-"+num2+"="+result);
    break;
    case '*':
    result=num1*num2;
    System.out.println(num1+"*"+num2+"="+result);
    break;
    case '/':
    result=num1/num2;
    System.out.println(num1+"/"+num2+"="+result);
    break;
    default:
    System.out.println("invalis operations");
   }
   sc.close();
   }
}

