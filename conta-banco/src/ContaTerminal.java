import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar  Classe Scanner
         Scanner ler = new Scanner(System.in);
            String nomeCliente = "MARIO ANDRADE";
            int numeroDaConta = 1021;
            String agencia = "067-8";
            double saldo = 237.48;

        System.out.printf("Informe o nome cliente: ");
            nomeCliente= ler.nextLine();

        System.out.printf("Informe o numero da Conta: ");
            numeroDaConta = ler.nextInt();

        System.out.printf("Informe a agencia: ");
            agencia = ler.next();
        
        //Exibir as mensagens para o nosso usuario
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroDaConta +" e seu saldo " + saldo + ". já está disponível para saque.");

       // System.out.println(nomeCliente);
       //  System.out.println(agencia);
       // System.out.println(numero);A
       // System.out.println(saldo);


        //Obter pela scanner os valores digitados no terminal

        //Exibir a mensagem conta criada
    }
}
