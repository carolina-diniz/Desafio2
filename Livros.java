import java.util.Scanner;
import java.util.ArrayList;

public class Livros {
    static ArrayList<String> livros = new ArrayList<String>();
    static Scanner scanner = new Scanner(System.in);

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

    static String inputlinha() {
        return scanner.nextLine();
    }

    static int inputint() {
        return scanner.nextInt();
    }

    static void Execucao() {
        while (true) {
            System.out.println(Operacao());
            System.out.println("Digite um número: ");
            int operacaoi = inputint();

            if (operacaoi == 1) {
                System.out.print("Digite nome do livro e autor: ");
                String novolivro = inputlinha();
                livros.add(novolivro);
            }
            else if (operacaoi == 2) {
                for (int i = 0; i < livros.size(); i++) {
                    System.out.print((i + 1) + ". " + livros.get(i) + "\n");
                }
            }

            else if (operacaoi == 3) {
                for (int i = 0; i < livros.size(); i++) {
                    System.out.print((i + 1) + ". " + livros.get(i) + "\n");
                }
            }

            // else if (operacaoi == 4) {
            // }

            else if (operacaoi == 5){
                System.out.println("Operação finalizada, Obrigado por usar nosso sistema!");
                break;
            }
            else {
                System.out.println("Número inválido, tente outra operação");
            }
        }
    }

    public static void main (String[] args) {
        Execucao();
    }
}

//Lista e scanner fora do looping para não criar novos
//Pode retornar o scanner
//Lista pode fora dos métodos se colocar static na frente, assim como o scanner
// só static torna o elemento global
//Como tornar em um método a estrutura:
// for (int i = 0; i < livros.size(); i++) {
//     System.out.print((i + 1) + ". " + livros.get(i) + "\n");