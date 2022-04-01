public class Main {
    public static void main(String[] args) {

//        Funcionario[] funcionarios = new Funcionario[10]; //espaço para 10 referências
        //        Professor p; // referência
        Engenheiro e = new Engenheiro("Paulo", 22, 10000, "Software");
        Professor p = new Professor("Paulo", 22, 1000000, "Paulo");
        Arquiteto a1 = new Arquiteto("Lopes", 22, 10000);

        Funcionario a = new Arquiteto("Lopes", 22, 10000);
        Funcionario e2 = new Engenheiro("Lopes", 22, 10000, "Software");

        Funcionario[] funcionarios = new Funcionario[10];

        funcionarios[0] = e;
        funcionarios[1] = p;
        funcionarios[2] = a1;

        Professor prof;

        for(int i = 0; i < funcionarios.length; i++){
            if(funcionarios[i] != null){
                if(funcionarios[i] instanceof Professor){
                    System.out.println("Esta posicao tem um professor");
                    prof = (Professor) funcionarios[i];
                    prof.corrigeProvas();
                    prof.fazAlgo();
                    prof.mostraInfo();
                } else if(funcionarios[i] instanceof Engenheiro) {
                    System.out.println("Esta posição tem um engenheiro");
                    Engenheiro eng = (Engenheiro) funcionarios[i];
                    eng.mostraInfo();
                    eng.fazAlgo();
                } else {
                    System.out.println("Esta posicao tem um arquiteto");
                    Arquiteto arq = (Arquiteto) funcionarios[i];
                    arq.mostraInfo();
                    arq.fazAlgo();
                }
            }
        }
    }
}
