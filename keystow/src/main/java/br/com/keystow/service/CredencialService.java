package br.com.keystow.service;

import java.util.List;

import javax.transaction.Transactional;

import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import br.com.keystow.dto.CredencialDto;
import br.com.keystow.model.Credencial;
import br.com.keystow.repository.CredencialRepository;
@AllArgsConstructor
@Service
public class CredencialService {

//    private final Credencial credencial;
//    private final CredencialRepository credencialRepository;
//
//    public List<Credencial> findAll() {
//        return credencialRepository.findAll();
//    }
//
//    public Credencial create(CredencialDto credencialDto) {
//        BeanUtils.copyProperties(credencialDto, credencial);
//        return credencialRepository.save(credencial);
//    }
}
