public class powerOfTwo {
        public static void main(String[] args) {
            int n = 30;
            int i = 1;
            int powerOfTwo = 1;

            while (i <= n){
                    powerOfTwo = 2 * powerOfTwo;
                    System.out.println(i + " " + powerOfTwo);
                if (((powerOfTwo % 4 == 0)) && ((powerOfTwo % 100!= 0)) || ((powerOfTwo % 400 == 0))) {
                    System.out.println("This is a Leap Year");
                }else
                    System.out.println("This is not a Leap Year");
                    i = i + 1;
            }
        }
    }

