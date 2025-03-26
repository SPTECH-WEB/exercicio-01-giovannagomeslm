package com.example.CartaoCredito.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "faturas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FaturaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O número do cartão não pode estar em branco")
    @Pattern(regexp = "\\d{4} \\d{4} \\d{4} \\d{4}", message = "O número do Cartão deve possuir 16 dígitos")
    private String numeroCartao;

    @Size(min = 3, max = 100, message = "O Nome do titular deve possuir entre 3 e 100 caracteres")
    private String nomeTitular;

    @DecimalMin(value = "10.00", message = "O valor deve ser no mínimo 10.00")
    @DecimalMax(value = "5000.00", message = "O valor deve ser no máximo 5000.00")
    private Double valor;

    @FutureOrPresent(message = "A data de Pagamento deve ser uma data atual ou futura")
    private LocalDate dataPagamento;

    @Email(message = "O e-mail deve ser válido")
    private String emailContato;
}
