// ================ LAMPORTS LOGICAL CLOCKS =================


public class q15 {
    public static void main(String[] args) {

        int p1 = 5;
        int p2 = 2;

        p1++;
        System.out.println("P1 after send = " + p1);

        p2 = Math.max(p2, p1) + 1;
        System.out.println("P2 after receive = " + p2);
    }
}
