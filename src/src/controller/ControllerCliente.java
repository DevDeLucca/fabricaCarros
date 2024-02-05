package controller;

import model.ModelCliente;
import model.ModelClientePF;
import model.ModelClientePJ;
import view.ViewClient;

import java.util.ArrayList;
import java.util.List;

public class ControllerCliente<T extends ViewClient> {

    private List<T> clients;

    public ControllerCliente () {
        clients = new ArrayList<>();
    }
    public String adicionarCliente(ModelCliente cliente) {
        if(!verificaPadrao(cliente)) {
            return "O documento do cliente esta fora do padrão aceitavel.";
        }
        if(existe(cliente)) {
            clients.add(cliente);
            return "Cliente cadastrado com sucesso!";
        }
        return "Oops, Ja existe um cliente cadastrado com esse documento";
    }

    public T listarClientes(int index) {
        return clients.get(index);
    }

    public List<T> listarClients(int index) {
        return clients;
    }

    public String editarCliente(int index, T cliente) {
        if(!verificaPadrao(cliente)) {
            return "Oops! O documento informado esta fora do padrão aceitavel.";
        }
        if (existe(cliente)) {
            clients.remove(index);
            clients.add(index, cliente);
            return "Cliente alterado com sucesso!";
        }
        return "Oops! Já existe um cliente cadastrado com o documento informado.";
    }

    private boolean existe(T clienteNovo) {
        return clients.stream().noneMatch(cliente -> cliente.equals(clienteNovo));
    }


    public boolean verificaPadrao(T cliente) {
        boolean retorno = false;

        if(cliente instanceof ModelClientePF) {
            if (((ModelClientePF) cliente).getCpf().matches("\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d")
                    || ((ModelClientePF).getCpf().matches("\\d\\d\\d.\\d\\d\\d.\\d\\d\\d-\\d\\d"));
                retorno = true;
        } else if (cliente instanceof ModelClientePJ) {
            if (((ModelClientePJ) cliente).getCnpj().matches("\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d")
                    || ((ModelClientePJ)cliente).getCnpj().matches("\\d\\d.\\d\\d\\d.\\d\\d\\d/\\d\\d\\d\\d-\\d\\d"))
                retorno = true;
        }

        return retorno;
    }

}