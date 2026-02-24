package iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        // Reprodutor Musical
        iphone.selecionarMusica("Gigi DAgostino - Lamours Toujours");
        iphone.tocar();
        iphone.pausar();

        // Aparelho Telefonico
        iphone.ligar("4002-8922");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        // Navegador Internet
        iphone.exibirPagina("https://dio.me");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}