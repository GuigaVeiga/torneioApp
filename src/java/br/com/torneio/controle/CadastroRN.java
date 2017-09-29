package br.com.torneio.controle;

import br.com.torneio.modelo.Cadastro;
import br.com.torneio.util.CadastroDAO;
import br.com.torneio.util.DAOFactory;
import java.util.List;

public class CadastroRN {

    private CadastroDAO cadastroDAO;

    public CadastroRN() {
        this.cadastroDAO = DAOFactory.criarCadastroDAO();
    }

    public Cadastro carregar(Integer id) {
        return this.cadastroDAO.carregar(id);
    }

    public Cadastro buscarPorLogin(String login) {
        return this.cadastroDAO.buscarPorLogin(login);
    }

    public void salvar(Cadastro cadastro) {
        Integer id = cadastro.getId();
        if (id == null || id == 0){
            this.cadastroDAO.salvar(cadastro);
        } else {
            this.cadastroDAO.atualizar(cadastro);
        }

    }

    public void excluir(Cadastro cadastro) {
        this.cadastroDAO.excluir(cadastro);
    }

    public List<Cadastro> listar() {
        return this.cadastroDAO.listar();
    }

}
