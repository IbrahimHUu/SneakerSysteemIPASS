package Testen;

import Domeinlaag.Sneaker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SneakerTest {

    @Test
    void testSneakersnaam() {
        Sneaker sneaker = new Sneaker("AirForce1", "cw22888-111", "43", "Restocks");
        sneaker.setSneakernaam("Jordan1");
        assertEquals("Jordan1", sneaker.getSneakernaam());
    }

    @Test
    void testSku() {
        Sneaker sneaker = new Sneaker("AirForce1", "cw22888-111", "43", "Restocks");
        sneaker.setSku("cw22888-111");
        assertEquals("cw22888-111", sneaker.getSku());
    }

    @Test
    void testMaat() {
        Sneaker sneaker = new Sneaker("AirForce1", "cw22888-111", "43", "Restocks");
        sneaker.setMaat("43");
        assertEquals("43", sneaker.getMaat());
    }

    @Test
    void testPlatform() {
        Sneaker sneaker = new Sneaker("AirForce1", "cw22888-111", "43", "Restocks");
        sneaker.setPlatfrom("Restocks");
        assertEquals("Restocks", sneaker.getPlatfrom());
    }



}