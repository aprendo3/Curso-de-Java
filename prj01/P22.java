import static java.lang.System.out;
class P22 {
    public static void main(String[] args) {
        int i = 0;
        while(true) {
            out.println(i);
            i = i + 1;
            if(i > 3) { // si i > 3 rompe el ciclo
                break;
            }
        }
    }
}