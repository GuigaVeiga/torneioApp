package br.com.torneio.util;

import br.com.torneio.modelo.CaboDeGuerra;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author ADM
 */
public class CaboDeGuerraDAOHibernate implements CaboDeGuerraDAO{
    
    private Session session;

	public void setSession(Session session) {
		this.session = session;
	}

	public void salvar(CaboDeGuerra caboDeGuerra) {
		this.session.save(caboDeGuerra);
	}

	public void atualizar(CaboDeGuerra caboDeGuerra) {
		this.session.update(caboDeGuerra);
	}

	public void excluir(CaboDeGuerra cadastro) {
		this.session.delete(cadastro);
	}

	public CaboDeGuerra carregar(Integer codigo) {
		return (CaboDeGuerra) this.session.get(CaboDeGuerra.class, codigo);
	}

	public List<CaboDeGuerra> listar() {
		return this.session.createCriteria(CaboDeGuerra.class).list();
	}

	public CaboDeGuerra buscarPorLogin(String login) {
		String hql = "select u from Cadastro c where c.login = :login";
		Query consulta = this.session.createQuery(hql);
		consulta.setString("login", login);
		return (CaboDeGuerra) consulta.uniqueResult();
	}
    
}
