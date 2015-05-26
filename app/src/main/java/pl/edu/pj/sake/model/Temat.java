package pl.edu.pj.sake.model;

/**
 * Created by madzia on 2015-05-26.
 */
public class Temat {

    private String temat;
    private String opis;

    public Temat(String temat, String opis) {
        this.temat = temat;
        this.opis = opis;
    }

    public String getTemat() {
        return temat;
    }

    public void setTemat(String temat) {
        this.temat = temat;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }
}
