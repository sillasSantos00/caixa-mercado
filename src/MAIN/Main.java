package MAIN;
import java.util.Scanner;

//switch: Ideal para comparar uma variável com múltiplos valores




public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //valor total da compra
        System.out.println("Digite o valor total da compra: R$ ");
        //isso e para conseguir escrever a resposta
        double valorTOTAL = scanner.nextDouble();

        //escolher a forma de pagamento
        System.out.println("Escolha a forma de pagamento:");
        System.out.println("1 - dinheiro");
        System.out.println("2 - cartao de credito");
        System.out.println("3 - Pix");
        System.out.println("4 - xerecard");
        //selecionar uma das opcoes acima
        int opcaoPagamento = scanner.nextInt();

        //variavel para armazenar o valor final
        double valorFinal = valorTOTAL;

        //logica do pagamento
        switch (opcaoPagamento) {
            case 1: //Dinheiro
                //aplicar um desconto de 5% para pagamento em dinheiro
                valorFinal = valorTOTAL * 0.95;
                System.out.println("Pagamento em Dinheiro. Desconto de 5% aplicado.");
                break;
            case 2: // cartao de credito
                    //perguntar se deseja parcelar
                System.out.println("Deseja parcelar em quantas vezes (sem juros)? ");
                int parcelas = scanner.nextInt();
                if (parcelas > 1) {
                    valorFinal = valorTOTAL / parcelas;
                    System.out.println("pagamento em " + parcelas + "x de R$ " + valorFinal );
                } else {
                    System.out.println("Pagamento a vista no cartao");
                }
                valorFinal = valorTOTAL; // sem desconto para pagamento a vista
                break;
            case 3: //PIX
                // aplicar um desconto de 2% para pagamento por pix
                valorFinal = valorTOTAL * 0.98;
                System.out.println("Pagamento por Pix. Desconto de 2% aplicado.");
                break;
            case 4:
                valorFinal = valorTOTAL * 2.5;
                System.out.println("pagamento por xerecard. nao a desconto");
                break;
            default:
                System.out.println("Opcao de pagamento invalidado.");
                scanner.close();
                return; // sai do programa se a opcao for invalida
        }
    //exibir o valor final
        String valorFormatado = String.format("R$ %.2f", valorFinal);
        System.out.println("Valor final a ser pago: " + valorFormatado);
    // fechar o scanner
        scanner.close();
    }
}