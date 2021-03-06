/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.torneio.web.converter;

import br.com.torneio.controle.CadastroRN;
import br.com.torneio.modelo.Cadastro;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

public class StatesConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        if (value != null && value.trim().length() > 0) {
            Integer codigo = Integer.valueOf(value);
            try {
                CadastroRN cadastroRN = new CadastroRN();
                return cadastroRN.carregar(codigo);
            } catch (Exception e) {
                throw new ConverterException("Não foi possível encontrar a categoria de código "
                        + value + ". " + e.getMessage());
            }
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {

        if (value != null) {
            Cadastro cadastro = (Cadastro) value;
            return cadastro.getId().toString();
        }
        return null;

    }

}
