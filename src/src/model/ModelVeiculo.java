package model;

//**Veiculo e a classe responsavel por gerenciar tudo aquilo que um carro ou uma moto pode ter
//**Como: Modelo, Cor, Marca, etc...
public class ModelVeiculo {
    private ModelCor cor;
    private ModelFabricanteCarro fabricanteCarro;
    private ModelFabricanteMotos fabricanteMotos;
    private ModelKm km;
    private ModelModeloCarro modeloCarro;
    private ModelModeloMotos modeloMotos;
    private ModelTipoDeMotor tipoDeMotor;

    public ModelVeiculo(ModelCor cor, ModelFabricanteCarro fabricanteCarro, ModelFabricanteMotos fabricanteMotos, ModelKm km, ModelModeloCarro modeloCarro, ModelModeloMotos modeloMotos, ModelTipoDeMotor tipoDeMotor, ModelTipoDeVeiculo tipoDeVeiculo) {
        this.cor = cor;
        this.fabricanteCarro = fabricanteCarro;
        this.fabricanteMotos = fabricanteMotos;
        this.km = km;
        this.modeloCarro = modeloCarro;
        this.modeloMotos = modeloMotos;
        this.tipoDeMotor = tipoDeMotor;
        this.tipoDeVeiculo = tipoDeVeiculo;
    }

    private ModelTipoDeVeiculo tipoDeVeiculo;

    public ModelCor getCor() {
        return cor;
    }

    public void setCor(ModelCor cor) {
        this.cor = cor;
    }

    public ModelFabricanteCarro getFabricanteCarro() {
        return fabricanteCarro;
    }

    public void setFabricanteCarro(ModelFabricanteCarro fabricanteCarro) {
        this.fabricanteCarro = fabricanteCarro;
    }

    public ModelFabricanteMotos getFabricanteMotos() {
        return fabricanteMotos;
    }

    public void setFabricanteMotos(ModelFabricanteMotos fabricanteMotos) {
        this.fabricanteMotos = fabricanteMotos;
    }

    public ModelKm getKm() {
        return km;
    }

    public void setKm(ModelKm km) {
        this.km = km;
    }

    public ModelModeloCarro getModeloCarro() {
        return modeloCarro;
    }

    public void setModeloCarro(ModelModeloCarro modeloCarro) {
        this.modeloCarro = modeloCarro;
    }

    public ModelModeloMotos getModeloMotos() {
        return modeloMotos;
    }

    public void setModeloMotos(ModelModeloMotos modeloMotos) {
        this.modeloMotos = modeloMotos;
    }

    public ModelTipoDeMotor getTipoDeMotor() {
        return tipoDeMotor;
    }

    public void setTipoDeMotor(ModelTipoDeMotor tipoDeMotor) {
        this.tipoDeMotor = tipoDeMotor;
    }

    public ModelTipoDeVeiculo getTipoDeVeiculo() {
        return tipoDeVeiculo;
    }

    public void setTipoDeVeiculo(ModelTipoDeVeiculo tipoDeVeiculo) {
        this.tipoDeVeiculo = tipoDeVeiculo;
    }
}
