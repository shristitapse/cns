// ================ BERKELY ALGORITHM | 1 MASTER - 2 SLAVES | 3 CLK TIMES =================



import java.util.Scanner;

public class q18 {

    static int toMinutes(String time) {
        String[] parts = time.split(":");

        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);

        return hours * 60 + minutes;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] times = new int[3];
        int sum = 0;

        for (int i = 0; i < 3; i++) {
            System.out.print("Clock " + (i + 1) + " (HH:MM): ");
            times[i] = toMinutes(sc.next());
            sum += times[i];
        }

        int average = Math.round(sum / 3.0f);

        System.out.printf("Average time: %d:%02d%n",
                          average / 60, average % 60);

        for (int i = 0; i < 3; i++) {
            int adjustment = average - times[i];

            System.out.printf("Machine %d adjustment: %+d minutes%n",
                              i + 1, adjustment);
        }
    }
}
