package br.com.torneio.modelo;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.*;

@Entity
public class Cadastro implements Serializable {
   private static final long serialVersionUID = 1L; 
   
   @Id 
   @GeneratedValue  
   private Integer id; 
   /*private String nome;
   private String email;
   private String contato;
   private String dataNascimento;
   private String cidade;
   private String estado; 
   private String nomeProfessor;*/
   private String nomeEscola;
   private String equipe;
   private String desafio;
   private String evento;
   //private String nivel;
   private boolean checkin;
   
   public Cadastro(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    } 
   
    /*public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    } 

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }*/

    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    public String getDesafio() {
        return desafio;
    }

    public void setDesafio(String desafio) {
        this.desafio = desafio;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }
        

   /* public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    } */

    public boolean isCheckin() {
        return checkin;
    }

    public void setCheckin(boolean checkin) {
        this.checkin = checkin;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.id);
        /*hash = 31 * hash + Objects.hashCode(this.nome);
        hash = 31 * hash + Objects.hashCode(this.email);
        hash = 31 * hash + Objects.hashCode(this.contato);
        hash = 31 * hash + Objects.hashCode(this.dataNascimento);
        hash = 31 * hash + Objects.hashCode(this.cidade);
        hash = 31 * hash + Objects.hashCode(this.estado);
        hash = 31 * hash + Objects.hashCode(this.nomeProfessor);*/
        hash = 31 * hash + Objects.hashCode(this.nomeEscola);
        hash = 31 * hash + Objects.hashCode(this.equipe);
        hash = 31 * hash + Objects.hashCode(this.desafio);
        //hash = 31 * hash + Objects.hashCode(this.nivel);
        hash = 31 * hash + (this.checkin ? 1 : 0);
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
        final Cadastro other = (Cadastro) obj;
        if (this.checkin != other.checkin) {
            return false;
        }
        /*if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.contato, other.contato)) {
            return false;
        }
        if (!Objects.equals(this.dataNascimento, other.dataNascimento)) {
            return false;
        }
        if (!Objects.equals(this.cidade, other.cidade)) {
            return false;
        }
        if (!Objects.equals(this.estado, other.estado)) {
            return false;
        }
        if (!Objects.equals(this.nomeProfessor, other.nomeProfessor)) {
            return false;
        }*/
        if (!Objects.equals(this.nomeEscola, other.nomeEscola)) {
            return false;
        }
        if (!Objects.equals(this.equipe, other.equipe)) {
            return false;
        }
        if (!Objects.equals(this.desafio, other.desafio)) {
            return false;
        }
        /*if (!Objects.equals(this.nivel, other.nivel)) {
            return false;
        } */
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    

    
   
}
