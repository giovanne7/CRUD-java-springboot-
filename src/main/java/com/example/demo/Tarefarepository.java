package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

interface TarefaRepository extends JpaRepository<Tarefa, Long> {
}

