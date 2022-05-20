package br.com.keystow.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import br.com.keystow.model.TipoEnum;
import lombok.Data;

@Data
public class ItemFormCredencial {

  private TipoEnum tipo;
  @NotNull
  @NotEmpty
  private String nome;
  private Boolean favorito;
  private Boolean lixeira;
  private String credencialCampoDeUsuario;
  private String credencialSenha;
  private String credencialUri;
}
