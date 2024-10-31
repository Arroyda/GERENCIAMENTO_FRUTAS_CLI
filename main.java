import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set; // Importando o Set para evitar erro

public class main { // Corrigido: nome da classe deve começar com letra maiúscula
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> frutas = new HashSet<>(); // Criando um conjunto para armazenar frutas

        while (true) {
            try {
                // Mostra as opções disponíveis ao usuário
                System.out.println("\nEscolha uma opção:");
                System.out.println("1. Adicionar Fruta");
                System.out.println("2. Listar Frutas");
                System.out.println("3. Remover Fruta");
                System.out.println("4. Verificar Fruta Presente");
                System.out.println("5. Sair");
                System.out.print("Opção: ");

                int opcao = scanner.nextInt();
                scanner.nextLine(); // Limpa o buffer após a leitura do inteiro

                switch (opcao) {
                    case 1:
                        System.out.print("Digite o nome da Fruta: ");
                        String novaFruta = scanner.nextLine();
                        
                        // Tenta adicionar a nova fruta e verifica se já existe
                        if (frutas.add(novaFruta)) {
                            System.out.println(novaFruta + " adicionada!");
                        } else {
                            System.out.println(novaFruta + " já está presente!");
                        }
                        break;

                    case 2:
                        // Lista todas as frutas presentes no conjunto
                        System.out.println("Frutas: " + frutas);
                        break;
                        
                    case 3:
                        System.out.print("Digite o nome da Fruta para remover: ");
                        String frutaRemover = scanner.nextLine();
                        // Tenta remover a fruta e verifica se foi removida
                        if (frutas.remove(frutaRemover)) {
                            System.out.println(frutaRemover + " removida!");
                        } else {
                            System.out.println(frutaRemover + " não encontrada!");
                        }
                        break;

                    case 4:
                        System.out.print("Digite o nome da Fruta para verificar: ");
                        String frutaVerificar = scanner.nextLine();
                        // Verifica se a fruta está presente no conjunto
                        if (frutas.contains(frutaVerificar)) {
                            System.out.println(frutaVerificar + " presente no conjunto!");
                        } else {
                            System.out.println(frutaVerificar + " não encontrada no conjunto!");
                        }
                        break;

                    case 5:
                        System.out.println("Saindo...");
                        scanner.close(); // Fecha o scanner antes de sair
                        return; // Sai do método main
                        
                    default:
                        System.out.println("Opção inválida! Tente novamente!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Tente novamente!");
                scanner.nextLine(); // Limpa o buffer em caso de entrada inválida
            }
        }
    }
}
