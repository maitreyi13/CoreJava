import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args){
        double series = 0.0;
        Scanner hr = new Scanner(System.in);
        System.out.println("Enter n for harmonic series: ");
        int num = hr.nextInt();

        while (num > 0){
            series = series + (double) 1 / num;
            num--;

            System.out.println(series+" , ");
        }
    }
}
