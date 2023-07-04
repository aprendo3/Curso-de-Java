package locales;

public class OuterThatUseLocalClass {
    public void printNumbers() {
        class LocalClass {
            public void printNumber(int number) {
                System.out.println("Number: " + number);
            }
        }
        LocalClass localObj = new LocalClass();
        localObj.printNumber(10);
    }
}
