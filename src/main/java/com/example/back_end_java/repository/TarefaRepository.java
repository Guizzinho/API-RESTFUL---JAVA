package com.example.back_end_java.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.back_end_java.model.Tarefa;

@Repository
public interface TarefaRepository extends JpaRepository<Tarefa, Long> {}