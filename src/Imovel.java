import java.math.BigDecimal;
import java.math.RoundingMode;

//Criacao da classe e seus atributos
public class Imovel {
    protected String tipo;
    protected BigDecimal metros2;
    protected BigDecimal taxaDoLixo;
    protected BigDecimal limite;

    //Construtor da classe, impede que o objeto seja criado sem valor(evita erros)
    public Imovel(String tipo, BigDecimal metros2, BigDecimal taxaDoLixo, BigDecimal limite){
        this.tipo = tipo;
        this.taxaDoLixo = taxaDoLixo;
        this.metros2 = metros2;
        this.limite = limite;
        validacaoDoTipo(tipo);
        validacaoMetros2(metros2);
        validacaoTaxaDoLixo(taxaDoLixo);
        validacaoLimite(limite);

    }
    //Validacao ao instancia o atributo do objeto, gera um erro controlado, que evita de crashar o software
    public void validacaoDoTipo(String tipo){
        if (tipo == null || tipo.isBlank()){
            throw new IllegalArgumentException("Tipo de Imovel Invalido");
        }
    }
    public void validacaoLimite(BigDecimal limite){
        if (limite == null || limite.compareTo(BigDecimal.ZERO) <= 0){
            throw new IllegalArgumentException("Limite de Metragem esta vazio ou incorreto");
        }
    }
    public void validacaoMetros2(BigDecimal metros2){
        if (metros2 == null || metros2.compareTo(BigDecimal.ZERO) <= 0 ){
            throw new IllegalArgumentException("Metragem inserida invalida");
        }
    }
    public void validacaoTaxaDoLixo(BigDecimal taxaDoLixo){
        if (taxaDoLixo == null || taxaDoLixo.compareTo(BigDecimal.ZERO) <= 0){
            throw new IllegalArgumentException("Taxa do lixo inserida invalida");
        }
    }

    public void setTipo(String tipo){
        validacaoDoTipo(tipo);
        this.tipo = tipo;
    }
    public void setMetros2(BigDecimal metros2){
        validacaoMetros2(metros2);
        this.metros2 = metros2;
    }
    public void setTaxaDoLixo(BigDecimal taxaDoLixo){
        validacaoTaxaDoLixo(taxaDoLixo);
        this.taxaDoLixo = taxaDoLixo;
    }
    public BigDecimal getLimite(){return  this.limite;}
    public String getTipo(){return this.tipo;}
    public BigDecimal getMetros2(){return this.metros2;}
    public BigDecimal getTaxaDoLixo(){return this.taxaDoLixo;}

    public void calculoDaTaxaDoLixo(){
        BigDecimal valorMensal = metros2.multiply(taxaDoLixo);
        BigDecimal valorAnual = valorMensal.multiply(BigDecimal.valueOf(12));
        BigDecimal descontoParcelaPaga = valorAnual.subtract(valorMensal);
        BigDecimal valorAtualizadoDaTaxa = descontoParcelaPaga.divide(BigDecimal.valueOf(10), 4, RoundingMode.HALF_EVEN);
    }
}
