package hackathon.envios.adapters.driving.http.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class UserRequestDto {

    @NotBlank(message = "name null not allowed")
    private String name;

    @NotBlank(message = "surname null not allowed")
    private String surname;

    @Size(min = 8, max = 13, message = "size dni [8 - 13]")
    @Pattern(regexp="^[0-9]+$", message="numeric field")
    private String dniNumber;

    @Size(min= 10, max = 13, message = "size phone [10 - 13]")
    @Pattern(regexp = "^[+]?[0-9]+$", message = "numeric field, (optional) start with the area code of your country")
    private String phone;

    @NotBlank(message = "mail null not allowed")
    @Email(message = "mail not valid")
    private String mail;

    @NotBlank(message = "password null not allowed")
    private String password;
}
