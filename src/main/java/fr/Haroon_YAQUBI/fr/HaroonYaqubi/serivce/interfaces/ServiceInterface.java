package fr.Haroon_YAQUBI.fr.HaroonYaqubi.serivce.interfaces;

import java.util.List;

public interface ServiceInterface<T, ID> {

    T findById(ID id);

}
