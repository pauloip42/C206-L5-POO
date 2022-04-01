public class Funcionario {

    //Atributos
    String nome;
    int idade;
    int cpf;
    double salario;

    //Métodos de um funcionário

    Funcionario(String nome, int idade, int cpf, double salario){ // construtor
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.idade = idade;
        System.out.println("Um funcionário foi efetivado\n");
    }

    Funcionario(){ //sobrecarga de métodos

    }

    void tirarFerias(String mes){
        System.out.println(this.nome + "Tirou Férias em " + mes);
    }
    void mostraInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Nome: " + this.idade);
        System.out.println("Nome: " + this.cpf);
        System.out.println("Nome: " + this.salario);
        System.out.println("\n");
    }

    double calculaSalarioAnual() {
//        double salarioAnual;
//        salarioAnual = this.salario * 12;
//        return salario;
        return this.salario*12;
    }

    double calculaSalarioAnual(double decimoTerceiro){
        return this.salario*12 + decimoTerceiro;
    }
}
