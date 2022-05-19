package br.com.keystow.api;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.keystow.dto.ItemDto;
import br.com.keystow.form.ItemFormCredencial;
import br.com.keystow.model.Item;
import br.com.keystow.repository.ItemRepository;
import br.com.keystow.service.ItemService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/itens")
public class ItemRestController {

    private final ItemService itemService;
    private final ItemRepository itemRepository;

    @GetMapping
    public List<ItemDto> itensListDto() {
        List<Item> itens = itemRepository.findAll();
        return ItemDto.converter(itens);
    }

    @PostMapping
    public ResponseEntity<ItemDto> cadastrarItem(@RequestBody ItemFormCredencial itemFormCredencial,
            UriComponentsBuilder uriComponentsBuilder) {

        ItemDto itemDto = itemService.salvarItemCredencial(itemFormCredencial);

        URI uri = uriComponentsBuilder
                .path("/itens/{id}")
                .buildAndExpand(itemDto.getId())
                .toUri();

        return ResponseEntity.created(uri).body(itemDto);
    }
}