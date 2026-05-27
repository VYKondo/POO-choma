package Ex2.controller;

import Ex2.model.Comentario;
import Ex2.model.Usuario;
import Ex2.model.TipoUsuario;
import Ex2.view.ComentarioView;

public class ComentarioController {
    private ComentarioView view;

    public ComentarioController(ComentarioView view) {
        this.view = view;
    }

    public void publicarComentario(Usuario usuario, Comentario comentario) {
        if (usuario.getTipo() == TipoUsuario.PADRAO) {
            view.exibirMensagem("Comentário publicado por " + usuario.getNome() + ": " + comentario.getTexto());
        } else {
            view.exibirMensagem("Erro: Usuários do tipo " + usuario.getTipo() + " não podem publicar comentários.");
        }
    }
}
