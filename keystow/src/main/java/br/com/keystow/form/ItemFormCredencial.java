package br.com.keystow.form;

import br.com.keystow.model.TipoEnum;
import lombok.Data;

@Data
public class ItemFormCredencial {

  private TipoEnum tipo;
  private String nome;
  private Boolean favorito;
  private Boolean lixeira;
  private String credencialCampoDeUsuario;
  private String credencialSenha;
  private String credencialUri;
}
