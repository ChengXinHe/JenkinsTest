package ExampleJunitwithMockito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestVoidMethodTestCase {
    TestVoidMethod testVoidMethod = new TestVoidMethod();

    @BeforeEach
    public void init() {
        testVoidMethod.add("Apple");
        testVoidMethod.add("Banana");
    }

    @Test
    public void setTestVoidMethod() {
        assertEquals(2, testVoidMethod.size());
    }
}
