import static java.lang.System.out;
class P46 {
    public static void main(String[] args) {
        final int N = 4;
        for (int fil = 0; fil < N; fil++) {
            for (int col = 0; col < N; col++) {
                out.print("  ");
                if (fil == 0 
                    || fil == N - 1 
                    || col == 0 
                    || col == N - 1
                    ) {
                    out.print("*");
                } else {
                    out.print(" ");
                }
            }
            out.println();
        }
    }
}
