public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
        public void ligar() {
            System.out.println("Ligando...");
    }
    
    @Override
        public void atender() {
            System.out.println("Ligação atendida.");
    }

    @Override
        public void iniciarCorreioVoz() {
            System.out.println("Iniciando correio de voz, aguarde por favor.");
    }

    @Override
        public void exibirPagina() {
            System.out.println("Exibindo página web.");
    }

    @Override
        public void adicionarNovaAba() {
            System.out.println("Adicionado nova aba...");
    }

    @Override
        public void atualizarPagina() {
            System.out.println("A página está sendo atualizada.");
    }

    @Override
        public void selecionarMusica() {
            System.out.println("Música selecionada.");
    }

    @Override
        public void tocar() {
            System.out.println("Tocando...");
    }

    @Override
        public void pausar() {
            System.out.println("Música pausada");
    }

}
