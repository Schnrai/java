import java.util.Scanner;
public class condition {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Inter Salary:");
        int salary=sc.nextInt();
        if(salary>10000) {
            salary = salary + 1000;

        }
            else {salary += 100;}
            { System.out.println("New Salary:"+salary);
            }
        }

    }

