import static java.lang.System.out;
class P15 {
    public static void main(String[] args) {
        out.format("2 %% 2 == 0 %b%n", 2 % 2 == 0);
        out.format("4 %% 2 == 0 %b%n", 4 % 2 == 0);
        out.format("1 %% 2 == 0 %b%n", 1 % 2 == 0);
        out.format("6 %% 2 == 0 %b%n", 6 % 2 == 0);
        out.format("7 %% 2 == 0 %b%n", 7 % 2 == 0);
        out.format("9 %% 2 == 0 %b%n", 9 % 2 == 0);
        out.format("3 %% 2 == 0 %b%n", 3 % 2 == 0);
    }
}