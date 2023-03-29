package telran.monitoring.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class PulseProbe {

	public long patientId;
	public long timestamp;
	public long sequenceNumber;
	public int value;
	
	public PulseProbe(long patientID, long sequenceNumber, int value) {
		this.patientId = patientID;
		this.timestamp = System.currentTimeMillis();
		this.sequenceNumber = sequenceNumber;
		this.value = value;
	}
	
}