package hello;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by agup101 on 4/21/2017.
 */
public interface CustomerRepository extends MongoRepository<Customer, String> {

    public Customer findByFirstName(String firstName);
    public List<Customer> findByLastName(String lastName);

}
