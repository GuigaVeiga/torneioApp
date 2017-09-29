package br.com.torneio.util;

public class DAOFactory {

	public static CadastroDAO criarCadastroDAO() {
		CadastroDAOHibernate cadastroDAO = new CadastroDAOHibernate();
		cadastroDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return cadastroDAO; 
	}
        
        public static CaboDeGuerraDAO criarCaboDeGuerraDAO() {
		CaboDeGuerraDAOHibernate caboDeGuerraDAO = new CaboDeGuerraDAOHibernate();
		caboDeGuerraDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return caboDeGuerraDAO; 
	}
}	