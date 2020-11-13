package com.crudprodutos.apirest.repository;

import com.crudprodutos.apirest.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    Produto findById(long id);
}
