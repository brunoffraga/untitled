package org.example.servico;

import org.example.domain.model.User;

//trocar o banco de dados.
public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
