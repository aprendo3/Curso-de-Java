package basico;

public class Caja<T> {
    private T t;
    public void set(T t) { this.t = t; }
    public T get() { return t; }
}
