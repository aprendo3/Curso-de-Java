import static java.lang.System.out;
public class P50 {
    public static void main(String[] args) {
        out.println(args.length);
        if (args.length > 0) {
            out.println(args[0]);
        }

        if (args.length > 1) {
            out.println(args[1]);
        }

        if (args.length > 2) {
            out.println(args[2]);
        }
    }
}
