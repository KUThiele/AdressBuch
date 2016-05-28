package hello;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Kai-UweThiele on 28.05.2016.
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Customer findById(Long id);
    Customer findByFirstNameAndLastName(String firstName, String Lastname);
}
