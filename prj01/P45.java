import static java.lang.System.out;
class P45 {
    public static void main(String[] args) {
        for (int fil = 0; fil < 4; fil++) {
            for (int col = 0; col < 4; col++) {
                out.print("  ");
                if (col % 2 == 0) {
                    out.print("*");
                } else {
                    out.print(" ");
                }
            }
            out.println();
        }
    }
}
