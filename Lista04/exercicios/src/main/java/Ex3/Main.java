package Ex3;

import Ex3.controller.NoticiaController;
import Ex3.model.Noticia;
import Ex3.model.Usuario;
import Ex3.model.TipoUsuario;
import Ex3.view.NoticiaView;

public class Main {
    public static void main(String[] args) {
        NoticiaView view = new NoticiaView();
        NoticiaController controller = new NoticiaController(view);

        Usuario editor = new Usuario("Fernando", TipoUsuario.EDITOR);
        Usuario visitante = new Usuario("Maria", TipoUsuario.VISITANTE);

        Noticia n1 = new Noticia("Clima Hoje", "O sol deve brilhar o dia todo.");
        
        // Editor cadastra
        controller.cadastrarNoticia(editor, n1);
        
        // Visitante tenta cadastrar
        Noticia n2 = new Noticia("Nova Noticia", "Conteudo proibido.");
        controller.cadastrarNoticia(visitante, n2);

        // Ambos visualizam
        controller.visualizarNoticia(visitante, n1);
        controller.visualizarNoticia(editor, n1);
    }
}
