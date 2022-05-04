import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Arquivo jogosSalvos = new Arquivo();
        ArrayList<Jogo> jogos1 = new ArrayList<>();
        Arquivo a = new Arquivo();
        int op = 0;

        while (op != 10){
            Jogo jogo = new Jogo();
            System.out.println("Selecione uma opcao: ");
            System.out.println("1 - Adicionar jogo");
            System.out.println("2 - Mostrar Jogos salvos");
            System.out.println("3 - Ordenar Jogos (preco crescente)");
            System.out.println("4 - Ordenar Jogos (preco decrescente)");
            System.out.println("5 - Encerrar programa");

            op = sc.nextInt();
            sc.nextLine();

            switch (op){
                case 1:
                    System.out.println("Digite o nome do jogo: ");
                    jogo.setNome(sc.nextLine());
                    System.out.println("Digite o genero do jogo: ");
                    jogo.setGenero(sc.nextLine());
                    System.out.println("Digite o preco do jogo: ");
                    try {
                        jogo.setPreco(sc.nextDouble());
                    } catch (PrecoNegativoException e) {
                        System.out.println(e);
                        break;
                    }
                    jogosSalvos.escrever(jogo);
                    sc.nextLine();
                    break;

                case 2:
                    ArrayList<Jogo> jogos = a.ler();

                    for(Jogo jogoLer: jogos){
                        System.out.println(jogoLer.getNome());
                        System.out.println(jogoLer.getGenero());
                        System.out.println(jogoLer.getPreco());
                    }
                    break;

                case 3:
                    System.out.println("Ordenando jogos pelo preco de maneira crescente");
                    jogos1 = a.ler();
                    Collections.sort(jogos1);
                    for(Jogo jogoLer: jogos1){
                        System.out.println(jogoLer.getNome());
                        System.out.println(jogoLer.getGenero());
                        System.out.println(jogoLer.getPreco());
                    }
                    break;

                case 4:
                    System.out.println("Ordenando jogos pelo preco de maneira decrescente");
                    jogos1 = a.ler();
                    Collections.sort(jogos1);
                    Collections.reverse(jogos1);
                    for(Jogo jogoLer: jogos1){
                        System.out.println(jogoLer.getNome());
                        System.out.println(jogoLer.getGenero());
                        System.out.println(jogoLer.getPreco());
                    }
                    break;

                case 5:
                    System.out.println("Fim");
                    break;

                default:
                    System.out.println("Opcao inexistente");
                    break;
            }
//            sc.nextLine();
        }
        sc.close();
    }
}
