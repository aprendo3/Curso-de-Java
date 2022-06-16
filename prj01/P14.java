import static java.lang.System.out;
class P14 {
    public static void main(String[] args) {
        out.format("1 / 2 = %d%n", 1 / 2);
        out.format("1 %% 2 = %d%n", 1 % 2);
        out.format("4 / 2 = %d%n", 4 / 2);
        out.format("4 %% 2 = %d%n", 4 % 2);
        out.format("5 %% 2 = %d%n", 5 % 2);
        out.format("6 %% 3 = %d%n", 6 % 3);
        out.format("6 %% 10 = %d%n", 6 % 10);
        out.format("123 %% 10 = %d%n", 123 % 10);
    }
}