package fr.Haroon_YAQUBI.fr.HaroonYaqubi.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(nullable = false)
    private int maximumTime;

    @Column(nullable = false)
    private boolean hasMove;

    @Column(nullable = false)
    private boolean hasPan;

    @Column(nullable = false)
    private boolean hasZoom;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @Column(nullable = false)
    private int nbRounds;

    @Column(nullable = false)
    private int getTotalPoints;

    @ManyToOne
    @JoinColumn(nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Map map;

    @OneToMany(mappedBy = "game")
    private List<Round> rounds = new ArrayList<>();
}
