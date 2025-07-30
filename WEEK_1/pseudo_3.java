class Main {
    public static int funn(int a, int b) {
        if (a && b && a + b > 0) {
            return a + funn(a - 2, b - 2) + b;

        }
        return a ^ b;
    }

    public static void main(String[] args) {
        int a = 0;
        int b = 8;
        funn(a, b);

    }
}
