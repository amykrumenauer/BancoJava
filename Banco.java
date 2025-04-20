import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
    String nome =  "Pedro Henrique";
    String tipoConta = "Corrente";
    double saldo = 2499.42;
    int opcao = 0;

    System.out.println("\n-------- Dados da Conta --------");
    System.out.println("Nome: " + nome);
    System.out.println("Tipo da conta: " + tipoConta);
    System.out.println("Saldo: " + saldo);
    System.out.println("---------------------------------");

    String menu = """
    \n
            ------ Menu ------
            1 - Consultar saldo
            2 - Transferir valor
            3 - Receber valor
            4 - Sair
            --------------------
            Digite o que deseja:
           """;
   
    Scanner leitura = new Scanner(System.in);

    while (opcao != 4){
        System.out.println(menu);
        opcao = leitura.nextInt();

        if (opcao == 1){
            System.out.println("\nO saldo é R$ " + saldo);
        } else if (opcao == 2){
            System.out.println("\nQual o valor que deseja trasferir? Use vírgula");
            double valor = leitura.nextDouble();
            if(valor > saldo){
                System.out.println("\nNão há saldo para realizar a transferência");
            } else {
                saldo -= valor;
                System.out.println("\nNovo saldo R$ " + saldo);
            }
             } else if (opcao == 3){
            System.out.println("\nValor recebido R$ ");
            double valor = leitura.nextDouble();
            saldo += valor;
            System.out.println("\nNovo saldo R$ " + saldo);
          } else if (opcao != 4) {
            System.out.println("\nOpção inválida!");
        }
    }
    }
}
