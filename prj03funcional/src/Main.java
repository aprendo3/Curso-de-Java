interface ITest {
    void saludar();
}

public class Main {
    public static void main(String[] args) {
        ITest t1 = new ITest() {
            public void saludar() {
                System.out.println("Aprendo1");
            }
        };
        t1.saludar();
        ITest t2 = () -> {
            System.out.println("Aprendo2");
        };
        t2.saludar();
        ITest t3 = () -> System.out.println("Aprendo3");
        t3.saludar();
        var t4 = (ITest)() -> System.out.println("Aprendo4");
        t4.saludar();
    }
}
