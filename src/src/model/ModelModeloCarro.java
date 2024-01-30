package model;

public class ModelModeloCarro {

    private String hatchs;
    private String sedans;
    private String suvs;

    public ModelModeloCarro(String hatchs, String sedans, String suvs) {
        this.hatchs = hatchs;
        this.sedans = sedans;
        this.suvs = suvs;
    }

    public String getHatchs() {
        return hatchs;
    }

    public String getSedans() {
        return sedans;
    }

    public String getSuvs() {
        return sedans;
    }

    public void setHatchs(String hatchs) {
        this.hatchs = hatchs;
    }

    public void setSedans(String sedans) {
        this.sedans = sedans;
    }

    public void setSuvs(String suvs) {
        this.suvs = suvs;
    }
}
