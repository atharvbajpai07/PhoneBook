package repository;

import model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public class UserRepository extends JpaRepository<User, UUID> {
}
