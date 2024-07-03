import java.util.Locale;
import java.util.Scanner;

public class CalculadoraApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double valorUm;
        Double valorDois;
        String operacao;
        boolean continuar;

        do {
            System.out.println("Digite o valor um: ");
            valorUm = scanner.nextDouble();

            System.out.println("Digite a operação(+, -, *, /): ");
            operacao = scanner.next();

            System.out.println("Digite o valor dois: ");
            valorDois = scanner.nextDouble();

            System.out.println("Resultado: "+ realizarCalculo(valorUm, valorDois, operacao));

            continuar = verificarNovaOperacao();
        }while (continuar);


    }

    public static boolean verificarNovaOperacao(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Deseja realizar uma nova operação? (S ou N): ");
        return !sc.nextLine().toUpperCase(Locale.ROOT).equals("N");


    }

    public static Double realizarCalculo(Double valorUm,Double valorDois,String operacao){
        Double respostaCalculo = 0.0;

        switch (operacao){
            case "+":
               respostaCalculo = valorUm + valorDois;
               break;
            case "-":
                respostaCalculo = valorUm - valorDois;
                break;
            case "*":
                respostaCalculo = valorUm * valorDois;
                break;
            case "/":
                respostaCalculo = valorUm / valorDois;
                break;

            default:
                System.out.println("A operação é inválida =(");
        }


        return respostaCalculo;
    }
}
