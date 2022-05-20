package br.com.keystow.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import br.com.keystow.dto.ItemDto;
import br.com.keystow.form.ItemFormCredencialAtualizar;
import br.com.keystow.form.ItemFormCredencialCadastro;
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

  public Item verificarItem(Long id) {
    Optional<Item> item = (itemRepository.findById(id));
    if (!item.isPresent()) {
      return null;
    }
    return item.get();
  }

  public ItemDto buscarItem(Long id) {
    return new ItemDto(verificarItem(id));
  }

  public List<ItemDto> buscarItens() {
    List<Item> itens = itemRepository.findAll();
    return ItemDto.converter(itens);
  }

  @Transactional
  public ItemDto salvarItemCredencial(ItemFormCredencialCadastro itemFormCredencialCadastro) {

    var credencial = new Credencial(itemFormCredencialCadastro.getCredencialCampoDeUsuario(),
        itemFormCredencialCadastro.getCredencialSenha(), itemFormCredencialCadastro.getCredencialUri());

    var credencialSalva = credencialRepository.save(credencial);

    var item = new Item(itemFormCredencialCadastro.getTipo(), itemFormCredencialCadastro.getNome(),
        itemFormCredencialCadastro.getFavorito(), itemFormCredencialCadastro.getLixeira(), credencialSalva);

    return new ItemDto(itemRepository.save(item));
  }

  @Transactional
  public ItemDto alterarItemCredencial(Long id, ItemFormCredencialAtualizar itemFormCredencialAtualizar) {

    var item = itemRepository.getById(id);
    item.setNome(itemFormCredencialAtualizar.getNome());
    item.setDataDaOperacao(LocalDateTime.now());
    item.setFavorito(itemFormCredencialAtualizar.getFavorito());
    item.setLixeira(itemFormCredencialAtualizar.getLixeira());

    var credencial = credencialRepository.getById(item.getCredencial().getId());
    credencial.setCampoDeUsuario(itemFormCredencialAtualizar.getCredencialCampoDeUsuario());
    credencial.setSenha(itemFormCredencialAtualizar.getCredencialSenha());
    credencial.setUri(itemFormCredencialAtualizar.getCredencialUri());

    return new ItemDto(item);
  }

  @Transactional
  public void removerItem(Long id) {
    itemRepository.deleteById(id);
  }
}
