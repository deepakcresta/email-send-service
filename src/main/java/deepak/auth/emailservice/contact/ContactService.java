package deepak.auth.emailservice.contact;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <<Description Here>>
 * 
 * @author vs
 * @version
 * @since V1.0.0, May 18, 2022
 */

@Service
public class ContactService {

  @Autowired
  public ContactRepository contactRepository;

  public ContactResponseDto addContact(ContactCreateDto contactCreateDto) {
    Contact contact = new Contact();

    contact.setName(contactCreateDto.getName());
    contact.setPhoneNumber(contactCreateDto.getPhoneNumber());
    contact.setEmail(contactCreateDto.getEmail());
    contact.setMessage(contactCreateDto.getMessage());

    Contact savedContact = contactRepository.save(contact);
    return getContactResponseDto(savedContact);
  }

  public ContactResponseDto getContactResponseDto(Contact savedContact) {
    ContactResponseDto response = new ContactResponseDto();
    if (savedContact != null) {
      response.setId(savedContact.getId());
      response.setName(savedContact.getName());
      response.setEmail(savedContact.getEmail());
      response.setPhoneNumber(savedContact.getPhoneNumber());
      response.setMessage(savedContact.getMessage());
    }
    return response;
  }

  /**
   * <<Add description here>>
   * 
   * @return
   * @author
   * @since V1.0.0, Modified In: @version, By @author
   */
  public ContactReponseListDto getAll() {
    List<ContactResponseDto> contactResponseList = new ArrayList<>();
    List<Contact> contact = (List<Contact>) contactRepository.findAll();

    for (Contact contacts : contact) {
      contactResponseList.add(getContactResponseDto(contacts));
    }
    ContactReponseListDto response = new ContactReponseListDto();
    response.setContacts(contactResponseList);
    response.setTotal((long) contact.size());

    return response;
  }

  public ContactResponseDto getById(Long id) {
    Optional<Contact> optionalContact = contactRepository.findById(id);
    if (optionalContact.isPresent()) {
      return getContactResponseDto(optionalContact.get());
    }
    return null;
  }

  /**
   * <<Add description here>>
   * 
   * @param id
   * @author Sajan K.C.
   * @since V1.0.0, Modified In: @version, By @author
   */
  @Transactional
  public void deleteContact(Long id) {
    contactRepository.deleteById(id);
  }

}
