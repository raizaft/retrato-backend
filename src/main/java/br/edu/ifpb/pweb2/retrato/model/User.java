package br.edu.ifpb.pweb2.retrato.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;

@Data
@MappedSuperclass
public abstract class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @NotEmpty(message = "O nome é obrigatório.")
    private String name;
    @NotEmpty(message = "O email é obrigatório.")
    @Email(message = "Por favor, forneça um email válido.")
    private String email;

    private LocalDate dataCriacao = LocalDate.now();

    private String city;
    private String country;
    @Transient
    private MultipartFile profilePhotoFile;
    private String profilePhotoPath;
}
