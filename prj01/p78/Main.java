package p78;
import static java.lang.System.out;
public class Main {
    public static void main(String[] args) {
        Integer i1 = 127;
        Integer i2 = Integer.valueOf(127);
        Integer i3 = new Integer(127);
        out.printf("i1 == i2 : %b | i1 == i3: %b\n",
                i1 == i2, i1 == i3);

        Integer i4 = 128;
        Integer i5 = 128;
        //Integer i5 = Integer.valueOf(128);
        Integer i6 = new Integer(128);
        out.printf("i4 == i5 : %b | i4 == i6: %b\n",
                i4 == i5, i4 == i6);
        out.println(i3.equals(i1));
        out.println(i6.equals(i4));
    }
}
