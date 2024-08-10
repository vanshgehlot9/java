class Factorial {
    static int fact(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

    public static void main(String[] args) {
        int number = 5;
        int result = fact(number);
        System.out.println("The factorial of " + number + " is " + result);
    }
}