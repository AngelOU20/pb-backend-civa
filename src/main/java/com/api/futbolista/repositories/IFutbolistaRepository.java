package com.api.futbolista.repositories;

import com.api.futbolista.models.Futbolista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFutbolistaRepository extends JpaRepository<Futbolista, Long> {
}
