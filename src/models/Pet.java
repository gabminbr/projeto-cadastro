package models;

import exceptions.InputNaoPermitidoException;

import java.util.List;

public class Pet {
    private List<String> nomeCompleto;
    private TipoPet tipo;
    private Sexo sexo;
    private Endereco endereco;
    private Double idadeAprox;
    private Double peso;
    private String raca;

    public Pet(List<String> nomeCompleto, String tipo, String sexo, Endereco endereco, Double idadeAprox,
                Double peso, String raca){
            this.nomeCompleto = nomeCompleto;
            this.tipo = converterTipo(tipo);
            this.sexo = converterSexo(sexo);
            this.endereco = endereco;

            if(idadeAprox < 0 || idadeAprox > 20){
                throw new InputNaoPermitidoException("Valor não permitido para idade!");
            }
            this.idadeAprox = idadeAprox;

            if (peso < 0.5 || peso >  60){
                throw new InputNaoPermitidoException("Valor não permitido para peso!");
            }
            this.peso = peso;

            if(!ehValidoRaca(raca)){
                throw new InputNaoPermitidoException("Insira apenas letras!");
            }
            this.raca = raca;
    }

    private TipoPet converterTipo(String tipo){
        return TipoPet.valueOf(tipo.toUpperCase());
    }

    private Sexo converterSexo(String sexo){
        return Sexo.valueOf(sexo.toUpperCase());
    }

    private boolean ehValidoRaca(String raca){
        String regex = "^\\p{L}+$";
        return raca.matches(regex);
    }
}
