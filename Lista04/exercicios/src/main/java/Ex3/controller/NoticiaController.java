package Ex3.controller;

import Ex3.model.Noticia;
import Ex3.model.Usuario;
import Ex3.model.TipoUsuario;
import Ex3.view.NoticiaView;

public class NoticiaController {
    private NoticiaView view;

    public NoticiaController(NoticiaView view) {
        this.view = view;
    }

    public void visualizarNoticia(Usuario usuario, Noticia noticia) {
        view.exibirMensagem(usuario.getNome() + " está tentando visualizar a notícia.");
        view.exibirNoticia(noticia);
    }

    public void cadastrarNoticia(Usuario usuario, Noticia noticia) {
        if (usuario.getTipo() == TipoUsuario.EDITOR) {
            view.exibirMensagem("Notícia '" + noticia.getTitulo() + "' cadastrada com sucesso por " + usuario.getNome() + ".");
        } else {
            view.exibirMensagem("Erro: O visitante " + usuario.getNome() + " não pode cadastrar notícias.");
        }
    }
}
