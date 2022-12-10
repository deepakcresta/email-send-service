package deepak.auth.emailservice.contact;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 * <<Description Here>>
 * 
 * @author vs
 * @version
 * @since , Jun 5, 2022
 */

@Getter
@Setter
public class ContactReponseListDto {

  private List<ContactResponseDto> contacts;

  private Long total;

}
