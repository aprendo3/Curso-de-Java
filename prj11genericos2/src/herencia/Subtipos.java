package herencia;
interface A<T> {}
class B<T> implements A<T> {}
class C<T> extends B<T> {}
public class Subtipos {
    public static void main(String[] args) {
        // A<String> <- B<String>
        // B<String> <- C<String>
        A<String> a = new B<String>();
        B<String> b = new C<String>();
    }
}
