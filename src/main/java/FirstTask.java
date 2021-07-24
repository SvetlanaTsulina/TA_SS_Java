import java.util.*;

public class FirstTask {
    public static void main(String[] args) {

        List<Integer> listOdd = new ArrayList();
        List<Integer> listEven = new ArrayList();

        int first = getIntFromConsole("Enter the 1st element of list: ");
        int last = getIntFromConsole("Enter the last element of list: ");

        for (int i = first; i <= last; i++) {
            if (i % 2 == 0) {
                listEven.add(i);
            } else {
                listOdd.add(i);
            }
        }

        System.out.println("Sum of all even numbers: " + listSum(listEven));
        System.out.println("Sum of all odd numbers: " + listSum(listOdd));

        int f1 = findMax(listOdd);
        int f2 = findMax(listEven);

        int n = getIntFromConsole("Enter the size of set: ");

        List<Integer> listFibonacci = buildFibonacci(f1, f2, n);
        System.out.println("Fibonacci Series: " + listFibonacci);

        countPercentage(listFibonacci);


    }


    public static List<Integer> buildFibonacci(int f1, int f2, int n) {
        List<Integer> listFibonacci = new ArrayList();
        int next; // The next element of Fibonacci Series

        for (int i = 3; i <= n; i++) {
            next = f1 + f2;
            f1 = f2;
            f2 = next;
            listFibonacci.add(next);
        }

        return listFibonacci;

    }


    public static int listSum(List<Integer> list) {
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        return sum;

    }

    private static int getIntFromConsole(String message) {
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        return in.nextInt();
    }

    public static int findMax(List<Integer> list) {
        return list.stream()
                .mapToInt(v -> v)
                .max()
                .orElse(Integer.MIN_VALUE);
    }

    public static void countPercentage(List<Integer> list) {
        int evenSum = Math.round(list.stream().filter(n -> n % 2 == 0).count());
        int evenPercentage = evenSum * 100 / list.size();

        int oddSum = Math.round(list.stream().filter(n -> n % 2 != 0).count());
        int oddPercentage = oddSum * 100 / list.size();

        System.out.println("Percentage of Evens in Fibonacci: " + evenPercentage + "%\nPercentage of Odds in Fibonacci: " + oddPercentage + "%");


    }


}
