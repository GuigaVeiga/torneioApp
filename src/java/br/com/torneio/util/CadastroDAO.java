package br.com.torneio.util;

import br.com.torneio.modelo.Cadastro;
import java.util.List;

public interface CadastroDAO {

    public void salvar(Cadastro cadastro);

    public void atualizar(Cadastro cadastro);

    public void excluir(Cadastro cadastro);

    public Cadastro carregar(Integer codigo);

    public Cadastro buscarPorLogin(String login);

    public List<Cadastro> listar();
}
