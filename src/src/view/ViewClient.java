package view;

import controller.ControllerCliente;
import model.ModelCliente;
import model.ModelClientePF;
import model.ModelClientePJ;
import util.ConsoleUIHelper;


import java.util.List;
import java.util.Scanner;

public class ViewClient {

    private static ControllerCliente controller;
    private ModelCliente cliente;

    public ViewClient() {
        if(controller == null) {
            controller = new ControllerCliente();
        }
    }

    public void adicionarCliente() {
        ModelCliente cliente = getCliente();
        System.out.println("\n" + controller.adicionarCliente(cliente));

    }

    public void listarClientes() {
        List<? extends ModelCliente> clientes = controller.listarClientes();

        if(!clientes.isEmpty()) {
            for (int i = 0; i < clientes.size(); i++) {
                System.out.printf("%d - %s%n", i, clientes.get(i).getNome());
            }
        } else {
            System.out.println("Oops! Não há clientes cadastrados.");
        }
    }

    public void editarCliente() {
        List<? extends ModelCliente> clientes = controller.listarClientes();

        System.out.println("Informe o index do cliente que deseja alterar:");
        this.listarClientes();

        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();

        ModelCliente clienteEditado;
        clienteEditado = getCliente();

        ModelCliente cliente = (ModelCliente) controller.listarClients(index);
        boolean confirma = ConsoleUIHelper.askConfirm("Realmente deseja alterar as informações do contato '" + cliente.getNome() + "'?"
                , "Sim"
                , "Não");

        if(confirma) {
            System.out.println("\n" + controller.editarCliente(index, clienteEditado));
        }
    }

    public ModelCliente getCliente() {
        ModelClientePF cliente;

        int tipoCliente = ConsoleUIHelper.askChooseOption("Escolha o tipo do cliente"
                , "Cliente pessoa física", "Cliente pessoa jurídica");

        String nome = ConsoleUIHelper.askNoEmptyInput("Informe o nome do cliente: ", 2);

        if (tipoCliente == 0) {
            String cpf = ConsoleUIHelper.askNoEmptyInput("Informe o CPF do cliente (somente números): ", 0);

            cliente = new ModelClientePF(nome, cpf);
        } else {
            String cnpj = ConsoleUIHelper.askNoEmptyInput("Informe o CNPJ do cliente (somente números): ", 0);

            cliente = new ModelClientePJ(nome, cnpj);
        }

        return cliente;
    }

}

