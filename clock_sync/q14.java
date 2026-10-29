// ================ LAMPORTS LOGICAL CLOCKS =================


public class q14 {
    public static void main(String[] args) {

        int p1 = 0, p2 = 0;

        // Process P1
        int a = ++p1;
        int b = ++p1;

        int messageTime = b;

        int c = ++p1;

        // Process P2
        int d = ++p2;

        p2 = Math.max(p2, messageTime) + 1;
        int e = p2;

        int f = ++p2;

        System.out.println("P1: a=" + a + " b=" + b + " c=" + c);
        System.out.println("P2: d=" + d + " e=" + e + " f=" + f);
    }
}