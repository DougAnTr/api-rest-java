package learning.spring.apirestjava.repository;

import learning.spring.apirestjava.model.UserModel;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserModel, Integer> {
}
