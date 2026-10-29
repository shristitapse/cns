// ================ VECTOR LOGICAL CLOCKS =================


import java.util.Arrays;

public class q16 {
    public static void main(String[] args) {

        int[] p1 = {0, 0};
        int[] p2 = {0, 0};

        // P1 sends message
        p1[0]++;
        int[] message = p1.clone();

        System.out.println("P1 send: " + Arrays.toString(p1));

        // P2 receives message
        for (int i = 0; i < 2; i++) {
            p2[i] = Math.max(p2[i], message[i]);
        }

        p2[1]++;

        System.out.println("P2 receive: " + Arrays.toString(p2));
    }
}
