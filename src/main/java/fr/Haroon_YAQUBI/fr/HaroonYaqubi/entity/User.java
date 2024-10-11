package fr.Haroon_YAQUBI.fr.HaroonYaqubi.entity;

import com.fasterxml.jackson.annotation.JsonView;
import fr.Haroon_YAQUBI.fr.HaroonYaqubi.Json_Views.JsonViews;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(nullable = false)
    @JsonView(JsonViews.UserMinimalView.class)
    private String username;

    @Column(nullable = false)
    @JsonView(JsonViews.UserMinimalView.class)
    private String email;

    @Column(nullable = false)
    @JsonView(JsonViews.UserMinimalView.class)
    private String password;

    @JsonView(JsonViews.UserMinimalView.class)
    private String avatar;

    @Column(nullable = false)
    @JsonView(JsonViews.UserMinimalView.class)
    private LocalDate birthedAt;

    @Column(nullable = false)
    private LocalDate createdAt;

    @Column(nullable = false)
    private int level;

    @Column(nullable = false)
    private String role;

//    @Column(nullable = false)
//    private String roles;

    @OneToMany(mappedBy = "user")
    private List<Game> games = new ArrayList<>();


}
