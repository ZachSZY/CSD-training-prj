package Search;

import com.tennis.Court;
import com.tennis.CourtService;
import com.tennis.Period;
import com.tennis.Player;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by jiah on 2016/11/21.
 */
@SuppressWarnings("Since15")
public class CourtServiceTest {

    //private Duration duration;
    private CourtService service;
    Date from = new Date();
    Date to = new Date();

    @Before
    public void SetUp() {
        service = new CourtService();
        //duration = Duration.between(from, to);
    }

    @Test
    public void GIVEN_a_court_AND_no_reservation_on_it_WHEN_check_whether_it_is_reserved_THEN_return_false() {
        Court court = new Court(0,0);
        Period period = Period.between(new Date(), new Date());
        boolean isReserved = service.isReserved(court, period);

        assertFalse(isReserved);

    }

    @Test
    public void GIVEN_a_reserved_court_WHEN_check_whether_it_is_reserved_THEN_return_false() {
        Court court = new Court(0,0);
        Period period = Period.between(new Date(), new Date());
        (new Player()).reserve(court, period);

        boolean isReserved = service.isReserved(court, period);

        assertTrue(isReserved);

    }
}
