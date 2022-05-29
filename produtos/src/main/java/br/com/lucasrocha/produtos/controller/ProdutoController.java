package br.com.lucasrocha.produtos.controller;

import br.com.lucasrocha.produtos.DAO.ProdutoDAO;
import br.com.lucasrocha.produtos.model.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class ProdutoController {

    @Autowired
    ProdutoDAO produtoDAO;

    @GetMapping("/produto")
    public List<Produto> listaProdutos(){
        return produtoDAO.findAll();
    }

    @GetMapping("/produto/{id}")
    public Produto listaProdutoUnico(@PathVariable(value="id") long id){
        return produtoDAO.findById(id);
    }

    @PostMapping("/produto")
    public Produto salvaProduto(@RequestBody Produto produto){
        return produtoDAO.save(produto);
    }

    @DeleteMapping("/produto")
    public void deletaProduto(@RequestBody Produto produto){
        produtoDAO.delete(produto);
    }

    @PutMapping("/produto")
    public Produto atualizaProduto(@RequestBody Produto produto){
        return produtoDAO.save(produto);
    }

}
