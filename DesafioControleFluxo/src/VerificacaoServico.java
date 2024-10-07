import java.util.Scanner;

public class VerificacaoServico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada do serviço a ser verificado
        System.out.println("Digite o serviço que você precisa de ajuda:"); 
        String servico = scanner.nextLine().trim();
        
        // Entrada do nome do cliente e os serviços contratados
        System.out.println("Digite seu nome e os serviços contratados:"); 
        String entradaCliente = scanner.nextLine().trim();
        
        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",");
        String nomeCliente = partes[0];
        boolean contratado = false;
        
        // Verifique se o serviço está na lista de serviços contratados
        for (int i = 1; i < partes.length; i++) {
            if (partes[i].equalsIgnoreCase(servico)) {
                contratado = true;
                break;
            }
        }
        
        // Saída conforme a verificação
        if (contratado) {
            System.out.println("Sim");
        } else {
            System.out.println("Nao");
        }
        
        scanner.close();
    }
}
