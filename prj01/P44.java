import static java.lang.System.out;
class P44 {
    public static void main(String[] args) {
        int[][] aa = {{1}, {2, 3}, {4, 5, 6}, {7, 8, 9, 0}};
        for (int i = 0; i < aa.length; i++) {
            for (int j = 0; j < aa[i].length; j++) {
                out.printf("%d, ", aa[i][j]);
            }
            out.println();
        }
    }
}
