import java.util.Scanner;
public class userinput {
public static void main (String[]arg) {System.out.println("taking input from user");
Scanner sc= new Scanner(System.in);
System.out.println("Enter 1st Number");
int a= sc.nextInt();
System.out.println("Enter 2nd Number");
int b= sc.nextInt();
int sum= a+b;
System.out.println("the sum of these numbers are");
System.out.println(sum);
}}