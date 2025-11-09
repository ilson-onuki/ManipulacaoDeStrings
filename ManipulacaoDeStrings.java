import java.util.Scanner;

public class ManipulacaoDeStrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n====== MENU DE OPERAÇÕES COM STRINGS ======");
            System.out.println("1 - Contar quantas vezes a letra 'a' aparece");
            System.out.println("2 - Verificar se uma palavra é palíndromo");
            System.out.println("3 - Inverter string (final para o início)");
            System.out.println("4 - Substituir 'a' por 'b' e contar substituições");
            System.out.println("5 - Contar número de vogais (A, E, I, O, U)");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1:
                    contarLetraA(sc);
                    break;
                case 2:
                    verificarPalindromo(sc);
                    break;
                case 3:
                    inverterString(sc);
                    break;
                case 4:
                    substituirAporB(sc);
                    break;
                case 5:
                    contarVogais(sc);
                    break;
                case 0:
                    System.out.println("Encerrando o programa... Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 0);

        sc.close();
    }

    //Contar quantas vezes a letra “a” aparece
    public static void contarLetraA(Scanner sc) {
        System.out.print("Digite um texto: ");
        String texto = sc.nextLine();

        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == 'a' || texto.charAt(i) == 'A') {
                contador++;
            }
        }
        System.out.println("A letra 'a' aparece " + contador + " vezes.");
    }

    //Verificar se uma palavra é um palíndromo
    public static void verificarPalindromo(Scanner sc) {
        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();

        String invertida = new StringBuilder(palavra).reverse().toString();

        if (palavra.equalsIgnoreCase(invertida)) {
            System.out.println("É um palíndromo!");
        } else {
            System.out.println("Não é um palíndromo.");
        }
    }

    //Imprimir uma string do final para o início
    public static void inverterString(Scanner sc) {
        System.out.print("Digite uma palavra: ");
        String texto = sc.nextLine();

        String invertido = new StringBuilder(texto).reverse().toString();
        System.out.println("String invertida: " + invertido);
    }

    //Contar quantos ‘a’ existem e substituir por ‘b’
    public static void substituirAporB(Scanner sc) {
        System.out.print("Digite uma string: ");
        String texto = sc.nextLine();

        int contador = 0;
        char[] chars = texto.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'a' || chars[i] == 'A') {
                chars[i] = 'b';
                contador++;
            }
        }

        String novoTexto = new String(chars);
        System.out.println("Número de caracteres modificados: " + contador);
        System.out.println("String modificada: " + novoTexto);
    }

    //Contar número de vogais
    public static void contarVogais(Scanner sc) {
        System.out.print("Digite uma string: ");
        String texto = sc.nextLine();

        int contador = 0;
        String vogais = "aeiouAEIOU";

        for (int i = 0; i < texto.length(); i++) {
            if (vogais.indexOf(texto.charAt(i)) != -1) {
                contador++;
            }
        }

        System.out.println("Número de vogais: " + contador);
    }
}
