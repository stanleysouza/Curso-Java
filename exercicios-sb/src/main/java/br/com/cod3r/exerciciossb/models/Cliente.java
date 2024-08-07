package br.com.cod3r.exerciciossb.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {

    private int id;
    private String nome;
    private String cpf;
}
