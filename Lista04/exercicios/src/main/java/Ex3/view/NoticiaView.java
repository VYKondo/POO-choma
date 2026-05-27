package Ex3.view;

import Ex3.model.Noticia;

public class NoticiaView {
    public void exibirNoticia(Noticia noticia) {
        System.out.println("Lendo Notícia: " + noticia.getTitulo());
        System.out.println("Conteúdo: " + noticia.getConteudo());
    }

    public void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}
