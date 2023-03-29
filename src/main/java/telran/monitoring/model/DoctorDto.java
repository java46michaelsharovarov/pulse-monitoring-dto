package telran.monitoring.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class DoctorDto {

	public static final String NULL_MESSAGE = "can't be null";
	
	@NotEmpty(message = "doctor email " + NULL_MESSAGE + " or empty")
	@Email(message = "should be in format of Email")
	public String doctorEmail;
	
	@NotNull(message = "doctor name " + NULL_MESSAGE)
	@Pattern(regexp = "[A-Z][a-z]*", message = "first letter of the name must be uppercase")
	public String doctorName;
	
}
