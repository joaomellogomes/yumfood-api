package br.com.reignited.yumfood.api.model.input;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class UsuarioInput {

    @NotBlank
    private String nome;

    @Email
    @NotBlank
    private String email;

}
