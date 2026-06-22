package ecommerce;

public class Empresa extends Cliente {
    private String cnpj;

    public Empresa(String nome, String email, String cnpj) {
        super(nome, email);
        this.cnpj = cnpj;
    }

    public Empresa(String nome, Endereco endereco, String email, String cnpj) {
        super(nome, endereco, email);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    // Sobrescrita: Empresa usa CNPJ como documento principal
    @Override
    public String getDocumento() {
        return cnpj;
    }

    @Override
    public String getTipoCliente() {
        return "Empresa";
    }
}