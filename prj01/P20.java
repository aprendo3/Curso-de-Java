import static java.lang.System.out;
class P20 {
    public static void main(String[] args)
    throws InterruptedException {
        int i = 0;
        while(true) {
            out.println(i);
            i = i + 1;
            Thread.sleep(1000);
        }
    }
}