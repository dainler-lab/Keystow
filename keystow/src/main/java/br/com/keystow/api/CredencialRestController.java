package br.com.keystow.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.keystow.dto.CredencialDto;
import br.com.keystow.model.Credencial;
import br.com.keystow.service.CredencialService;

@RestController
@RequestMapping("/api/credenciais")
public class CredencialRestController {

//    private final CredencialService credencialService;
//
//    public CredencialRestController(CredencialService credencialService) {
//
//        this.credencialService = credencialService;
//    }
//
//    @GetMapping // @RequestMapping(method = RequestMethod.GET)
//    public @ResponseBody List<Credencial> list() {
//        return credencialService.findAll();
//    }
//
//    /*
//     * @PostMapping public Credencial add(@RequestBody CredencialDto credencialDto,
//     * ItemDoCofreDto itemDoCofreDto) { return
//     * credencialService.create(credencialDto, itemDoCofreDto); }
//     */
//
//    @PostMapping
//    public Credencial add(@RequestBody CredencialDto credencialDto) {
//
//        return credencialService.create(credencialDto);
//    }


}
