package by.boitman.database.repository;

import by.boitman.database.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByEmailAndPassword(String email, String password);

    List<UserEntity> findAllByPasswordNotNull();

    Optional<UserEntity> findByName(String name);
    Optional<UserEntity> findByEmail(String email);
}

