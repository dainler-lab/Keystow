package br.com.keystow.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;

import br.com.keystow.model.Cartao;
import br.com.keystow.model.Credencial;
import br.com.keystow.model.Item;
import br.com.keystow.model.TipoEnum;
import lombok.Data;

@Data
public class ItemDto {

    private Long id;
    private TipoEnum tipo;
    private String nome;
    private LocalDateTime dataDaOperacao;
    private Boolean favorito;
    private Boolean lixeira;
    private Credencial credencial;
    private Cartao cartao;

    public ItemDto(Item item) {
        BeanUtils.copyProperties(item, this);
    }

    public static List<ItemDto> converter(List<Item> itens) {
        return itens.stream().map(ItemDto::new).collect(Collectors.toList());
    }
}
