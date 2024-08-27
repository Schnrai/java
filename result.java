import java.util.Scanner;
public class result {
    public static void main (String []args) {
      System.out.println("Result of Sachin");
      Scanner sc= new Scanner (System.in);
      System.out.println("English");
      int a= sc.nextInt();
      System.out.println("Maths");
      int b= sc.nextInt();
      System.out.println("Science");
      int c= sc.nextInt();
      System.out.println("S.st");
      int d= sc.nextInt();
      System.out.println("G.K");
      int e= sc.nextInt();
      int sum= a+b+c+d+e;
      int total=500;
      double fraction= ((double) sum / total )*100;
      System.out.print("The result is:-");
      System.out.print(fraction);
    }
}
