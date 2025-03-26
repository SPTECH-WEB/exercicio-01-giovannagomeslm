package com.example.CartaoCredito.Controller;

import com.example.CartaoCredito.Model.FaturaModel;
import com.example.CartaoCredito.Service.FaturaService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/faturas")
public class FaturaController {
    private  final FaturaService faturaService;
    public FaturaController(FaturaService faturaService){
        this.faturaService=faturaService;
    }

    @PostMapping
    public ResponseEntity<FaturaModel> criarFaturas(@Valid @RequestBody FaturaModel fatura) {
        FaturaModel novaFatura = faturaService.salvar(fatura);
        return ResponseEntity.ok(novaFatura);
    }

    @GetMapping
    public List<FaturaModel> buscarFatura(@PathVariable Long id){
        return faturaService.listarTodos();
    }
}
