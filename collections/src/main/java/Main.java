import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
//        ArrayList lista = new ArrayList(); // dado heterogeneo
//        Conta c = new Conta();
//
//        lista.add(10);
//        lista.add("Nome");
//        lista.add(true);
//        lista.add(c);
//
//        System.out.println(lista);
//
//        lista.remove(c);
//        lista.remove(3);
//
//        for (int i = 0; i < lista.size(); i++) {
//            System.out.println(lista.get(i));
//        }

//        ArrayList<Integer> inteiros = new ArrayList<>(); // dados homogeneos
//
//        inteiros.add(10);
//        inteiros.add(60);
//        inteiros.add(50);
//        inteiros.add(20);
//        inteiros.add(90);

//        System.out.println("Antes da ordenação: ");
//        System.out.println(inteiros);
//        System.out.println("");
//        System.out.println("Depois da ordenação");
//        Collections.sort(inteiros);
//        System.out.println(inteiros);
//        Collections.reverse(inteiros); //inverte lista

//        System.out.println(inteiros.indexOf(50));
//        inteiros.clear();
//        System.out.println(inteiros.isEmpty());


        ArrayList<Conta> contas = new ArrayList<>();

        Conta c1 = new Conta(110, "Dono1");
        Conta c2 = new Conta(10, "Dono2");
        Conta c3 = new Conta(130, "Dono3");
        Conta c4 = new Conta(4, "Dono4");

        contas.add(c1);
        contas.add(c2);
        contas.add(c3);
        contas.add(c4);

        System.out.println("Antes de ordenar");
        for (int i = 0; i < contas.size(); i++) {
            System.out.println("Dono da conta: " + contas.get(i).dono);
            System.out.println("Saldo em conta: " + contas.get(i).saldo);
        }

        System.out.println("");
        Collections.sort(contas);

        System.out.println("Depois de ordenar");
        for (int i = 0; i < contas.size(); i++) {
            System.out.println("Dono da conta: " + contas.get(i).dono);
            System.out.println("Saldo em conta: " + contas.get(i).saldo);
        }
    }
}
