package br.com.keystow.repository;

import br.com.keystow.model.Credencial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CredencialRepository extends JpaRepository<Credencial, Long> {

}
