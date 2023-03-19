package telran.monitoring.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class NotificationData {

	public String doctorEmail;
	public String doctorName;
	public String patientName;
	
}
