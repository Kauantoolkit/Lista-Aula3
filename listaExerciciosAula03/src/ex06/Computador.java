package ex06;

public class Computador {
    private String processador;
    private int memodiaRAM;
    private int armazenamento;
    private boolean ligado;

    public Computador(String processador,int memodiaRAM, int armazenamento) {

        this.processador = processador;
        this.memodiaRAM = memodiaRAM;
        this.armazenamento = armazenamento;
        this.ligado = false;
    }

    public void ligar() {
        if(!ligado){
            ligado = true;
            System.out.println("o computador foi ligado");
        }
        else{
            System.out.println("o computador já está ligado");
        }
    }

    public void desligar() {
        if(ligado){
            ligado = false;
            System.out.println("o computador foi desligado");
        }
        else{
            System.out.println("o computador já está desligado");
        }





}}
