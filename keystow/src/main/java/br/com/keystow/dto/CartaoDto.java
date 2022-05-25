package br.com.keystow.dto;

import org.springframework.beans.BeanUtils;

import br.com.keystow.model.Cartao;
import lombok.Data;

@Data
public class CartaoDto {
  private String titularDoCartao;
  private String numero;
  private String bandeira;
  private String mesDoVencimento;
  private String anoDoVencimento;
  private String codigoDeSeguranca;

  public CartaoDto(Cartao cartao) {
    if (cartao != null) {
      BeanUtils.copyProperties(cartao, this);
    }
  }
}
