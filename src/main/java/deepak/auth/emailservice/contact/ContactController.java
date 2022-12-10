package deepak.auth.emailservice.contact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * <<Description Here>>
 * 
 * @author Deepak Shrestha
 * @version
 * @since V1.0.o, Jun 5, 2022
 */

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/contact")
public class ContactController {

  @Autowired
  private ContactService contactService;

  @PostMapping
  @ResponseStatus(code = HttpStatus.CREATED)
  public ContactResponseDto addContact(@RequestBody ContactCreateDto contactCreateDto) {
    return contactService.addContact(contactCreateDto);
  }

  @GetMapping
  @ResponseStatus(code = HttpStatus.OK)
  public ContactReponseListDto getAll() {
    return contactService.getAll();
  }

  @GetMapping("/{id}")
  @ResponseStatus(code = HttpStatus.OK)
  public ContactResponseDto getById(@PathVariable("id") Long id) {
    return contactService.getById(id);
  }

  @DeleteMapping("/{id}")
  @ResponseStatus(code = HttpStatus.NO_CONTENT)
  public void deleteContact(@PathVariable("id") Long id) {
    contactService.deleteContact(id);
  }

}
