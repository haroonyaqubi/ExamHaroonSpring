package fr.Haroon_YAQUBI.fr.HaroonYaqubi.repository;

import fr.Haroon_YAQUBI.fr.HaroonYaqubi.entity.Coordinate;
import fr.Haroon_YAQUBI.fr.HaroonYaqubi.entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoordinateRepository extends JpaRepository<Coordinate, Long> {
}
