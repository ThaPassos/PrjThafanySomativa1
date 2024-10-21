package com.exemple.dem.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.exemple.dem.entities.Agendamento;
public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {

}
