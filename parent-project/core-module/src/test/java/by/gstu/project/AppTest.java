package by.gstu.project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    void testSayHello() {
        App app = new App();
        assertEquals("Hello, World!", app.sayHello());
    }
}