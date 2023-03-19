package telran.monitoring.model;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class PulseJump {

	public long patientId;
	public int previousValue;
	public int currentValue;
	public long timestamp;

	public PulseJump(long patientId, int previousValue, int currentValue) {
		this.patientId = patientId;
		this.previousValue = previousValue;
		this.currentValue = currentValue;
		this.timestamp = System.currentTimeMillis();
	}
	
}
