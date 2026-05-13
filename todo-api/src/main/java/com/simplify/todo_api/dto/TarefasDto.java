package com.simplify.todo_api.dto;

import com.simplify.todo_api.enums.PrioridadeTarefa;
import jakarta.validation.constraints.NotBlank;

public record TarefasDto(

        @NotBlank
        String nome,
        @NotBlank
        String descricao,
        @NotBlank
        Boolean realizado,
        @NotBlank
        PrioridadeTarefa prioridade
        ) {
}
