package fr.Haroon_YAQUBI.fr.HaroonYaqubi.controller_rest;

import com.fasterxml.jackson.annotation.JsonView;
import fr.Haroon_YAQUBI.fr.HaroonYaqubi.Json_Views.JsonViews;
import fr.Haroon_YAQUBI.fr.HaroonYaqubi.entity.Game;
import fr.Haroon_YAQUBI.fr.HaroonYaqubi.entity.User;
import fr.Haroon_YAQUBI.fr.HaroonYaqubi.serivce.GameService;
import fr.Haroon_YAQUBI.fr.HaroonYaqubi.serivce.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/game")
public class GameController {

    private GameService gameService;

    @GetMapping
    @JsonView(JsonViews.RegionListView.class)
    public List<Game> list() {
        return gameService.list();
    }

    @GetMapping("/api/game/{id}")
    @JsonView(JsonViews.RegionShowView.class)
    public Game show (@PathVariable String id) {
        return gameService.findById(id);
    }

}
