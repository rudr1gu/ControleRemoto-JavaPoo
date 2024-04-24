package br.edu.eteczl.controleremoto;

public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    public void ligar() {
        this.ligado = true;
    }

    public void desligar() {
        this.ligado = false;
    }

    public void abrirMenu() {
       if(this.isLigado()){
        System.out.println("Esta ligado!");
        System.out.println("volume: " + getVolume());
        if(this.isTocando()){
            System.out.println("Esta tocando!");
        }else{
            System.out.println("Não esta tocando!");
        }
       }
    }

    public void fecharMenu() {
        System.out.println("Fechando Menu");
    }

    public void maisVolume() {
        this.setVolume(this.volume + 5);
    }

    public void menosVolume() {
        this.setVolume(this.volume - 5);
    }

    public void ligarMudo() {
        if(this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    public void desligarMudo() {
        if(this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    public void play() {
        if(this.isLigado() && !this.isTocando()){
            setTocando(true);
        }
    }

    public void pause() {
        if(this.isLigado() && this.isTocando()){
            setTocando(false);
        }
    } 
}
