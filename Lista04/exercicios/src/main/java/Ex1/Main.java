package Ex1;

import Ex1.controller.ProdutoController;
import Ex1.model.Produto;
import Ex1.model.Usuario;
import Ex1.model.TipoUsuario;
import Ex1.view.ProdutoView;

public class Main {
    public static void main(String[] args) {
        ProdutoView view = new ProdutoView();
        ProdutoController controller = new ProdutoController(view);

        Usuario admin = new Usuario("Ricardo", TipoUsuario.ADMIN);
        Usuario padrao = new Usuario("Joao", TipoUsuario.PADRAO);
        Produto p1 = new Produto("Notebook");
        Produto p2 = new Produto("Mouse");

        controller.cadastrarProduto(admin, p1);
        controller.cadastrarProduto(padrao, p2);
    }
}
