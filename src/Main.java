import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        boolean validarEntrada = false;
        int menuPrincipal = -1;
        int subMenu;

        while(menuPrincipal != 0){
            try {
                System.out.println("Ecolha o tipo do Imovel");
                System.out.println("1. --Terreno--");
                System.out.println("2. --Residencial--");
                System.out.println("3. --Comercial--");
                System.out.println("4. --Industrial--");
                System.out.println("0. --Finalizar o Programa--");

                menuPrincipal = Integer.parseInt(leitor.nextLine());

                switch (menuPrincipal) {
                    case 1:
                        System.out.printf("Insira o m² do terreno: ");
                        Terreno terreno = new Terreno(BigDecimal.valueOf(Integer.parseInt(leitor.nextLine())));
                        terreno.calculoDaTaxaDoLixo();
                        break;
                    case 2:
                        System.out.println("Insira o m² da Residencia");
                        Residencial residencial = new Residencial(BigDecimal.valueOf(Integer.parseInt(leitor.nextLine())));
                        residencial.calculoDaTaxaDoLixo();
                        break;
                    case 3:
                        System.out.println("1. --Comercios: Restaurantes, Lanchonetes, Mercados e similares--" + System.lineSeparator() +
                                "2. -- Demais Comercios--");
                        subMenu = Integer.parseInt(leitor.nextLine());
                        switch (subMenu) {
                            case 1:
                                System.out.println("Insira o m² do Comercio");
                                Comercial comercial = new Comercial(BigDecimal.valueOf(Integer.parseInt(leitor.nextLine())));
                                comercial.calculoDaTaxaDoLixo();
                                break;
                            case 2:
                                System.out.println("Insira o m² do Comercio");
                                Comercial comercial1 = new Comercial(BigDecimal.valueOf(Integer.parseInt(leitor.nextLine())));
                                comercial1.setTaxaDoLixo(BigDecimal.valueOf(0.13));
                                comercial1.calculoDaTaxaDoLixo();
                                break;
                        }
                        break;
                    case 4:
                        System.out.println("Insira o m² da Industria: ");
                        Industriais industriais = new Industriais(BigDecimal.valueOf(Integer.parseInt(leitor.nextLine())));
                        industriais.calculoDaTaxaDoLixo();
                        break;
                    case 0:
                        System.out.println("Programa Finalizado");
                        break;
                    default:
                        throw new IllegalArgumentException("Opcao invalida");
                }

            } catch (NumberFormatException a){
                System.err.println("Insira somente numeros: "  + a.getMessage());
            } catch(IllegalArgumentException e){
                System.err.println("Ocorreu um erro: " + e.getMessage());
            }
        }
    }
}