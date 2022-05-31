package Testen;

import Domeinlaag.History;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HistoryTest {

    @Test
    public void testTotaleOmzet(){
        History history = new History(1150,550);
        history.setOmzet(1150);
        assertEquals(1150, history.getOmzet());

    }

    @Test
    public void testTotaleWinst() {
        History history = new History(1150,550);
        history.setWinst(1150);
        assertEquals(550, history.getWinst());
    }

}