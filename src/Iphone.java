public class Iphone implements AparelhoTelefonico{

        private String modelo;
        private String cor;

        public Iphone(String modelo, String cor) {
            this.modelo = modelo;
            this.cor = cor;
        }

        public Iphone(){
            
        }

        public void ligarIphone() {
            System.out.println("iPhone ligado");
        }

        public void desligarIphone() {
            System.out.println("iPhone desligado");
        }

        public void tocarMusica() {
            System.out.println("Reproduzindo música no iPhone");
        }

        public void fazerLigacao() {
            System.out.println("Fazendo uma chamada telefônica");
        }

    @Override
    public void ligar() {

    }

    @Override
    public void desligar() {

    }

    @Override
    public void fazerChamada() {

    }

    @Override
    public void receberChamada() {

    }

    public void enviarMensagem() {
            System.out.println("Enviando uma mensagem de texto");
        }

        public void navegarInternet() {
            System.out.println("Navegando na internet com o iPhone");
        }
    }

