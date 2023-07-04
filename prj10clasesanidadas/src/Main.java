import anonimas.Anonymous;
import internas.Outer;
import locales.OuterThatUseLocalClass;

public class Main {
    public static void main(String[] args) {
        System.out.println("Aprendo");
        Outer outer1 = new Outer();
        System.out.println(Outer.InnerOne.class);
        Outer.InnerOne inner1 = outer1.new InnerOne();
        System.out.println(inner1.getData());
        Outer.InnerOne inner2 = outer1.new InnerOne();
        System.out.println(inner2.getData());

        var outerThatUseLocalClass = new OuterThatUseLocalClass();
        outerThatUseLocalClass.printNumbers();

        Anonymous anonymous = new Anonymous();
        anonymous.decirHola();

        Outer.NestedPublic nested1 = new Outer.NestedPublic();
        nested1.sayHello();
    }
}
