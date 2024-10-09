public class Main {
    public static void main(String[] args) {
        laSalleDesTresors(100);
    }

    public static void laSalleDesTresors(int nbTotalTresors) {
        for (int i = 1; i <= nbTotalTresors; i++) {
            if (i % 3 == 0) {
                System.out.println("Treasure " + i + " : Special treasure!");
            } else {
                System.out.println("Treasure " + i + " : Regular treasure.");
            }
        }
    }
}