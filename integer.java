import java.util.Scanner;
public class integer {public static void main(String []args)
{
    System.out.println("Enter a number:");
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    if (a % 1 == 0)
        System.out.println("Integer");
    else System.out.println(" Not Integer");
}

}
