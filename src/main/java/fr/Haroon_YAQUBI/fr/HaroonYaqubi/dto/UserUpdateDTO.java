package fr.Haroon_YAQUBI.fr.HaroonYaqubi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserUpdateDTO {

    private String username;

    private String avatar;

    private LocalDate birthedAt;

    private int level;
}
