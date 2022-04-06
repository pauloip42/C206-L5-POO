public class Main {
    public static void main(String[] args) {
        Tripulante tripulante = new Tripulante("corx", "Tripulante", 10);
        tripulante.skin.setTipo("alfaiate");
        tripulante.pet.setNome("auau");

        Impostor impostor = new Impostor("roxo", "Impostor");
        impostor.skin.setTipo("Marinheiro");
        impostor.pet.setNome("Miau");

        Astronauta [] astronautas = new Astronauta[2];

        astronautas[0] = tripulante;
        astronautas[1] = impostor;

        Tripulante tri;
        Impostor imp;

        for (int i = 0; i < astronautas.length; i++) {
            astronautas[i].verCameras();
            astronautas[i].Reparar();
            astronautas[i].Reportar();
            if(astronautas[i] instanceof Tripulante){
                tri = (Tripulante) astronautas[i];
                tri.fazerMissao();
                tri.mostraInfo();
            }

            if(astronautas[i] instanceof Impostor){
                imp = (Impostor) astronautas[i];
                imp.fazerMissao();
                impostor.executar();
                imp.sabotarComunicacao();
                imp.sabotarLuz();
                imp.sabotarOxigenio();
                imp.sabotarReator();
                imp.mostraInfo();
            }

            System.out.println("\n");
        }

        System.out.println("Numero de astronautas criados: " + Astronauta.cont);

    }
}
