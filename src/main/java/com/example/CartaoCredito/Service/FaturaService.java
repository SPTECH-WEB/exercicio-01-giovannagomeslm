package com.example.CartaoCredito.Service;

import com.example.CartaoCredito.Model.FaturaModel;
import com.example.CartaoCredito.Repository.FaturaRepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class FaturaService {
    private final FaturaRepository faturaRepository;
    public FaturaService(FaturaRepository faturaRepository){
        this.faturaRepository=faturaRepository;
    }

    public FaturaModel salvar(FaturaModel fatura) {
        return faturaRepository.save(fatura);
    }

    public List<FaturaModel> listarTodos(){
        return faturaRepository.findAll();
    }
}
