package fr.Haroon_YAQUBI.fr.HaroonYaqubi.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserCreateDTO {


    private String username;

    private String email;

    private String password;

    private String avatar;

    private LocalDate birthedAt;

    private int level;


}
