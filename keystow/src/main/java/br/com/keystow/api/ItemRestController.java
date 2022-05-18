package br.com.keystow.api;

import br.com.keystow.dto.ItemDto;
import br.com.keystow.model.Credencial;
import br.com.keystow.model.Item;
import br.com.keystow.model.TipoEnum;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/itens")
public class ItemRestController {

    @GetMapping
    public List<ItemDto> itemList() {

        Item item = new Item("Google", TipoEnum.CREDENCIAL,
                new Credencial("admin@gmail.com", "password@root", "google.com"));

        return ItemDto.converter(Arrays.asList(item, item, item));
    }
}