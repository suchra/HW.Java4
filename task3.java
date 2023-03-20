import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

// В калькулятор добавьте возможность отменить последнюю операцию.

public class task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> list_result = new LinkedList<>();

        System.out.print("Введите первое число: ");
        int operand1 = scanner.nextInt();
        int result = operand1;
        while (true) {
            System.out.print("Введите операцию  или 'отмена': ");
            String operation = scanner.next().toLowerCase();
            if (operation.equals("отмена")) {
                list_result.removeLast();
                System.out.println(list_result);
                result = list_result.getLast();
                System.out.print("Введите ещё раз операцию  или 'отмена': ");
                operation = scanner.next().toLowerCase();
                scanner.nextLine();
            } else {
                System.out.print("Введите следующее число: ");
                int operand2 = scanner.nextInt();

                switch (operation.charAt(0)) {
                    case '+':
                        result = result + operand2;
                        break;
                    case '-':
                        result = result - operand2;
                        break;
                    case '*':
                        result = result * operand2;
                        break;
                    case '/':
                        result = result / operand2;
                        break;
                }
            }
            list_result.offer(result);
            System.out.println(list_result);
            scanner.close();
        }
    }
}
