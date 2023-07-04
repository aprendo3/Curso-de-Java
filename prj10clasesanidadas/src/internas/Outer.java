package internas;

public class Outer {
    private int data;
    static int num;
    public class InnerOne {
        public InnerOne() {
            data++;
        }
        public int getData(){
            return data;
        }
    }
    public static class NestedPublic {
        public void sayHello() {
            System.out.println(num);
            System.out.println("Hello");
        }
    }
}
