package deepak.auth.emailservice.emailreply;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import org.springframework.stereotype.Service;

/**
 * <<Description Here>>
 * 
 * @author SantoshKalathoki
 * @version
 * @since , Jun 13, 2022
 */

@Service
public class EmailReplyService {

  public void replyEmail(EmailReplyCreateDto emailReplyCreateDto) {

    final String username = "lakathokisantosh@gmail.com";
    final String password = "onxixzzwceiyiihn\r\n";

    Properties props = new Properties();
    props.put("mail.smtp.starttls.enable", "true");
    props.put("mail.smtp.auth", "true");
    props.put("mail.smtp.host", "smtp.gmail.com");
    props.put("mail.smtp.port", "587");
    Session session = Session.getInstance(props, new javax.mail.Authenticator() {
      protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(username, password);
      }
    });

    try {
      Message message = new MimeMessage(session);
      message.setRecipients(Message.RecipientType.TO,
          InternetAddress.parse(emailReplyCreateDto.getTo()));
      message.setSubject(emailReplyCreateDto.getSubject());
      message.setText(emailReplyCreateDto.getMessage());
      if (emailReplyCreateDto.getCc() != null) {
        message.setRecipients(Message.RecipientType.CC,
            InternetAddress.parse(emailReplyCreateDto.getCc()));
      }

      Transport.send(message);
    } catch (MessagingException e) {
      throw new RuntimeException(e);
    }
  }

}

