package Testen;

import Domeinlaag.Inventory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InventoryTest {

    @Test
    public void testHoeveelheidSneakersOpVoorraad(){
        Inventory inv = new Inventory(120,12000);
        inv.setAantalSneakers(120);
        assertEquals(120, inv.getAantalSneakers());

    }

    @Test
    public void testIngesteldeHoeveelheidSneakersOpVoorraad(){
        Inventory inv = new Inventory(120,12000);
        inv.setAantalSneakers(120);
        assertEquals(120, inv.getAantalSneakers());

    }

    @Test
    public void testTotaleWaardeVanDeVoorraad(){
        Inventory inv = new Inventory(120,12000);
        inv.setTotaleWaarde(12000);
        assertEquals(12000, inv.getTotaleWaarde());

    }

    @Test
    public void testIngesteldeTotaleWaardeVanDeVoorraad(){
        Inventory inv = new Inventory(120,12000);
        inv.setTotaleWaarde(12000);
        assertEquals(12000, inv.getTotaleWaarde());

    }



}