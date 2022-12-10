package deepak.auth.emailservice.emailreply;

import java.io.Serializable;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EmailReplyCreateDto implements Serializable {

  private static final long serialVersionUID = 1L;

  private String to;

  private String cc;

  private String subject;

  private String message;

}
