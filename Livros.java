import java.util.Scanner;
import java.util.ArrayList;

public class Livros {
    static String Operacao() {
        String operacao = """
                
                ===================
                Escolha a Operação:
                
                Adicionar Livro [1]
                Listar Livros [2]
                Editar Livro [3]
                Remover Livro [4]
                Sair [5]
                
                ===================
                """;
        return operacao;
    }

    static String Adicionar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite nome do livro e autor: ");
        return scanner.nextLine();
    }

    //static void Listar() {}

    //static void Editar() {}

    //static void Remover() {}

    static void Execucao() {
        ArrayList<String> livros = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(Operacao());
            System.out.println("Digite um número: ");
            int operacaoi = scanner.nextInt();

            if (operacaoi == 1) {
                String livro = Adicionar();
                livros.add(livro);
            }
            // else if (operacaoi == 2) {
            // }

            // else if (operacaoi == 3) {
            // }

            // else if (operacaoi == 4) {
            // }

            else if (operacaoi == 5){
                System.out.println("Obrigado por usar nosso sistema, operação finalizada");
                break;
            }
            else {
                System.out.println("Número inválido, tente outra operação");
                continue;
            }
        }
    }

    public static void main (String[] args) {
        Execucao();
    }
}

//Lista e scanner fora do looping para não criar novos
//Pode retornar o scanner