package model;

import java.util.Objects;

public class ModelClientePF extends ModelCliente {

    /*variaveis e contantes da classe*/
    private String cpf;
    public ModelClientePF(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
    }
    /*São os metodos da instancia*/
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if (!(o instanceof ModelClientePF clientePF)) return false;
        return getCpf().equals(clientePF.getCpf());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCpf());
    }
}
