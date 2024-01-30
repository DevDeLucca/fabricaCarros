package model;

public class CMVeiculo {

    private ModelFabricanteCarro fabricanteCarro;
    private ModelCor modelCor;
    private ModelKm modelKm;
    private ModelModeloCarro modelModeloCarro;


    public ModelFabricanteCarro getFabricanteCarro() {
        return fabricanteCarro;
    }

    public void setFabricanteCarro(ModelFabricanteCarro fabricanteCarro) {
        this.fabricanteCarro = fabricanteCarro;
    }

    public ModelCor getCor() {
        return modelCor;
    }

    public void setModelCor(ModelCor modelCor) {
        this.modelCor = modelCor;
    }

    public ModelKm getKm() {
        return modelKm;
    }

    public void setModelKm(ModelKm modelKm) {
        this.modelKm = modelKm;
    }

    public ModelModeloCarro getModelModeloCarro() {
        return modelModeloCarro;
    }

    @Override
    public String toString() {
        return "VIECULO  = " + fabricanteCarro.getFord().toUpperCase()
                + fabricanteCarro.getChevrolet().toUpperCase()
                + fabricanteCarro.getHonda().toUpperCase()
                + fabricanteCarro.getToyota().toUpperCase()
                + fabricanteCarro.getChevrolet().toUpperCase()
                + fabricanteCarro.getHyundai().toUpperCase()
                + fabricanteCarro.getHonda().toUpperCase()
                + fabricanteCarro.getVolksvagem().toUpperCase()
                + " |COR = " + modelCor.getAzul().toUpperCase()
                + modelCor.getCinza().toUpperCase()
                + modelCor.getPrata().toUpperCase()
                + modelCor.getPreto().toUpperCase()
                + " | MODELO CARRO = " + modelModeloCarro.getSuvs().toUpperCase()
                + modelModeloCarro.getSedans().toUpperCase()
                + modelModeloCarro.getHatchs().toUpperCase()
                + " | KM = " + modelKm.getNovo().toUpperCase()
                + modelKm.getSeminovo().toUpperCase()
                + modelKm.getUsado().toUpperCase();
    }

}
