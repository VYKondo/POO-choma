package Ex2;

import Ex2.controller.ComentarioController;
import Ex2.model.Comentario;
import Ex2.model.Usuario;
import Ex2.model.TipoUsuario;
import Ex2.view.ComentarioView;

public class Main {
    public static void main(String[] args) {
        ComentarioView view = new ComentarioView();
        ComentarioController controller = new ComentarioController(view);

        Usuario u1 = new Usuario("Ana", TipoUsuario.PADRAO);
        Usuario u2 = new Usuario("Carlos", TipoUsuario.ADMIN);

        Comentario c1 = new Comentario("Ótimo post!");
        Comentario c2 = new Comentario("Spam de Admin.");

        controller.publicarComentario(u1, c1);
        controller.publicarComentario(u2, c2);
    }
}
