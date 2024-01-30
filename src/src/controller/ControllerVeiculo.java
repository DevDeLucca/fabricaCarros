package controller;


import view.ViewVeiculo;

import java.util.ArrayList;
import java.util.List;

public class ControllerVeiculo <T extends ViewVeiculo> {
    private List <T> veiculos;


    public ControllerVeiculo() {
        if (veiculos == null) {
            veiculos = new ArrayList<>();
        }
    }




}
