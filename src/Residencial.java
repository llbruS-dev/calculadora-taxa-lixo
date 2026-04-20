import java.math.BigDecimal;
import java.math.RoundingMode;

public class Residencial extends Imovel{

    public Residencial(BigDecimal metros2){
        super("Residencial", metros2, BigDecimal.valueOf(0.13), BigDecimal.valueOf(300));

    }
    @Override
    public void calculoDaTaxaDoLixo() {
        if (metros2.compareTo(limite) > 0) {
            System.out.println("Conforme a legislação o limitador para o seu tipo de imóvel é de 300m², como seu imovel passa desse limite o calculo sera baseado no limitador" + System.lineSeparator());
            this.metros2 = limite;
        }
        BigDecimal valorMensal = metros2.multiply(taxaDoLixo);
        BigDecimal valorAnual = valorMensal.multiply(BigDecimal.valueOf(12));
        BigDecimal descontoParcelaPaga = valorAnual.subtract(valorMensal);
        BigDecimal valorAtualizadoDaTaxa = descontoParcelaPaga.divide(BigDecimal.valueOf(10), 2, RoundingMode.HALF_EVEN);

        System.out.print("Conforme verificação em sistema, o imóvel possui área construída cadastrada de " + this.metros2 + "m²," + System.lineSeparator() +
                "caracterizada como de uso RESIDENCIAL." + System.lineSeparator() +
                "Dessa forma, a Taxa de Coleta de Lixo é calculada sobre a área construída da residência." + System.lineSeparator() +
                System.lineSeparator() +
                "Cálculo mensal:" + System.lineSeparator() +
                this.metros2 + "m² x " + taxaDoLixo + " = R$ " + valorMensal + System.lineSeparator() +
                System.lineSeparator() +
                "Cálculo anual:" + System.lineSeparator() +
                "R$ " + valorMensal + " x 12 meses = R$ " + valorAnual + System.lineSeparator() +
                System.lineSeparator() +
                "Ressalta-se que, no carnê inicial do IPTU, foi lançada apenas a primeira parcela," + System.lineSeparator() +
                "no valor de R$ " + valorMensal + ", a qual foi devidamente considerada no presente cálculo." + System.lineSeparator() +
                System.lineSeparator() +
                "Assim, do valor anual apurado, foi realizado o abatimento da quantia já paga:" + System.lineSeparator() +
                "R$ " + valorAnual + " -  R$ " + valorMensal + " = R$ " + descontoParcelaPaga + System.lineSeparator() +
                System.lineSeparator() +
                "O valor remanescente de R$ " + descontoParcelaPaga + " foi lançado em guia complementar." + System.lineSeparator() +
                "Em 10 (dez) parcelas de R$ " + valorAtualizadoDaTaxa + System.lineSeparator() +
                System.lineSeparator() +
                "O procedimento adotado observa o cálculo anual da taxa, o abatimento do valor já recolhido e a distribuição do saldo remanescente conforme exibido acima.");
    }

}
