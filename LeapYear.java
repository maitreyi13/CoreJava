import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args){
        Scanner yr = new Scanner(System.in);
        System.out.println("Enter Year: ");
        System.out.println("Note: Please enter only 4 digits");
        int year = yr.nextInt();
            if (((year % 4 == 0)) && ((year % 100!= 0)) || ((year % 400 == 0))) {
                System.out.println("This is a Leap Year");
            }else
                System.out.println("This is not a Leap Year");
    }
}
