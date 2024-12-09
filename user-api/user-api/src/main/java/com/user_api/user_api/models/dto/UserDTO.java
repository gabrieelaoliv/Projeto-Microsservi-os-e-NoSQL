package com.user_api.user_api.models.dto;
import java.time.LocalDateTime;

import com.user_api.user_api.models.User;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.validation.constraints.NotBlank;


@Getter
@Setter 
@NoArgsConstructor
@AllArgsConstructor

public class UserDTO {

    private String id;
    @NotBlank(message="Nome é obrigatório")
    private String nome;
    @NotBlank(message="CPF é obrigatório")
    private String cpf;
    private String endereco;
    @NotBlank(message="E é obrigatório")
    private String email;
    private String telefone;
    private LocalDateTime dataCadastro;    

    public static UserDTO convert (User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setNome(user.getNome());
        userDTO.setCpf(user.getCpf());
        userDTO.setEndereco(user.getEndereco());
        userDTO.setEmail(user.getEmail());
        userDTO.setTelefone(user.getTelefone());
        userDTO.setDataCadastro(user.getDataCadastro());
        return userDTO;
    }

}