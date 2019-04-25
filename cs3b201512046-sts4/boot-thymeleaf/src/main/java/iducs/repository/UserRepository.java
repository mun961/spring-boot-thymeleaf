package iducs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import iducs.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
