// ================ Bully algorithm with P4 and P5 crashed =================



import java.util.Scanner;

public class q25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Process noticing failure (1-3): ");
        int start = sc.nextInt();

        if (start < 1 || start > 3) {
            System.out.println("Invalid starting process");
            return;
        }

        int current = start;

        while (true) {
            System.out.println("\nP" + current + " starts election");

            int highestReply = -1;

            for (int p = current + 1; p <= 5; p++) {
                System.out.println("P" + current + " sends Election to P" + p);

                if (p == 4 || p == 5) {
                    System.out.println("P" + p + " did not reply");
                } else {
                    System.out.println("P" + p + " replies OK");
                    highestReply = p;
                }
            }

            if (highestReply == -1)
                break;

            current = highestReply;
        }

        System.out.println("\nCoordinator = P" + current);
    }
}
