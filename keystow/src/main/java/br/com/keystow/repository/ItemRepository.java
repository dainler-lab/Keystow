package br.com.keystow.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.keystow.model.Item;

//@Repository - POR SER INTERFACE NAO PRECISA DA ANOTAÇÃO PQ O SPRING JÁ ENCONTRA
public interface ItemRepository extends JpaRepository<Item, Long> {

}
