import java.util.Scanner;  //traz o scannner

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);  //scanner

        System.out.println("Digite o primeiro parâmetro:"); //pede o n.°
        int parametroUm = terminal.nextInt();//pega o n.°

        System.out.println("Digite o segundo parâmetro:");// pede outro n.°
        int parametroDois = terminal.nextInt();//pega outro n.°

        try {//tenta contar
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {//se não der manda pra excessão
            System.out.println(exception.getMessage());
        } finally {//fecha o terminal para não dar erro
            terminal.close();
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {//se 1 for maior q 2 lança a excessão
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm; // vê a diferença dos números

        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);//conta a diferença
        }
    }
}



