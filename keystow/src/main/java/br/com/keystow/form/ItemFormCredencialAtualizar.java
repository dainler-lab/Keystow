package br.com.keystow.form;

import lombok.Data;

@Data
public class ItemFormCredencialAtualizar {

  private String nome;
  private Boolean favorito;
  private Boolean lixeira;
  
  private String credencialCampoDeUsuario;
  private String credencialSenha;
  private String credencialUri;
}
