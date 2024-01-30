package controller;

import model.ModelClientePF;
import view.ViewClient;

import java.util.ArrayList;
import java.util.List;

public class ControllerCliente<T extends ViewClient> {

    private List<T> clients;

    public ControllerCliente () {
        if(clients == null) {
            clients = new ArrayList<>();
        }
    }
    public String adicionarCliente(T cliente) {
        if(!verificaPadrao(cliente)) {
            return "O documento do cliente esta fora do padrão aceitavel.";
        }
        if(!existe(cliente)) {
            clients.add(cliente);
            return "Cliente cadastrado com sucesso!";
        }
        return "Oops, Ja existe um cliente cadastrado com esse documento";
    }

    public T listarClientes(int index) {
        return clients.get(index);
    }

    public List<T> listarClients() {
        return clients;
    }

    public String editarCliente(int index, T cliente) {
        if(!verificaPadrao(cliente)) {
            return "Oops! O documento informado esta fora do padrão aceitavel.";
        }
        if (!existe(cliente)) {
            clients.remove(index);
            clients.add(index, cliente);
            return "Cliente alterado com sucesso!";
        }
        return "Oops! Já existe um cliente cadastrado com o documento informado.";
    }

    private boolean existe(T clienteNovo) {
        return clients.stream().anyMatch(cliente -> cliente.equals(clienteNovo));
    }


    public boolean verificaPadrao(T cliente) {
        boolean retorno = false;

        if(cliente instanceof ModelClientePF) {
            if (((ModelClientePF) cliente).getCpf().matches("\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d")
                    || ((ModelClientePF).getCpf().matches("\\d\\d\\d.\\d\\d\\d.\\d\\d\\d-\\d\\d"))
                retorno = true;
        } else if (cliente instanceof ClientePJ) {
            if (((ClientePJ) cliente).getCnpj().matches("\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d")
                    || ((ClientePJ) cliente).getCnpj().matches("\\d\\d.\\d\\d\\d.\\d\\d\\d/\\d\\d\\d\\d-\\d\\d"))
                retorno = true;
        }

        return retorno;
    }

}