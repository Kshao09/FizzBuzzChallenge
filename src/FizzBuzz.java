public class FizzBuzz {
    public static void fizzBuzz() {
        int num1 = 0, num2 = 0, sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.print("fizz buzz ");
                num1 = i / 5;
                num2 = i / 3;
                sum = num1 + num2;
                System.out.println((int)Math.pow(sum, 2));
            } else if (i % 3 == 0) {
                System.out.println("fizz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }

    }

    public static void main(String[] args) {
        fizzBuzz();
    }
}
