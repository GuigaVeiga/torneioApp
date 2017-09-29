package br.com.torneio.web;

import br.com.torneio.controle.CadastroRN;
import br.com.torneio.modelo.Cadastro;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.*;
import javax.faces.context.FacesContext;

@ManagedBean
@ApplicationScoped
public class CadastroBean implements Serializable {
    private static final long serialVersionUID = 1L; 

    private Cadastro cadastro = new Cadastro();
    private List<Cadastro> lista;
    private boolean checado;
    private  String summary; 

    public String novo(){
        this.cadastro = new Cadastro();
        return "cadastro";
    }
    public String salvar() {
        CadastroRN cadastroRN = new CadastroRN();
        cadastroRN.salvar(this.cadastro);
        
        this.cadastro = new Cadastro();
        return "checkin";
    }

    public String excluir() {
        CadastroRN cadastroRN = new CadastroRN();
        cadastroRN.excluir(this.cadastro);
        return null;
    }
    
    public String editar(){
        return "cadastro";
    }

    public List<Cadastro> getLista() {
        if (this.lista == null) {
            CadastroRN cadastroRN = new CadastroRN();
            this.lista = cadastroRN.listar();
        }
        return this.lista;
    }

    public boolean isChecado() {
        return checado;
    }

    public void setChecado(boolean checado) {
        this.checado = checado;
    }
    
    public String checkin(){
        if (this.cadastro.isCheckin()){
            this.cadastro.setCheckin(false);
            summary = "Check-in Não Realizado";
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(summary));
        }else{
            this.cadastro.setCheckin(true);
            summary = "Check-in Realizado";
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(summary));
        }
        
        return null;
        
    }
    
    
    public void addMessage() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(summary));
    }

    public Cadastro getCadastro() {
        return cadastro;
    }

    public void setCadastro(Cadastro cadastro) {
        this.cadastro = cadastro;
    }    

}
