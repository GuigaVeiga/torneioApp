package br.com.torneio.controle;

import br.com.torneio.modelo.CaboDeGuerra;
import br.com.torneio.util.CaboDeGuerraDAO;
import br.com.torneio.util.DAOFactory;
import java.util.List;

public class CaboDeGuerraRN {
    
    private CaboDeGuerraDAO caboDeGuerraDAO;

    public CaboDeGuerraRN() {
        this.caboDeGuerraDAO = DAOFactory.criarCaboDeGuerraDAO();
    }

    public CaboDeGuerra carregar(Integer id) {
        return this.caboDeGuerraDAO.carregar(id);
    }

    public CaboDeGuerra buscarPorLogin(String login) {
        return this.caboDeGuerraDAO.buscarPorLogin(login);
    }

    public void salvar (CaboDeGuerra caboDeGuerra) {
        this.caboDeGuerraDAO.salvar(caboDeGuerra);

    }

    public void excluir(CaboDeGuerra caboDeGuerra) {
        this.caboDeGuerraDAO.excluir(caboDeGuerra);
    }

    public List<CaboDeGuerra> listar() {
        return this.caboDeGuerraDAO.listar();
    }
    
}
