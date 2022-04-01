public class Carro {
    String cor, marca, modelo;
    double velocidadeMax, velocidadeAtual;

    Motor motor = new Motor();

//    Carro() {
//        motor = new Motor();
//    }

    void ligar(){
        System.out.println("Carro ligado");
    }

    void acelerar(){
        System.out.println("Carro Acelerando");
    }

    void mostraInfo(){
        System.out.println("Cor: " + this.cor);
        System.out.println("Marca: " + this.marca);
        System.out.println("Motor: " + this.motor.tipo);
        System.out.println("Motor - Potencia: " + this.motor.potencia);
        System.out.println("Velocidade máxima: " + this.velocidadeMax);
        System.out.println("Velocidade Atual: " + this.velocidadeAtual);
    }
}
