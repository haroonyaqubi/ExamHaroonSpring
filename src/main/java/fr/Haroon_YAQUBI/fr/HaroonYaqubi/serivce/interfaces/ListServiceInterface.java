package fr.Haroon_YAQUBI.fr.HaroonYaqubi.serivce.interfaces;

import fr.Haroon_YAQUBI.fr.HaroonYaqubi.entity.Game;

import java.util.List;

public interface ListServiceInterface<T> {

    List<T> list();

    Game findById(String id);
}
