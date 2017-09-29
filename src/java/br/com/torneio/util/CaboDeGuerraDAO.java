/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.torneio.util;

import br.com.torneio.modelo.CaboDeGuerra;
import java.util.List;

public interface CaboDeGuerraDAO {
    
    public void salvar(CaboDeGuerra caboDeGuerra);

    public void atualizar(CaboDeGuerra caboDeGuerra);

    public void excluir(CaboDeGuerra caboDeGuerra);

    public CaboDeGuerra carregar(Integer codigo);

    public CaboDeGuerra buscarPorLogin(String login);

    public List<CaboDeGuerra> listar();
    
}
