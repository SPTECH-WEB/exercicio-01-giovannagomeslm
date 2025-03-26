package com.example.CartaoCredito.Repository;

import com.example.CartaoCredito.Model.FaturaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FaturaRepository extends JpaRepository<FaturaModel,Long> {
}
