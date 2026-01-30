package br.com.viacep.models;

public class Endereco {
    private String cep;
    private String logradouro;
    private String complemento;
    private String unidade;
    private String bairro;
    private String estado;
    private String regiao;
    private String ibge;
    private String gia;
    private String ddd;
    private String siafi;

    public Endereco(String cep, String logradouro, String complemento, String unidade, String bairro, String estado, String regiao, String ibge, String gia, String ddd, String siafi) {
        this.cep = cep;
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.unidade = unidade;
        this.bairro = bairro;
        this.estado = estado;
        this.regiao = regiao;
        this.ibge = ibge;
        this.gia = gia;
        this.ddd = ddd;
        this.siafi = siafi;
    }

    @Override
    public String toString() {
        return
                "cep='" + cep  +
                ", logradouro='" + logradouro +
                ", complemento='" + complemento +
                ", unidade='" + unidade +
                ", bairro='" + bairro +
                ", estado='" + estado +
                ", regiao='" + regiao +
                ", ibge='" + ibge +
                ", gia='" + gia +
                ", ddd='" + ddd +
                ", siafi='" + siafi +
                '}';
    }
}
