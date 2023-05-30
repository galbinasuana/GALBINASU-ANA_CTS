package teste;

import org.junit.jupiter.api.Test;
import clase.IPersoana;
import clase.PachetTuristic;
import dubluri.StubPersoana;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PachetTuristicTest {
    @Test
    void checkIfAplicaDiscountDoesntApplyForYoungPeople() {
        IPersoana persoana = new StubPersoana();
        PachetTuristic pachet = new PachetTuristic(persoana, "Bucuresti", 10.0);

        pachet.aplicaDiscountVarstnici(20);
        assertEquals(10.0, pachet.getPret());
    }

    @Test
    void checkIfAplicaDiscountWorksForAged() {
        IPersoana persoana = new StubPersoana();
        PachetTuristic pachet = new PachetTuristic(persoana, "Bucuresti", 10.0);

        pachet.aplicaDiscountVarstnici(20);
        assertEquals(8.0, pachet.getPret());
    }
}
