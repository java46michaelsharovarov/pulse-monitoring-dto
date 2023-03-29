package telran.monitoring.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
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
public class VisitDto {
	
	public static final String NULL_MESSAGE = "can't be null";
	
	@Min(value = 1, message = NULL_MESSAGE + " or less than 1")
	public long patientId;
	
	@NotEmpty(message = "doctor email " + NULL_MESSAGE + " or empty")
	@Email(message = "should be in format of Email")
	public String doctorEmail;
	
	@NotNull(message = "date " + NULL_MESSAGE)
	@Pattern(regexp = "\\d{4}-(0\\d|1[012])-(0\\d|[12]\\d|3[01])",
			message = "date should be in format YYYY-MM-DD")
	public String date;
	
}
