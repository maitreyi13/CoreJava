import java.util.Scanner;
public class Alphabet {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an alphabet");
        char alpha = sc.next().charAt(0);

        if (alpha == 'a' || alpha == 'e' || alpha == 'i' || alpha == 'o' || alpha == 'u' ){
            System.out.println("Given alphabet is a vowel");
        }else {
            System.out.println("Given alphabet is a consonant");
        }
    }
}
