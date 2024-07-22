package IphoneEntidade;

import iphoneInterface.AparelhoTelefonico;
import iphoneInterface.NavegadorInternet;
import iphoneInterface.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o numero: "+ numero);
    }

    @Override
    public void atender() {
        System.out.println("ligação atendida.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de vóz em reprodução.");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Pagina atual "+ url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Solicitação de nova Aba.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualização de pagina realizada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Reproduzindo musica selecionada: "+musica);
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica.");
    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada.");
    }
}
