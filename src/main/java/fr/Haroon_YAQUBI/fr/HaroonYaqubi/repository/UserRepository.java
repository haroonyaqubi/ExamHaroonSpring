package fr.Haroon_YAQUBI.fr.HaroonYaqubi.repository;

import fr.Haroon_YAQUBI.fr.HaroonYaqubi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

}
