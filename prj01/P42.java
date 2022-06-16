import static java.lang.System.out;
class P42 {
    public static void main(String[] args) {
        int[][] aa = new int[3][2];
        for (int i = 0; i < aa.length; i++) {
            for (int j = 0; j < aa[i].length; j++) {
                //out.print(aa[i][j]);
                out.printf("%d, ", aa[i][j]);
            }
            out.println();
        }
    }
}
