import java.util.Scanner;

public class HomeWork5Level1 {
        public static void main(String[] args) {

            Scanner sony = new Scanner(System.in);

            String line = sony.nextLine();


            if (line.length() > 10) {
                System.out.println(true);
            }
            else {
                System.out.println(false);
            }
            char first = line.charAt(0);
            char second = line.charAt(line.length()-1);
            if (first == second) {
                System.out.println(true);
            }
            else {
                System.out.println(false);
            }
        }
    }
