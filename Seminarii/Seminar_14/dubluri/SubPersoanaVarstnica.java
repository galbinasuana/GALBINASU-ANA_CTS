package dubluri;

import clase.IPersoana;

public class SubPersoanaVarstnica implements IPersoana {
    @Override
    public String getSex() {
        return "F";
    }

    @Override
    public int getVarsta() {
        return 75;
    }

    @Override
    public boolean checkCNP() {
        return true;
    }
}
