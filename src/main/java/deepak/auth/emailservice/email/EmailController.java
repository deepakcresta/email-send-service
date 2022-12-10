package deepak.auth.emailservice.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

/**
 * <<Description Here>>
 * 
 * @author vs
 * @version
 * @since , Jun 4, 2022
 */

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1")
public class EmailController {

  @Autowired
  private EmailSenderService emailSenderService;

  @PostMapping("/email-send")
  @ResponseStatus(code = HttpStatus.OK)
  public ResponseEntity<String> sendEmail(@RequestBody EmailMessage emailMessage) {
    this.emailSenderService.sendEmail(emailMessage);
    return ResponseEntity.ok("Success");
  }

}

