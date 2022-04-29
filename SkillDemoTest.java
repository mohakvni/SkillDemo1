import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void MultiplyTest() {
        assertEquals(5, SkillDemo.multiply(2, 3));
    }
}
