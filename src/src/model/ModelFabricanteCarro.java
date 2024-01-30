package model;

public class ModelFabricanteCarro {


    /*variaveis e contantes da classe*/
    private String toyota;
    private String volksvagem;
    private String hyundai;
    private String ford;
    private String honda;
    private String chevrolet;

    public ModelFabricanteCarro(String toyota, String volksvagem, String hyundai, String ford, String honda,
                                String chevrolet) {
        this.toyota = toyota;
        this.volksvagem = volksvagem;
        this.hyundai = hyundai;
        this.ford = ford;
        this.honda = honda;
        this.chevrolet = chevrolet;
    }

    public String getToyota() {
        return toyota;
    }

    public String getVolksvagem() {
        return volksvagem;
    }

    public String getHyundai() {
        return hyundai;
    }

    public String getFord() {
        return ford;
    }
    public String getHonda() {
        return honda;
    }

    public String getChevrolet() {
        return chevrolet;
    }


    public void setToyota(String toyota) {
        this.toyota = toyota;
    }

    public void setVolksvagem(String volksvagem){
        this.volksvagem = volksvagem;
    }

    public void setHyundai(String hyundai) {
        this.hyundai = hyundai;
    }

    public void setFord(String ford){
        this.ford = ford;
    }

    public void setHonda(String honda){
        this.honda = honda;
    }

    public void setChevrolet(String chevrolet) {
        this.chevrolet = chevrolet;
    }

}



