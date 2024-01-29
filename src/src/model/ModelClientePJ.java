package model;

import java.util.Objects;

public class ModelClientePJ extends ModelCliente{

    private String cnpj;
    public ModelClientePJ(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ModelClientePJ clientePJ)) return false;
        return getCnpj().equals(clientePJ.getCnpj());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCnpj());
    }
}
