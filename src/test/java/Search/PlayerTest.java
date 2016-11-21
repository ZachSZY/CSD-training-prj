package Search;

import com.tennis.Court;
import com.tennis.Player;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by jiah on 2016/11/21.
 */
public class PlayerTest {
    @Test
    public void GIVEN_a_player_location_WHEN_search_THEN_return_nearest_court_() {
        //GIVEN
        Player playerA = new Player();

        //WHEN
        Court court = playerA.search();

        assertNotNull(court);
    }

//    @Testt
//    public void Given_a_player_at_hongqiao_When_search_Then_return_hongqiao_court() {
//        Player player = new Player();
//
//
//    }

    @Test
    public void Given_a_player_WHEN_make_a_reservation_THEN_succefully_reserved() {
        Player player = new Player();

        Court court = new Court();
        Boolean isSuccessful = player.reserve(court);

        assertTrue(isSuccessful);
    }
}
