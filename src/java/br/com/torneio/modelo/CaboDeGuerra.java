package br.com.torneio.modelo;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class CaboDeGuerra implements Serializable {
    
    private static final long serialVersionUID = 1L; 
    
    @Id 
    @GeneratedValue  
    private Integer id; 
    private String nomeEquipe1;
    private String nomeEquipe2;
    private int pontos1R1;
    private int pontos1R2;
    private int pontos1R3;
    private int pontos2R1;
    private int pontos2R2;
    private int pontos2R3;
    private int total1;
    private int total2;
    private String round;
    
    @ManyToOne
    private Cadastro cadastro;

    public CaboDeGuerra() {

    }

    public Cadastro getCadastro() {
        return cadastro;
    }

    public void setCadastro(Cadastro cadastro) {
        this.cadastro = cadastro;
    }
    
    public Integer getId(){
        return id;
    }
    
    public void setId(Integer id){
        this.id = id;
    }

    public String getNomeEquipe1() {
        return nomeEquipe1;
    }

    public void setNomeEquipe1(String nomeEquipe) {
        this.nomeEquipe1 = nomeEquipe;
    }

    public String getNomeEquipe2() {
        return nomeEquipe2;
    }

    public void setNomeEquipe2(String nomeEquipe2) {
        this.nomeEquipe2 = nomeEquipe2;
    }

    public int getPontos1R1() {
        return pontos1R1;
    }

    public void setPontos1R1(int pontos1R1) {
        this.pontos1R1 = pontos1R1;
    }

    public int getPontos1R2() {
        return pontos1R2;
    }

    public void setPontos1R2(int pontos1R2) {
        this.pontos1R2 = pontos1R2;
    }

    public int getPontos1R3() {
        return pontos1R3;
    }

    public void setPontos1R3(int pontos1R3) {
        this.pontos1R3 = pontos1R3;
    }

    public int getPontos2R1() {
        return pontos2R1;
    }

    public void setPontos2R1(int pontos2R1) {
        this.pontos2R1 = pontos2R1;
    }

    public int getPontos2R2() {
        return pontos2R2;
    }

    public void setPontos2R2(int pontos2R2) {
        this.pontos2R2 = pontos2R2;
    }

    public int getPontos2R3() {
        return pontos2R3;
    }

    public void setPontos2R3(int pontos2R3) {
        this.pontos2R3 = pontos2R3;
    }

    public int getTotal1() {
        return total1;
    }

    public void setTotal1(int total1) {
        this.total1 = total1;
    }

    public int getTotal2() {
        return total2;
    }

    public void setTotal2(int total2) {
        this.total2 = total2;
    }
    
    public String getRound() {
        return round;
    }

    public void setRound(String round) {
        this.round = round;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.id);
        hash = 97 * hash + Objects.hashCode(this.nomeEquipe1);
        hash = 97 * hash + Objects.hashCode(this.nomeEquipe2);
        hash = 97 * hash + this.pontos1R1;
        hash = 97 * hash + this.pontos1R2;
        hash = 97 * hash + this.pontos1R3;
        hash = 97 * hash + this.pontos2R1;
        hash = 97 * hash + this.pontos2R2;
        hash = 97 * hash + this.pontos2R3;
        hash = 97 * hash + this.total1;
        hash = 97 * hash + this.total2;
        hash = 97 * hash + Objects.hashCode(this.round);
        hash = 97 * hash + Objects.hashCode(this.cadastro);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CaboDeGuerra other = (CaboDeGuerra) obj;
        if (this.pontos1R1 != other.pontos1R1) {
            return false;
        }
        if (this.pontos1R2 != other.pontos1R2) {
            return false;
        }
        if (this.pontos1R3 != other.pontos1R3) {
            return false;
        }
        if (this.pontos2R1 != other.pontos2R1) {
            return false;
        }
        if (this.pontos2R2 != other.pontos2R2) {
            return false;
        }
        if (this.pontos2R3 != other.pontos2R3) {
            return false;
        }
        if (this.total1 != other.total1) {
            return false;
        }
        if (this.total2 != other.total2) {
            return false;
        }
        if (!Objects.equals(this.nomeEquipe1, other.nomeEquipe1)) {
            return false;
        }
        if (!Objects.equals(this.nomeEquipe2, other.nomeEquipe2)) {
            return false;
        }
        if (!Objects.equals(this.round, other.round)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.cadastro, other.cadastro)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CaboDeGuerra{" + "id=" + id + '}';
    }

    
    



}
