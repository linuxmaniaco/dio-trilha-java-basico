import java.sql.SQLOutput;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        /**
         * TODO
         * Conhecer e importar classe scanner
         * Exibir as mensagens para nosso usuário
         * obter pelo scanner os valores digitados no terminal
         * Exibir a mensagem "conta criada"
         */

        Scanner sc = new Scanner(System.in);

        int agencia;
        String conta;
        String nome;
        double saldo = 0;

        System.out.println("Olá Como se chama? ");
        nome = sc.nextLine();
        System.out.println("Seja bem vindo, " + nome);

        System.out.println("Me informe seus dados");
        System.out.println("Qual número da sua agência:");
        agencia = sc.nextInt();
        sc.nextLine();
        System.out.println("Agora o número da conta: ");
        conta = sc.nextLine();
        System.out.println("Quanto quer depositar: ");
        saldo = sc.nextDouble();


        System.out.println("Olá " +nome+", obrigado por criar uma conta em nosso banco, sua agência é: "+agencia+", conta: "+conta+" e seu saldo "+saldo+" já está disponivel para saque.");



    }
}