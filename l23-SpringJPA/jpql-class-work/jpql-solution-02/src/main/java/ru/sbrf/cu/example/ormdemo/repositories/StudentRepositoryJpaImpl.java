package ru.sbrf.cu.example.ormdemo.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.sbrf.cu.example.ormdemo.models.Student;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.Optional;

// @Transactional должна стоять на методе сервиса.
// Причем, если метод не подразумевает изменения данных в БД то категорически желательно
// выставить у аннотации параметр readOnly в true.
// Но это только упражнение и транзакции мы пока не проходили.
// Поэтому, для упрощения, пока вешаем над классом репозитория
@Transactional
@Repository
public class StudentRepositoryJpaImpl implements StudentRepositoryJpa {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Student save(Student student) {
        if (student.getId() <= 0) {
            em.persist(student);
            return student;
        } else {
            return em.merge(student);
        }
    }

    @Override
    public Optional<Student> findById(long id) {
        return Optional.ofNullable(em.find(Student.class, id));
    }

    @Override
    public List<Student> findAll() {
        return em.createQuery("select s from Student s", Student.class)
                .getResultList();
    }

    @Override
    public List<Student> findByName(String name) {
        TypedQuery<Student> query = em.createQuery("select s " +
                        "from Student s " +
                        "where s.name = :name",
                Student.class);
        query.setParameter("name", name);
        return query.getResultList();
    }

    @Override
    public void updateNameById(long id, String name) {

    }

    @Override
    public void deleteById(long id) {

    }

}
