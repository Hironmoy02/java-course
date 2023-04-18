import java.util.Random;
import java.util.Scanner;

class game1 {
    public int number;
    public int inputnumb;
    public int guesses = 0;

    game1() {
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }

//    public int getGuesses() {
//        return guesses;
//    }
//
//    public void setGuesses(int guesses) {
//        this.guesses = guesses;
//    }

    void takeuserinput() {
        System.out.println("guess the number");
        Scanner sc = new Scanner(System.in);
        inputnumb = sc.nextInt();
    }

    boolean iscorrect() {

        if (inputnumb == number) {
            System.out.format("yes you guessed it right,the number was %d\n,in %d attempts", number, guesses);
            return true;
        } else if (inputnumb < number) {
            System.out.println("too low");

        } else if (inputnumb > number) {
            System.out.println("too high");

        }
        guesses++;
        return false;
    }
}


public class game {
    public static void main(String[] args) {
        boolean b = false;
        game1 g = new game1();
        while (!b) {

            g.takeuserinput();
            b = g.iscorrect();

        }
    }
}
