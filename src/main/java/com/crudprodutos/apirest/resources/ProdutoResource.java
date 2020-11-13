package com.crudprodutos.apirest.resources;

import com.crudprodutos.apirest.models.Produto;
import com.crudprodutos.apirest.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api")
public class ProdutoResource {

    @Autowired
    ProdutoRepository produtoRepository;

    @GetMapping("/produtos")
    public List<Produto> getList(){
        return produtoRepository.findAll();
    }

    @GetMapping("/produtos/{id}")
    public Produto getById(@PathVariable(value="id") long id){
        return produtoRepository.findById(id);
    }

    @PostMapping("/produto")
    public Produto insert(@RequestBody Produto produto){
        return produtoRepository.save(produto);
    }

    @DeleteMapping("/produto")
    public void delete(@RequestBody Produto produto){
        produtoRepository.delete(produto);
    }

    @PutMapping("/produto")
    public Produto update(@RequestBody Produto produto){
        return produtoRepository.save(produto);
    }
}
