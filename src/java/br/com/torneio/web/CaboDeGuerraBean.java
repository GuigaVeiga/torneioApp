package br.com.torneio.web;

import br.com.torneio.controle.CaboDeGuerraRN;
import br.com.torneio.modelo.Cadastro;
import br.com.torneio.modelo.CaboDeGuerra;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.*;
import javax.faces.context.FacesContext;
import org.primefaces.context.RequestContext;
import org.primefaces.event.FlowEvent;

@ManagedBean
@ViewScoped
public class CaboDeGuerraBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private CaboDeGuerra caboDeGuerra;
    private ArrayList<CaboDeGuerra> cabosDeGuerras;
    private boolean skip;
    private Cadastro cadastro;
    private List<CaboDeGuerra> lista;
    
     public String salvar() {
        CaboDeGuerraRN caboDeGuerraRN = new CaboDeGuerraRN();
        caboDeGuerraRN.salvar(this.caboDeGuerra);
        
        return "desafioCaboDeGuerra_1.jsf";
    }
     
    public CaboDeGuerra getCaboDeGuerra() {
        return caboDeGuerra;
    }

    public void setCaboDeGuerra(CaboDeGuerra caboDeGuerra) {
        this.caboDeGuerra= caboDeGuerra;
    }
    
    public List<CaboDeGuerra> getLista() {
        if (this.lista == null) {
            CaboDeGuerraRN caboDeGuerraRN = new CaboDeGuerraRN();
            this.lista = caboDeGuerraRN.listar();
        }
        return this.lista;
    }

    public ArrayList<CaboDeGuerra> getCabosDeGuerras() {
        return cabosDeGuerras;
    }

    public void setCabosDeGuerras(ArrayList<CaboDeGuerra> cabosDeGuerras) {
        this.cabosDeGuerras = cabosDeGuerras;
    }

    public Cadastro getCadastro() {
        return cadastro;
    }

    public void setCadastro(Cadastro cadastro) {
        this.cadastro = cadastro;
    }

    public void somar() {
        int totalE1 = caboDeGuerra.getPontos1R1() + caboDeGuerra.getPontos1R2() + caboDeGuerra.getPontos1R3();
        caboDeGuerra.setTotal1(totalE1);
        int totalE2 = caboDeGuerra.getPontos2R1() + caboDeGuerra.getPontos2R2() + caboDeGuerra.getPontos2R3();
        caboDeGuerra.setTotal2(totalE2);
    }

    public void inserirEquipe() {
        cabosDeGuerras.add(caboDeGuerra);
        this.somar();
        this.salvar();
        caboDeGuerra = new CaboDeGuerra();
    }

    public void removerEquipe(CaboDeGuerra caboDeGuerra) {
        cabosDeGuerras.remove(caboDeGuerra);
    }

    public void reset() {
        RequestContext.getCurrentInstance().reset("form:panel");
    }

    public void listener() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Stopped", null));
    }

    public boolean isSkip() {
        return skip;
    }

    public void setSkip(boolean skip) {
        this.skip = skip;
    }

    public String onFlowProcess(FlowEvent event) {
        if (skip) {
            skip = false;   //reset in case user goes back
            return "confirm";
        } else {
            return event.getNewStep();
        }
    }

}
