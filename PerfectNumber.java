package LogicalProblems;
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number :");
        int num = sc.nextInt();
        int s = perfect(num);
        if (s == num) {
            System.out.println("It is a perfect Number " + num);
        } else
            System.out.println("It is not perfect number :" + num);
    }

    static int perfect(int num) {
        int sum = 0;
        for (int i = 1; i <= num /2; i++) {
            if (num % i == 0) {
                sum = sum + i;
                System.out.println(" " + sum);
            }
        }
        return sum;
    }
}
