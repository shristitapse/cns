// ================ Find coordinator from a list of process IDs and alive status =================



import java.util.Scanner;

public class q24 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Number of processes: ");
        int n = sc.nextInt();

        int coordinator = -1;

        for (int i = 0; i < n; i++) {

            System.out.print("Process ID: ");
            int pid = sc.nextInt();

            System.out.print("Alive (yes/no): ");
            String status = sc.next();

            if (status.equalsIgnoreCase("yes") && pid > coordinator) {
                coordinator = pid;
            }
        }

        if (coordinator == -1) {
            System.out.println("No active coordinator");
        } else {
            System.out.println("Coordinator = P" + coordinator);
        }
    }
}
