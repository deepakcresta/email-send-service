package deepak.auth.emailservice.contact;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContactResponseDto {

  private Long id;

  private String name;

  private String phoneNumber;

  private String email;

  private String message;

}
