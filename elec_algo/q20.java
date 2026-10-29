// ================ RING ELECTION ALGORITHM | 6 PROCESSES =================



import java.util.Scanner;

public class q20
 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Starting process (0-5): ");
        int start = sc.nextInt();

        if (start < 0 || start > 5) {
            System.out.println("Invalid process");
            return;
        }

        int coordinator = -1;

        System.out.print("Election path: ");

        for (int i = 0; i < 6; i++) {
            int p = (start + i) % 6;

            System.out.print("P" + p + " -> ");
            coordinator = Math.max(coordinator, p);
        }

        System.out.println("P" + start);
        System.out.println("Coordinator = P" + coordinator);
    }
}
