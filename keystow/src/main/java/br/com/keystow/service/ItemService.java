package br.com.keystow.service;

import org.springframework.stereotype.Service;

import br.com.keystow.dto.ItemDto;
import br.com.keystow.form.ItemFormCredencial;
import br.com.keystow.model.Credencial;
import br.com.keystow.model.Item;
import br.com.keystow.repository.CredencialRepository;
import br.com.keystow.repository.ItemRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class ItemService {

  private final ItemRepository itemRepository;
  private final CredencialRepository credencialRepository;

  public ItemDto salvarItemCredencial(ItemFormCredencial itemFormCredencial) {

    var credencial = new Credencial(itemFormCredencial.getCredencialCampoDeUsuario(),
        itemFormCredencial.getCredencialSenha(), itemFormCredencial.getCredencialUri());

    var credencialSalva = credencialRepository.save(credencial);

    var item = new Item(itemFormCredencial.getTipo(), itemFormCredencial.getNome(),
        itemFormCredencial.getFavorito(), itemFormCredencial.getLixeira(), credencialSalva);

    return new ItemDto(itemRepository.save(item));
  }

}
