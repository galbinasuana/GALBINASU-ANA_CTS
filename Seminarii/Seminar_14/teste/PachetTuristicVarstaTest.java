package teste;

import org.junit.jupiter.api.Test;
import clase.PachetTuristic;
import dubluri.FakePersoana;

import static org.junit.jupiter.api.Assertions.*;

public class PachetTuristicVarstaTest {
    @Test
    public void unTanarNuPoateRezerva() {
        FakePersoana persoana = new FakePersoana();
        persoana.setVarsta(16);
        PachetTuristic pachetTuristic = new PachetTuristic(persoana, "Cluj", 200.0);
        assertFalse(pachetTuristic.poateRezerva());
    }

    @Test
    public void unAdultPoateRezerva() {
        FakePersoana persoana = new FakePersoana();
        persoana.setVarsta(41);
        PachetTuristic pachetTuristic = new PachetTuristic(persoana, "Deva", 1500.0);
        assertTrue(pachetTuristic.poateRezerva());
    }
}
