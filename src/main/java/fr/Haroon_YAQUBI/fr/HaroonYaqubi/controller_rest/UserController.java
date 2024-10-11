package fr.Haroon_YAQUBI.fr.HaroonYaqubi.controller_rest;

import com.fasterxml.jackson.annotation.JsonView;
import fr.Haroon_YAQUBI.fr.HaroonYaqubi.Json_Views.JsonViews;
import fr.Haroon_YAQUBI.fr.HaroonYaqubi.entity.User;
import fr.Haroon_YAQUBI.fr.HaroonYaqubi.serivce.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/user")
public class UserController {

    private UserService userService;

    @GetMapping("/{id}")
    @JsonView(JsonViews.RegionShowView.class)
    public User show (@PathVariable String id) {
        return userService.findById(id);
    }
}
