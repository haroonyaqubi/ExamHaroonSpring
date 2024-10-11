package fr.Haroon_YAQUBI.fr.HaroonYaqubi.serivce;

import fr.Haroon_YAQUBI.fr.HaroonYaqubi.entity.Game;
import fr.Haroon_YAQUBI.fr.HaroonYaqubi.repository.GameRepository;
import fr.Haroon_YAQUBI.fr.HaroonYaqubi.serivce.interfaces.ListServiceInterface;
import fr.Haroon_YAQUBI.fr.HaroonYaqubi.serivce.interfaces.ServiceInterface;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class GameService implements ListServiceInterface, ServiceInterface {

    private GameRepository gameRepository;


    @Override
    public List<Game> list() {
        return gameRepository.findAll();
    }

    @Override
    public Game findById(String id) {
        return gameRepository.findById(id)
                .orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public Object findById(Object o) {
        return null;
    }
}

