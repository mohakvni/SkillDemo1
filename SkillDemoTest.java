import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void MultiplyTest() {
        assertEquals(6, SkillDemo.multiply(2, 3));
    }
}
