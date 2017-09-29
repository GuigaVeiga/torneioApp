package br.com.torneio.util;

import br.com.torneio.modelo.Cadastro;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

public class CadastroDAOHibernate implements CadastroDAO {
    private Session session;

	public void setSession(Session session) {
		this.session = session;
	}

	public void salvar(Cadastro cadastro) {
		this.session.save(cadastro);
	}

	public void atualizar(Cadastro cadastro) {
		this.session.update(cadastro);
	}

	public void excluir(Cadastro cadastro) {
		this.session.delete(cadastro);
	}

	public Cadastro carregar(Integer codigo) {
		return (Cadastro)this.session.get(Cadastro.class, codigo);
	}

	public List<Cadastro> listar() {
		return this.session.createCriteria(Cadastro.class).list();
	}

	public Cadastro buscarPorLogin(String login) {
		String hql = "select u from Cadastro c where c.login = :login";
		Query consulta = this.session.createQuery(hql);
		consulta.setString("login", login);
		return (Cadastro) consulta.uniqueResult();
	}
}


