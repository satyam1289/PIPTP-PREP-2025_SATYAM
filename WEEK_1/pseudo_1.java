class Main {
    public static void main(String[] args) {

        int y = 0;
        int w = 40;
        int x = 47;
        if ((x % w) == 0 || (w % x) == 0) {
            y = y + 1;
        } else {
            y = y + 10;
        }
        System.out.println(y);

    }
}