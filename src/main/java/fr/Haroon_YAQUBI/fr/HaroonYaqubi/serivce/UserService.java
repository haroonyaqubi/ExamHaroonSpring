package fr.Haroon_YAQUBI.fr.HaroonYaqubi.serivce;

import fr.Haroon_YAQUBI.fr.HaroonYaqubi.entity.User;
import fr.Haroon_YAQUBI.fr.HaroonYaqubi.repository.UserRepository;
import fr.Haroon_YAQUBI.fr.HaroonYaqubi.serivce.interfaces.ServiceInterface;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService implements ServiceInterface <User, String> {

    private UserRepository userRepository;

    @Override
    public  User findById(String id) {
        return userRepository.findById(id)
                .orElseThrow(EntityNotFoundException::new);
    }
}

