// ================ CHRISTIAN'S ALGORITHM =================



import java.time.*;
import java.util.Scanner;

public class q17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("T0 (HH:MM:SS): ");
        LocalTime t0 = LocalTime.parse(sc.next());

        System.out.print("T1 (HH:MM:SS): ");
        LocalTime t1 = LocalTime.parse(sc.next());

        System.out.print("Server time: ");
        LocalTime server = LocalTime.parse(sc.next());

        long rtt = Duration.between(t0, t1).toMillis();

        if (rtt < 0) {
            rtt += 86400000; // One day in milliseconds
        }

        LocalTime corrected = server.plusNanos(rtt * 500000);

        System.out.println("Corrected client time: " + corrected);
    }
}
