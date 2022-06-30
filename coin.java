//not done
import java.util.*;
public class Coin {
    public static void main(String[] args){
        int i = 1;
        int tails = 0;
        double res;

        Scanner t = new Scanner(System.in);
        System.out.println("Enter Number of times to flip a coin : ");
        int toss = t.nextInt();

        while (i <= toss){
           res = Math.random() ;
               if(res < 0.5){
                   System.out.println("Tails");
                   tails += 1;
               }else
                   System.out.println("Heads");
                i++;
        }
        double pot = (float) tails / toss * 100;
        System.out.println("Percentage of Tails : "+pot);
        double poh = (float)(toss-tails) / toss * 100;
        System.out.println("Percentage of Heads : "+ poh);
    }
}
