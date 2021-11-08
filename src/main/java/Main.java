public class Main {
    public static void main(String args[]) throws InterruptedException {
        int[] numbers = {1, 2, 3, 4, 5};

        Context context = new Context(new BubbleSort());

        context.arrange(numbers);
    }
}