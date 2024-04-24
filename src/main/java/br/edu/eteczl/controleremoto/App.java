package br.edu.eteczl.controleremoto;

public class App 
{
    public static void main( String[] args ){
        ControleRemoto ctr1 = new ControleRemoto();

        ctr1.ligar();
        ctr1.abrirMenu();
        System.out.println("...");
        ctr1.maisVolume();
        ctr1.maisVolume();
        ctr1.maisVolume();
        ctr1.play();
        ctr1.abrirMenu();

    }
}
