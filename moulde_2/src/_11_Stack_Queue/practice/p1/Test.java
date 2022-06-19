package _11_Stack_Queue.practice.p1;

public class Test {
    public static void main(String[] args) {
        System.out.println("----- Stack of integers -----");
        stackOfIntegers();

        System.out.println("----- Stack of Strings -----");
        stackOfIStrings();
    }

    private static void stackOfIntegers() {
        MyGeneriStack<Integer> stack = new MyGeneriStack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        System.out.println("Size of stack after push operations: " + stack.size());
        System.out.printf("Pop elements from stack: ");

        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }

        System.out.println("\n Size of stack after pop operations : " + stack.size());
    }

    private static void stackOfIStrings() {
        MyGeneriStack<String> stack = new MyGeneriStack();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("Size of stack after push operations: " + stack.size());
        System.out.printf("Pop elements from stack : ");

        while (!stack.isEmpty()) {
            System.out.printf(" %s", stack.pop());
        }

        System.out.println("\nSize of stack after pop operations : " + stack.size());
    }
}
