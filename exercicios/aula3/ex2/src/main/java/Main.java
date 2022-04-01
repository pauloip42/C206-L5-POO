public class Main {
    public static void main(String[] args) {
        Carro uno = new Carro();

        uno.modelo = "2015";
        uno.marca = "Fiat";
        uno.motor.tipo = "Um motor ai";
        uno.motor.potencia = 110;
        uno.velocidadeMax = 150;
        uno.velocidadeAtual = 85;
        uno.cor = "Preto";
        uno.mostraInfo();
        uno.ligar();
        uno.acelerar();

    }
}
