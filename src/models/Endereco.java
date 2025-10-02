package models;

public class Endereco {
    private Integer numero;
    private String cidade;
    private String rua;

    public Endereco(String cidade, String rua, int numero){
        this.cidade = cidade;
        this.rua = rua;
        this.numero = numero;
    }
}
