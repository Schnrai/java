import java.util.Scanner;
public class greaterthan { public static void main(String[]args)
{
    System.out.println("enter Number:");
    Scanner sc=new Scanner (System.in);
    int a= sc.nextInt();
    System.out.println("Enter 2nd Number");
    sc = new Scanner(System.in);
    int b=sc.nextInt();
    if (a>=b)
        System.out.println("Larger one:"+a);
    else System.out.println("Larger one:"+b);
}
}
