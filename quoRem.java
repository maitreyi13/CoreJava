import java.util.Scanner;

public class quoRem {
        public static void main(String[] args) {

            int dividend; int divisor;

            Scanner div = new Scanner(System.in);
            System.out.println("Enter dividend and divisor: ");
            dividend = div.nextInt();
            divisor = div.nextInt();

            int quotient = dividend / divisor;
            int remainder = dividend % divisor;

            System.out.println("Quotient = " + quotient);
            System.out.println("Remainder = " + remainder);
        }
}
