import java.util.Scanner;

public class primeFact {
    public static void main(String[] args){

        Scanner no = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = no.nextInt();

        for(int i = 2; i< num; i++) {
            while(num%i == 0) {
                System.out.println(i+" ");
                num = num/i;
            }
        }
        if(num >2) {
            System.out.println(num);
        }
    }
}


