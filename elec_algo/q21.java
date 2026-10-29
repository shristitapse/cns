// ================ Ring election with P5 crashed =================


import java.util.Scanner;

public class q21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Starting process (0-4): ");
        int start = sc.nextInt();

        if (start < 0 || start > 4) {
            System.out.println("Invalid process");
            return;
        }

        int coordinator = -1;

        System.out.println("P5 is crashed");
        System.out.print("Election path: ");

        for (int i = 0; i < 6; i++) {
            int p = (start + i) % 6;

            if (p == 5)
                continue;

            System.out.print("P" + p + " -> ");
            coordinator = Math.max(coordinator, p);
        }

        System.out.println("P" + start);
        System.out.println("Coordinator = P" + coordinator);
    }
}
