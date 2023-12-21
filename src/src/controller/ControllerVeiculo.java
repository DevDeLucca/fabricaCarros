package controller;

import model.*;

public class ControllerVeiculo extends ModelVeiculo {

    public ControllerVeiculo(ModelCor cor, ModelFabricanteCarro fabricanteCarro, ModelFabricanteMotos fabricanteMotos, ModelKm km, ModelModeloCarro modeloCarro, ModelModeloMotos modeloMotos, ModelTipoDeMotor tipoDeMotor, ModelTipoDeVeiculo tipoDeVeiculo) {
        super(cor, fabricanteCarro, fabricanteMotos, km, modeloCarro, modeloMotos, tipoDeMotor, tipoDeVeiculo);
    }
}
