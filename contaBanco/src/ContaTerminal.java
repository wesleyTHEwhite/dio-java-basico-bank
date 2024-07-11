import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    /**
     * @param args
     */
    public static void main(String[] args){

        
  
        //criando o objeto scanner
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        
        
       
        System.out.println("Digite o numero da Conta!");
        int numero = scanner.nextInt();
        
    
        System.out.println("Por favor, digite o numero da Agencia!");
        String agencia = scanner.next();


        System.out.println("Digite seu nome!" );
        String nomeCliente = scanner.next();

        nomeCliente = scanner.next();

        System.out.println("Digite seu saldo!");
        double saldo = scanner.nextDouble();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println(" Olá " + nomeCliente + ",obrigado por criar uma conta em nosso banco, sua agência é "  + agencia +  ", Conta: " + numero+  " e seu saldo: " + saldo + " já está disponivel para saque. " );
        
        
        //Exibir as mensagens para o nosso usuário

        //Obter pela scanner os valores digitados no terminal

        //Exibir a mensagem conta criada
        
  }
}
