package deepak.auth.emailservice.email;

import lombok.Data;

/**
 * <<Description Here>>
 * 
 * @author Deepak Shrestha
 * @version V1.0.0
 * @since V1.0.0, Jun 4, 2022
 */

@Data
public class EmailMessage {

  private String cc;

  private String subject;

  private String name;

  private String phoneNumber;

  private String email;

  private String message;

}
