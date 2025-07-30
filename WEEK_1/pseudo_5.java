class Main {
    public static int funn(int a, int b) {

        for (int c = 2; c < 5; c++) {
            if ((a % 2) < (b % 3))
                a = 4 % 3;
            else {
                if ((5 % 3) > b)
                    a = b;
                b = 1;
            }

        }
        return (a + b);

    }

    public static void main(String[] args) {
        int a = 2;
        int b = 2;
        System.out.print(funn(a, b));

    }
}