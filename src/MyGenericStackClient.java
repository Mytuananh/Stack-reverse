import java.util.Scanner;

public class MyGenericStackClient {
    private static void stackOfInteger() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = scanner.nextInt();
    MyGenericStack stack = new MyGenericStack(n);
        for (int i = n; i > 0 ; i--) {
            stack.push(i);
    }
            System.out.println("a. Size of stack after push operations: " + stack.size());
        System.out.print("b. Pop elements from stack : ");
        while (!stack.isEmpty()) {
            System.out.printf("%d", stack.pop());
        }
        System.out.println("\nc. Size of stack after pop operations : " + stack.size());

    }

    public static void main(String[] args) throws Exception {
        stackOfInteger();
    }
}
