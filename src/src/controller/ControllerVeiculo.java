package controller;


import model.CMVeiculo;
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

    public void cadastrarVeiculo(T veiculos) {
        veiculos.add(veiculos);
    }

    public List<T> listarVeiculos() {
        return veiculos;
    }

    public List<CMVeiculo> pesquisarVeiculo(String modelo) {
        List<CMVeiculo> veiculosEncontrados = new ArrayList<>();
        List<? extends CMVeiculo> veiculos = listarVeiculos();
        for (int i = 0; i < veiculos.size(); i ++) {
            if (veiculos.get(i).getModelModeloCarro().getHatchs().contains(modelo)||veiculos.get(i)
                    .getModelModeloCarro().getSedans().contains(modelo)||veiculos.get(i).getModelModeloCarro()
                    .getSuvs().contains(modelo)) {
                veiculosEncontrados.add(veiculos.get(i));
            }
            else {
                System.out.println("Veiculo não encontrado. ");
            }
        }
        return veiculosEncontrados;
    }

    public CMVeiculo veiculoExistente(String placa) {
        for (CMVeiculo veiculoExistente: veiculos) {
            if (placa.equals(veiculoExistente.getPlaca())) {
                return veiculoExistente;
            }
        }
        return null;
    }
}
