package br.com.keystow.dto;

import org.springframework.beans.BeanUtils;

import br.com.keystow.model.Credencial;
import lombok.Data;

@Data
public class CredencialDto {
    private String campoDeUsuario;
    private String senha;
    private String uri;

    public CredencialDto(Credencial credencial) {
        if (credencial != null) {
            BeanUtils.copyProperties(credencial, this);
        }
    }
}
