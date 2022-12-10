package deepak.auth.emailservice.emailreply;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <<Description Here>>
 * 
 * @author SantoshKalathoki
 * @version V1.0.0
 * @since V1.0,0, Jun 13, 2022
 */

@Data
@NoArgsConstructor
public class EmailReplyMessage {

  private String to;

  private String cc;

  private String subject;

  private String message;

}
