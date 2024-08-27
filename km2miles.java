import java.util.Scanner;
public class km2miles {public static void main (String[]args
) {
    System.out.println("Enter kilometer:");
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    float miles=0.62F;
    float cal=a*miles;
    System.out.print(a);
    System.out.print(" kilometers into miles:"+cal);


}
}
