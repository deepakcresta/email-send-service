package deepak.auth.emailservice.emailreply;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/mail-reply")
public class EmailReplyController {

  @Autowired
  private EmailReplyService emailReplyService;

  @PostMapping
  @ResponseStatus(code = HttpStatus.CREATED)
  public ResponseEntity<String> replyEmail(@RequestBody EmailReplyCreateDto emailReplyCreateDto) {
    this.emailReplyService.replyEmail(emailReplyCreateDto);
    return ResponseEntity.ok("Success");
  }

}
