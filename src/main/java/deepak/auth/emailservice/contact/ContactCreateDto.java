package deepak.auth.emailservice.contact;

import java.io.Serializable;
import lombok.Data;

@Data
public class ContactCreateDto implements Serializable {

  private static final long serialVersionUID = 1L;

  private String name;

  private String phoneNumber;

  private String email;

  private String message;

}
