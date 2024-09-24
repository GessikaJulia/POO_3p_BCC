import java.util.ArrayList;

public class SistemaGerenciamento {
    private ArrayList<Locadora> locadora;

    public void addLocadora(Locadora locadora) {
        this.locadora.add(locadora);
    }

    public void removeLocadora(Locadora locadora) {
        this.locadora.remove(locadora);
    }
}
