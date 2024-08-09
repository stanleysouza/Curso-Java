package br.com.cod3r.exerciciossb.controllers;

import br.com.cod3r.exerciciossb.model.entities.Produto;
import br.com.cod3r.exerciciossb.model.repositories.ProdutoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
    public @ResponseBody Produto novoProduto(@Valid Produto produto){
//        Produto produto = new Produto(nome,preco,desconto);
        produtoRepository.save(produto);
        return produto;
    }

    @GetMapping
    public Iterable<Produto> obterProdutos(){
        Iterable<Produto> produtos = produtoRepository.findAll();
        return produtos;
    }

    @GetMapping("/nome/{partenome}")
    public List<Produto> obterProdutosPorNome(@PathVariable String partenome){
        List<Produto> produtos = produtoRepository.findBynomeContainingIgnoreCase(partenome);
        return produtos;
    }

    @GetMapping("/pagina/{numeroPagina}")
    public ResponseEntity<Page<Produto>> obterProdutosPorPagina(@PathVariable int numeroPagina){
        Pageable page = PageRequest.of(numeroPagina,3);
        Page<Produto> produtos = produtoRepository.findAll(page);
        return ResponseEntity.ok(produtos);
    }

    @GetMapping("/{id}")
    public Optional<Produto> obterProdutosporId(@PathVariable int id){
        Optional<Produto> produto = produtoRepository.findById(id);
        return produto;
    }

    @DeleteMapping("/{id}")
    public void excluirProduto(@PathVariable int id){
        produtoRepository.deleteById(id);
    }

}
