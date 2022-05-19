package br.com.keystow.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.keystow.model.Credencial;

public interface CredencialRepository extends JpaRepository<Credencial, Long> {

}
