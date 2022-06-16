import static java.lang.System.out;
class P43 {
    public static void main(String[] args) {
        int[][] aa = new int[4][];
        aa[0] = new int[1];
        aa[1] = new int[2];
        aa[2] = new int[3];
        aa[3] = new int[4];
        for (int i = 0; i < aa.length; i++) {
            for (int j = 0; j < aa[i].length; j++) {
                out.printf("%d, ", aa[i][j]);
            }
            out.println();
        }
        
    }
}
