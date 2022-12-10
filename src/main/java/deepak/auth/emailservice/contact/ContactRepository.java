package deepak.auth.emailservice.contact;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * <<Description Here>>
 * 
 * @author Santosh Kalathoki
 * @version V1.0.0
 * @since V1.0.0, Jun 5, 2022
 */

@Repository
public interface ContactRepository extends CrudRepository<Contact, Long> {

}
