// ================ Bully algorithm for five processes with one crashed process =================



public class q23 {
    public static void main(String[] args) {

        int start = 2;

        System.out.println("P2 starts election");

        for (int p = start + 1; p <= 5; p++) {
            System.out.println("P2 sends Election to P" + p);
            System.out.println("P" + p + " replies OK");
        }

        int coordinator = 5;

        System.out.println("Coordinator = P" + coordinator);
    }
}
