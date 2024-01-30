package model;

public class ModelCor {

    private String prata;
    private String preto;
    private String azul;
    private String cinza;

    public ModelCor(String prata, String preto, String azul, String cinza) {
        this.prata = prata;
        this.preto = preto;
        this.azul = azul;
        this.cinza = cinza;
    }

    public String getPrata() {
        return prata;
    }

    public void setPrata(String prata) {
        this.prata = prata;
    }

    public String getPreto() {
        return preto;
    }

    public void setPreto(String preto) {
        this.preto = preto;
    }

    public String getAzul() {
        return azul;
    }

    public void setAzul(String azul) {
        this.azul = azul;
    }

    public String getCinza() {
        return cinza;
    }

    public void setCinza(String cinza) {
        this.cinza = cinza;
    }

}
