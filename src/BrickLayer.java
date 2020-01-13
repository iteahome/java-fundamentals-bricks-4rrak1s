import java.util.Scanner;

public class BrickLayer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int NOB;
        int i;

        System.out.println("Please insert the desired number of bricks and press ENTER...");
        NOB = sc.nextInt();

        for (i = 1; NOB > 0; i++) {
            NOB = NOB - i;

            System.out.println("Patlu laid " + i + " bricks.");

            if (NOB <= 0) {
                System.out.println("Patlu laid the last brick!");
                break;
            }
            System.out.println(NOB + " bricks remaining...");

            NOB = NOB - i * 2;

            System.out.println("Motlu laid " + i * 2 + " bricks.");

            if (NOB <= 0) {
                System.out.println("Motu laid the last brick!");
                break;
            }
            System.out.println(NOB + " bricks remaining...");

        }

    }
}
