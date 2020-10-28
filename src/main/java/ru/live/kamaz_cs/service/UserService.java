package ru.live.kamaz_cs.service;

import ru.live.kamaz_cs.entity.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    void save(User user);

    User getById(int id);

    void update(User user);

    void delete(int id);

}
