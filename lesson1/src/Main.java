import java.util.Scanner;

public class Main {
    static int[] enteringNumbers() {
        System.out.println("enter 5 numbers");
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        int[] numbers = new int[5];

        while (counter < 5) {

            int a = sc.nextInt();
            if (checkingIfMoreThan5Symbols(a)) {
                numbers[counter] = a;
                counter++;
            } else {
                System.out.println("not correct!enter again");
            }
            ;

        }
        sc.close();
        return numbers;

    }

    static void fibonacci(int x) {

        int[] numbers = new int[x];
        numbers[0] = 1;
        numbers[1] = 1;

        for (int i = 2; i < x; i++) {
            numbers[i] = numbers[i - 1] + numbers[i - 2];

        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ", ");
        }
    }

    static void sort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < i; j++) {

                if (numbers[i] < numbers[j]) {
                    int temp = numbers[i];

                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }

        }
        System.out.println("sorted array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }

    static boolean checkingIfMoreThan5Symbols(int x) {
        int i = 0;
        while (x > 0) {

            x = (int) x / 10;
            i++;
        }
        if (i >= 5) {
            return true;
        }
        return false;
    }

    static void numbersWithAsdendingChars(int[] numbers) {
        System.out.println("Numbers with ascending chars:");
        for (int i = 0; i < 5; i++) {
            int number = numbers[i];
            boolean flag = true;
            int k = number % 10;
            number /= 10;
            while (number > 0) {

                if (k <= number % 10) {
                    flag = false;
                    break;
                }
                k = number % 10;
                number /= 10;
            }
            if (flag) {
                System.out.println(numbers[i]);
            }
        }

    }

    static void simpleChars(int[] numbers) {
        System.out.println("Numbers which have simple chars:");
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            int temp = number % 10;

            while (temp > 0) {

                if (temp == 2 || temp == 3 || temp == 5 || temp == 7) {

                    System.out.println(numbers[i]);
                    break;
                }
                number = (int) number / 10;
                temp = number % 10;
            }
        }

    }

    static void dividedByPrevious(int[] numbers) {
        System.out.println("Numbers which are divided by the previous element:");
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] % numbers[i - 1] == 0) {
                System.out.println(numbers[i]);
            }
        }

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        fibonacci(10);

        int[] numbers = enteringNumbers();

        sort(numbers);
        numbersWithAsdendingChars(numbers);

        simpleChars(numbers);

        dividedByPrevious(numbers);

    }
}
