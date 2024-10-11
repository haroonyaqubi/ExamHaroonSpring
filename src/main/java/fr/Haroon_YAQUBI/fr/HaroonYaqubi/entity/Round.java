package fr.Haroon_YAQUBI.fr.HaroonYaqubi.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.lang.model.util.Elements;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class Round {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private int points;

    private int time;

    private Long distance;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Game game;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Coordinate origin;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Coordinate selected;
    
}
