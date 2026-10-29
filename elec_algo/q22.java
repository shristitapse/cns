// ================ Bully algorithm for five processes with one crashed process =================


import java.util.Scanner;

public class q22 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter crashed process (1-5): ");
        int crashed = sc.nextInt();

        if (crashed < 1 || crashed > 5) {
            System.out.println("Invalid process");
            return;
        }

        int current = 1;

        if (current == crashed)
            current = 2;

        while (true) {
            System.out.println("P" + current + " starts election");

            int highestReply = -1;

            for (int p = current + 1; p <= 5; p++) {
                System.out.println("P" + current + " sends Election to P" + p);

                if (p != crashed) {
                    highestReply = p;
                }
            }

            if (highestReply == -1)
                break;

            current = highestReply;
        }

        System.out.println("Coordinator = P" + current);
    }
}
