package br.com.doeroupas.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.doeroupas.entity.Doacao;
import br.com.doeroupas.repository.DoacaoRepository;

@Service
public class DoacaoService {

    private final DoacaoRepository repository;

    public DoacaoService(DoacaoRepository repository) {
        this.repository = repository;
    }

    public Doacao salvar(Doacao doacao) {
        return repository.save(doacao);
    }

    public List<Doacao> listar() {
        return repository.findAll();
    }

    public Doacao atualizar(Long id, Doacao doacao) {
    doacao.setId(id);
    return repository.save(doacao);
}

    public void excluir(Long id) {
        repository.deleteById(id);
    }
}