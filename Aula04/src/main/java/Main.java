import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Biblioteca b = new Biblioteca();
        b.nome = "Biblioteca Municipal";

        boolean flag = true;

        while(flag){
            System.out.println("Opções disponíveis: ");
            System.out.println("1 - Cadastrar novo livro ");
            System.out.println("2 - Mostrar informações");
            System.out.println("3 - Sair");
            System.out.println("Sua opção: ");
            int op = sc.nextInt();
            switch (op){
                case 1:
                    sc.nextLine();
                    Livro l = new Livro();
                    System.out.println("Digite o nome do livro: ");
                    l.nome = sc.nextLine();
                    System.out.println("Digite quantas paginas tem o livro");
                    l.qtdPaginas = sc.nextInt();
                    b.cadastrarLivro(l);
                    break;

                case 2:
                    b.mostraInfo();
                    break;

                case 3:
                    System.out.println("Você saiu!");
                    flag = false;
                    break;

                default:
                    System.out.println("Opção invalida");
                    break;

            }
        }

//        //Livro l; //uma referencia para livro
//
//        //Um array de primitivos guarda valores
//        //um array de objetos guarda referencias
//        Livro[] estante = new Livro[5]; //5 referencias para livro
//
////        for (int i = 0; i < estante.length; i++) {
////            estante[i] = new Livro();
////        }
//
//        //Crio um livro e coloco na estante
//        Livro l1 = new Livro();
//        l1.nome = "Nome do Livro";
//        l1.qtdPaginas = 600;
//        estante[0] = l1;
//
//        //instanciar o livro direto no array:
//
//        estante[1] = new Livro();
//        estante[1].nome = "Nome2";
//        estante[1].qtdPaginas = 123;
//
//        for (int i = 0; i < estante.length; i++) {
//            System.out.println(estante[i]);
//        }
//
//        System.out.println(" ");
//
////        for (Livro livro :
////                estante) {
////            livro.mostraInfo();
////        }
//
//        for (int i = 0; i < estante.length; i++) {
//            if(estante[i] != null)
//                estante[i].mostraInfo();
//        }
    }
}
