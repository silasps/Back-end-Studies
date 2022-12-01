package com.example.caderno.dataProvider.repository;

import com.example.caderno.dataProvider.entity.AnotacaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotaRepository extends JpaRepository<AnotacaoEntity, Long> {



}
