package br.com.keystow.config;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ErroDeParamDto {
  private String campo;
  private String erro;
}
