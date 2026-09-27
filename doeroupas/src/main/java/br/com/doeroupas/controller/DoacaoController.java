
package br.com.doeroupas.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import br.com.doeroupas.entity.Doacao;
import br.com.doeroupas.service.DoacaoService;

@RestController
@RequestMapping("/doacoes")
public class DoacaoController {

    private final DoacaoService service;

    public DoacaoController(DoacaoService service) {
        this.service = service;
    }

    @PostMapping
    public Doacao salvar(@RequestBody Doacao doacao) {
        return service.salvar(doacao);
    }

    @GetMapping
    public List<Doacao> listar() {
        return service.listar();
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        service.excluir(id);
    }

    @PutMapping("/{id}")
    public Doacao atualizar(@PathVariable Long id, @RequestBody Doacao doacao) {
    return service.atualizar(id, doacao);
}
}