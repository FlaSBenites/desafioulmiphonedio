import IphoneEntidade.Iphone;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        //Aparelho Telefonico
        iphone.ligar("41 98765-4321");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        //Navegador de Internet
        iphone.exibirPagina("https://web.dio.me/home");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        //Preprodução de musicas
        iphone.selecionarMusica("queen - we will rock you");
        iphone.tocar();
        iphone.pausar();

    }
}