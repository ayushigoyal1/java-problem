import java.util.Scanner;
public class Result {
   public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("enter your name");
    String Name=sc.nextLine();
    System.out.println("enter your classname");
    int classname=sc.nextInt();
    System.out.println("enter your Rollnumber");
    long rollnumber=sc.nextLong();
    System.out.println("enter maths marks");
    int maths=sc.nextInt();
    System.out.println("enter hindi marks");
    int hindi=sc.nextInt();
    System.out.println("enter physics marks");
    int physics=sc.nextInt();
    System.out.println("enter chemistry marks");
    int chemistry =sc.nextInt();
    System.out.println("enter english marks");
    int english=sc.nextInt();
    int total_average_marks=maths+hindi+physics+chemistry+english;
    float percentage =(maths+hindi+physics+chemistry+english)/5;
    System.out.println("enter your name:"+Name);
    System.out.println("enter your classname:"+classname);
    System.out.println("enter your roll_number:"+rollnumber);
    System.out.println("enter subject name");
    System.out.println("1.maths:"+maths);
    System.out.println("2.hindi:"+hindi);
    System.out.println("3.physics:"+physics);
    System.out.println("4.chemistry:"+chemistry);
    System.out.println("5.english:" +english);
    System.out.println("Total average marks:"+total_average_marks);
    System.out.println("Percentage:"+percentage); 
    sc.close();
   } 
}
