package deepak.auth.emailservice.email;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * <<Description Here>>
 * 
 * @author vs
 * @version
 * @since , Jun 5, 2022
 */

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;


@Service
public class EmailSenderService {

  @Autowired
  private JavaMailSender javaMailSender;

  // @TODO make it dynamic
  private final String toEmail = "crestadeepak1714@gmail.com";

  public void sendEmail(EmailMessage emailMessage) {
    SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
    simpleMailMessage.setFrom(emailMessage.getEmail());
    simpleMailMessage.setTo(toEmail);
    simpleMailMessage.setSubject("Contact from website");
    simpleMailMessage.setText(
        "Name:" + emailMessage.getName() + "\nPhone Number:" + emailMessage.getPhoneNumber()
            + "\nEmail:" + emailMessage.getEmail() + "\nMessage:" + emailMessage.getMessage());
    this.javaMailSender.send(simpleMailMessage);
  }

}
