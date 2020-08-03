import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;
import java.util.Comparator;

import static org.junit.Assert.assertEquals;

public class MergeSortTest {

    private Player[] players;

    @Before
    public void init() {
        Calendar calendar = Calendar.getInstance();

        players = new Player[5];

        calendar.set(1986, 9, 30);
        players[0] = new Player("Giroud", 18, calendar.getTime());
        calendar.set(1994, 5, 6);
        players[1] = new Player("Kovacic", 17, calendar.getTime());
        calendar.set(1991, 3, 29);
        players[2] = new Player("Kante", 7, calendar.getTime());
        calendar.set(1989, 8, 28);
        players[3] = new Player("Azpilicueta", 28, calendar.getTime());
        calendar.set(1999, 1, 10);
        players[4] = new Player("Mount", 19, calendar.getTime());
    }

    @Test
    public void givenPlayersThenReturnSortedByBackNumber() {
        MergeSort.sort(players, new Comparator<Player>() {
            @Override
            public int compare(Player player1, Player player2) {
                return Integer.compare(player1.getBackNumber(), player2.getBackNumber());
            }
        });

        assertEquals(7, players[0].getBackNumber());
        assertEquals(17, players[1].getBackNumber());
        assertEquals(18, players[2].getBackNumber());
        assertEquals(19, players[3].getBackNumber());
        assertEquals(28, players[4].getBackNumber());
    }

    @Test
    public void givenPlayersThenReturnSortedByBirth() {
        MergeSort.sort(players, new Comparator<Player>() {
            @Override
            public int compare(Player player1, Player player2) {
                return player1.getBirth().compareTo(player2.getBirth());
            }
        });

        assertEquals("Giroud", players[0].getName());
        assertEquals("Azpilicueta", players[1].getName());
        assertEquals("Kante", players[2].getName());
        assertEquals("Kovacic", players[3].getName());
        assertEquals("Mount", players[4].getName());
    }




}