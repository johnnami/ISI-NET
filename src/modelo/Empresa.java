package modelo;


public class Empresa {
    String razaoSocial;
    String cnpj;
    String ramoMercado;

    public Empresa(String razaoSocial, String cnpj, String ramoMercado) {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.ramoMercado = ramoMercado;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRamoMercado() {
        return ramoMercado;
    }

    public void setRamoMercado(String ramoMercado) {
        this.ramoMercado = ramoMercado;
    }
}
