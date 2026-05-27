package Ex1.controller;

import Ex1.model.Produto;
import Ex1.model.Usuario;
import Ex1.model.TipoUsuario;
import Ex1.view.ProdutoView;

public class ProdutoController {
    private ProdutoView view;

    public ProdutoController(ProdutoView view) {
        this.view = view;
    }

    public void cadastrarProduto(Usuario usuario, Produto produto) {
        if (usuario.getTipo() == TipoUsuario.ADMIN) {
            view.exibirMensagem("Produto '" + produto.getNome() + "' cadastrado com sucesso por " + usuario.getNome() + ".");
        } else {
            view.exibirMensagem("Erro: O usuário " + usuario.getNome() + " não tem permissão para cadastrar produtos.");
        }
    }
}
