package Search;

import com.tennis.Court;
import com.tennis.Player;
import com.tennis.Period;
import org.junit.Ignore;
import org.junit.Test;

import java.time.LocalTime;
import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by jiah on 2016/11/21.
 */
public class PlayerTest {
    @Test
    public void GIVEN_a_player_location_WHEN_search_THEN_return_nearest_court_() {
        //GIVEN
        Player playerA = new Player();
        playerA.setLocation(0,0);
        //WHEN
        Court court = playerA.search();

        assertNotNull(court);
    }

    @Ignore
    public void Given_a_player_at_hongqiao_When_search_Then_return_hongqiao_court() {
        Player player = new Player();



    }

    @Test
    public void Given_a_player_without_a_reserved_court_When_share_to_another_player_Then_fail() throws Exception {
        Player player = new Player();
        Court court = new Court(0,0);

        Date start = new Date();
        Date end = new Date();
        Period duration = Period.between(start, end);

        Boolean isSuccessful = player.reserve(court, duration);

        assertTrue(isSuccessful);
    }


}
