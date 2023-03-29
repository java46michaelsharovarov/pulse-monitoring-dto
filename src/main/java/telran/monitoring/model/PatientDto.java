package telran.monitoring.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class PatientDto {

	public static final String NULL_MESSAGE = "can't be null";
	
	@Min(value = 1, message = NULL_MESSAGE + " or less than 1")
	public long patientId;
	
	@NotNull(message = "patient name " + NULL_MESSAGE)
	@Pattern(regexp = "[A-Z][a-z]*", message = "first letter of the name must be uppercase")
	public String patientName;

}
