package fr.Haroon_YAQUBI.fr.HaroonYaqubi.repository;

import fr.Haroon_YAQUBI.fr.HaroonYaqubi.entity.Game;
import fr.Haroon_YAQUBI.fr.HaroonYaqubi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<Game, String> {
}
