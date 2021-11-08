import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StrategyTest {
    private int[] numbers = {1, 2, 3, 4, 5};

    @Test
    void testBubbleSort() {
        System.out.println("Running: testBubbleSort");

        Context context = new Context(new BubbleSort());
        context.arrange(numbers);

        assertEquals(context.getStrategy().toString(), "Sorting array using Bubble Sort");
    }

    @Test
    void testQuickSort() {
        System.out.println("Running: testQuickSort");

        Context context = new Context(new QuickSort());
        context.arrange(numbers);

        assertEquals(context.getStrategy().toString(), "Sorting array using Quick Sort");
    }
}
