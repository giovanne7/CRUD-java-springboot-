package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    @Autowired
    private TarefaRepository repositorio;

    // CREATE
    @PostMapping
    public Tarefa criarTarefa(@RequestBody Tarefa tarefa) {
        return repositorio.save(tarefa);
    }

    // READ
    @GetMapping
    public List<Tarefa> listarTarefas() {
        return repositorio.findAll();
    }

    // READ por ID
    @GetMapping("/{id}")
    public Tarefa buscarPorId(@PathVariable Long id) {
        return repositorio.findById(id).orElse(null);
    }

    // UPDATE
    @PutMapping("/{id}")
    public Tarefa atualizarTarefa(@PathVariable Long id, @RequestBody Tarefa novaTarefa) {
        return repositorio.findById(id).map(tarefa -> {
            tarefa.setTitulo(novaTarefa.getTitulo());
            tarefa.setDescricao(novaTarefa.getDescricao());
            return repositorio.save(tarefa);
        }).orElse(null);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void deletarTarefa(@PathVariable Long id) {
        repositorio.deleteById(id);
    }
}

