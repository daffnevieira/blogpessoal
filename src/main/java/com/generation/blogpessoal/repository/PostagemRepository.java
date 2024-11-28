package com.generation.blogpessoal.repository;

import com.generation.blogpessoal.model.Postagem;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostagemRepository extends JpaRepository<Postagem, Long>{
	List<Postagem> findAllByTituloContainingIgnoreCase(String titulo);
}
