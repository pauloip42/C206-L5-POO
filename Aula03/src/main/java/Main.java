import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n1 = 5; //variavel primitiva (valor)
//        int n2 = 5;

//        Funcionario func1; // Uma referência para funcionário (endereço)
//
//        func1 = new Funcionario(); //instância de um objeto
//
//        System.out.println("Digite o nome do funcionario: ");
//        func1.nome = sc.nextLine();
//
//        Funcionario func2 = new Funcionario("Lopes",22, 1, 1200);

//        System.out.println(func1 == func2); //compara endereços
//        System.out.println(n1 == n2); //compara valores
//
//        func1.mostraInfo();
//        func2.mostraInfo();
//        double salario = func1.calculaSalarioAnual();
//        System.out.println("Func1: " + salario);
//        System.out.println("Decimo Terceiro, func1: " + func1.calculaSalarioAnual(10));

        Nave n1 = new Nave("Millenium Falcon", 200, true);
//        n1.arma.tipo = "Canhão"; //composição
//        n1.arma.poder = 100;

        Arma arma = new Arma(); //agregação
        arma.tipo = "Canhão";
        arma.poder = 100;
        n1.addArma(arma);

        n1.mostraInfo();

        sc.close();
    }
}
