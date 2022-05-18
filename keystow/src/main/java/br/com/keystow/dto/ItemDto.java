package br.com.keystow.dto;

import br.com.keystow.model.Credencial;
import br.com.keystow.model.Item;
import br.com.keystow.model.TipoEnum;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class ItemDto {
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private TipoEnum tipo;
    private String nome;
    private LocalDateTime dataDaOperação;
    private Boolean favorito;
    private Boolean lixeira;
    private Credencial credencial;

    private CartaoDto cartaoDto;

    public ItemDto(Item item) {
        this.tipo = item.getTipo();
        this.nome = item.getNome();
        this.credencial = item.getCredencial();
        this.dataDaOperação = LocalDateTime.now();
        this.favorito = false;
        this.lixeira = false;
    }

    public static List<ItemDto> converter(List<Item> itens) {
        //BeanUtils.copyProperties(item, itemDto);
        return itens.stream().map(ItemDto::new).collect(Collectors.toList());
    }
}
