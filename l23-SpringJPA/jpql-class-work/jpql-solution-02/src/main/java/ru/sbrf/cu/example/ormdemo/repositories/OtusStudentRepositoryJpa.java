package ru.sbrf.cu.example.ormdemo.repositories;


import ru.sbrf.cu.example.ormdemo.models.OtusStudent;

import java.util.List;
import java.util.Optional;

public interface OtusStudentRepositoryJpa {
    OtusStudent save(OtusStudent student);
    Optional<OtusStudent> findById(long id);

    List<OtusStudent> findAll();
    List<OtusStudent> findByName(String name);

    void updateNameById(long id, String name);
    void deleteById(long id);
}
