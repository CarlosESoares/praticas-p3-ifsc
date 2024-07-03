package ifsc;

import java.util.ArrayList;

public class tutor {
    private String nomeCompleto;
    private ArrayList<gato> gatos;

    public tutor() {
        this.gatos = new ArrayList<>();
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public ArrayList<gato> getGatos() {
        return gatos;
    }

    public void adicionarGato(gato gato) {
        this.gatos.add(gato);
        gato.setTutor(this);
    }
}
