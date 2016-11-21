package Search;

import com.tennis.*;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class PlayerTest {
    private Player player;
    private Court court;
    private CourtService courtService;
    private Period period;
    private Player anotherPlayer;

    @Before
    public void setUp() throws Exception {
        player = new Player();
        anotherPlayer = new Player();
        period = createPeriod();
        court = mock(Court.class);
        courtService = new CourtService();
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
        boolean successful = player.reserve(court, period);

        assertTrue(successful);
        assertTrue(courtService.isReserved(court, period));
    }


    @Test
    public void Given_a_player_WHEN_reserve_an_reserved_court_THEN_failed_reserved() {
        anotherPlayer.reserve(court, period);

        boolean successful = player.reserve(court, period);

        assertFalse(successful);
        assertTrue(courtService.isReserved(court, period));
    }

    @Test
    public void Given_a_player_without_a_reserved_court_When_share_to_another_player_Then_fail() throws Exception {

        boolean result = player.share(court, period, anotherPlayer);

        assertFalse(result);
    }

    @Test
    public void Given_a_player_with_a_reserved_court_When_share_to_another_player_Then_sucessful() throws Exception {
        player.reserve(court, period);

        boolean result = player.share(court, period, anotherPlayer);

        assertTrue(result);
    }

    private Period createPeriod() {
        Date start = new Date();
        Date end = new Date();
        return Period.between(start, end);
    }
}
