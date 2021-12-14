package LogicalProblems;
import java.util.Scanner;

public class FibonacciSeries {
    //private static int two;
    fibonacciSeries(int num , int one , int two){

    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Numbers : ");
        int n = sc.nextInt();
        int first  = 0;
        int second = 1;
        findSeries(n ,first ,second);
        System.out.print( "  "  );

    }
    static void findSeries(int num , int one , int two){
        System.out.println( "  " +one);
        int counter = 0, sum;
        while (counter < num - 1 ){
            sum = one + two;
            System.out.println(" " + sum);
            one = two;
            two = sum;
            counter++;
        }
    }
}