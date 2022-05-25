package br.com.keystow.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.beans.BeanUtils;

import br.com.keystow.model.Item;
import br.com.keystow.model.TipoEnum;
import lombok.Data;

@Data
public class ItemDto {

    private Long id;

    @NotBlank @NotNull
    private TipoEnum tipo;
    
    private String nome;
    private LocalDateTime dataDaOperacao;
    private Boolean favorito;
    private Boolean lixeira;

    private CredencialDto credencialDto;
    private CartaoDto cartaoDto;

    public ItemDto(Item item) {
        BeanUtils.copyProperties(item, this);
        this.credencialDto = new CredencialDto(item.getCredencial());
        this.cartaoDto = new CartaoDto(item.getCartao());
    }

    public static List<ItemDto> converter(List<Item> itens) {
        return itens.stream().map(ItemDto::new).collect(Collectors.toList());
    }
}
