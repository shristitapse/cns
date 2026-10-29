// ================ BERKELY ALGORITHM | 1 MASTER - 3 SLAVES | 4 CLK TIMES =================



import java.util.Scanner;

public class q19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] times = new int[4];
        int sum = 0;

        for (int i = 0; i < 4; i++) {
            System.out.print("Clock " + (i + 1) + " in minutes: ");
            times[i] = sc.nextInt();
            sum += times[i];
        }

        int average = Math.round(sum / 4.0f);

        System.out.printf("Average time: %d:%02d%n",
                          average / 60, average % 60);

        for (int i = 0; i < 4; i++) {
            int adjustment = average - times[i];

            System.out.printf("Machine %d adjustment: %+d minutes%n",
                              i + 1, adjustment);
        }
    }
}
