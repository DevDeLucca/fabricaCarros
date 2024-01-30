package model;

public class ModelKm {

    private String novo;
    private String seminovo;
    private String usado;

    public ModelKm(String novo, String seminovo, String usado) {
        this.novo = novo;
        this.seminovo = seminovo;
        this.usado = usado;
    }

    public String getNovo() {
        return novo;
    }

    public String getSeminovo() {
        return seminovo;
    }

    public String getUsado() {
        return usado;
    }

    public void setNovo(String novo) {
        this.novo = novo;
    }

    public void setSeminovo(String seminovo) {
        this.seminovo = seminovo;
    }

    public void setUsado(String usado) {
        this.usado = usado;
    }


}
