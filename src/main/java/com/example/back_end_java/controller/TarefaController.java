package com.example.back_end_java.controller;

import org.springframework.web.bind.annotation.*;

import com.example.back_end_java.model.Tarefa;
import com.example.back_end_java.repository.TarefaRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    private final TarefaRepository tarefaRepository;

    public TarefaController(TarefaRepository tarefaRepository) {
        this.tarefaRepository = tarefaRepository;
    }

    // Listar todas as tarefas
    @GetMapping
    public List<Tarefa> listarTodas() {
        return tarefaRepository.findAll();
    }

    // Buscar tarefa por id
    @GetMapping("/{id}")
    public Optional<Tarefa> buscarPorId(@PathVariable Long id) {
        return tarefaRepository.findById(id);
    }

    // Criar nova tarefa
    @PostMapping
    public Tarefa criar(@RequestBody Tarefa tarefa) {
        return tarefaRepository.save(tarefa);
    }

    // Atualizar tarefa existente
    @PutMapping("/{id}")
    public Tarefa atualizar(@PathVariable Long id, @RequestBody Tarefa tarefaAtualizada) {
        return tarefaRepository.findById(id)
                .map(tarefa -> {
                    tarefa.setNome(tarefaAtualizada.getNome());
                    tarefa.setDataEntrega(tarefaAtualizada.getDataEntrega());
                    tarefa.setResponsavel(tarefaAtualizada.getResponsavel());
                    return tarefaRepository.save(tarefa);
                })
                .orElseGet(() -> {
                    tarefaAtualizada.setId(id);
                    return tarefaRepository.save(tarefaAtualizada);
                });
    }

    // Deletar tarefa
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        tarefaRepository.deleteById(id);
    }
}
