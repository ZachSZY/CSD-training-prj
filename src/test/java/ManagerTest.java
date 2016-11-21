import com.tennis.Court;
import com.tennis.Manager;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by shuayang on 16/11/21.
 */
public class ManagerTest {
    @Test
    public void GIVEN_a_court_manager_WHEN_publish_a_court_THEN_succeed() throws Exception {
        Manager manager = new Manager();

        boolean result = manager.publish(new Court(0, 1));
        assertTrue(result);
    }
}
