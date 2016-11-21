package Search;

import com.tennis.Court;
import com.tennis.Location;
import com.tennis.Period;
import com.tennis.Player;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PlayerTest {
    private Player player;
    private Court court;
    private Period period;

    @Before
    public void setUp() throws Exception {
        player = new Player();
        period = createPeriod();
        court = mock(Court.class);
    }

    @Test
    public void GIVEN_a_player_location_WHEN_search_THEN_return_nearest_court() {
        //GIVEN
        Location playerLocation = new Location(0, 0);

        //WHEN
        Court court = player.search(playerLocation);

        assertEquals(new Location(0, 1), court.getLocation());
    }

    @Test
    public void Given_a_player_WHEN_reserve_an_unreserved_court_THEN_successfully_reserved() {
        when(court.isReserved(period)).thenReturn(false);

        boolean successful = player.reserve(court, period);

        assertTrue(successful);
        assertTrue(court.isReserved(period));
    }


    @Test
    public void Given_a_player_WHEN_reserve_an_reserved_court_THEN_failed_reserved() {
        when(court.isReserved(period)).thenReturn(true);

        boolean successful = player.reserve(court, period);

        assertFalse(successful);
        assertTrue(court.isReserved(period));
    }

    private Period createPeriod() {
        Date start = new Date();
        Date end = new Date();
        return Period.between(start, end);
    }
}
