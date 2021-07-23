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

        int F1 = findMax(listOdd);
        int F2 = findMax(listEven);


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


}
