package br.com.keystow.api;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.keystow.dto.ItemDto;
import br.com.keystow.form.ItemFormCredencialAtualizar;
import br.com.keystow.form.ItemFormCredencialCadastro;
import br.com.keystow.service.ItemService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/itens/credenciais")
public class ItemCredencialRestController {

    private final ItemService itemService;

    @GetMapping("/{id}")
    public ResponseEntity<ItemDto> obterItemCredencial(@PathVariable Long id) {

        if (itemService.verificarItemCredencial(id) == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(itemService.buscarItemCredencial(id));
    }

    @GetMapping
    public List<ItemDto> obterItensCredenciais() {
        return itemService.buscarItensCredenciais();
    }

    @PostMapping
    public ResponseEntity<ItemDto> cadastrarItemCredencial(
            @RequestBody @Valid ItemFormCredencialCadastro itemFormCredencialCadastro,
            UriComponentsBuilder uriComponentsBuilder) {

        ItemDto itemDto = itemService.salvarItemCredencial(itemFormCredencialCadastro);

        URI uri = uriComponentsBuilder
                .path("api/itens/credenciais/{id}")
                .buildAndExpand(itemDto.getId())
                .toUri();

        return ResponseEntity.created(uri).body(itemDto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ItemDto> atualizarItemCredencial(@PathVariable Long id,
            @RequestBody @Valid ItemFormCredencialAtualizar itemFormCredencialAtualizar) {

        if (itemService.verificarItemCredencial(id) == null) {
            return ResponseEntity.notFound().build();
        }

        ItemDto itemDto = itemService.alterarItemCredencial(id, itemFormCredencialAtualizar);
        return ResponseEntity.ok(itemDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> removerItemCredencial(@PathVariable Long id) {

        if (itemService.verificarItemCredencial(id) == null) {
            return ResponseEntity.notFound().build();
        }

        itemService.removerItemCredencial(id);
        return ResponseEntity.ok().build();
    }
}