package telran.monititoring.model;

public class PulseJump {

	public long patientId;
	public int previousValue;
	public int currentValue;
	public long timestamp;
	
	public PulseJump() {
	}

	public PulseJump(long patientId, int previousValue, int currentValue) {
		this.patientId = patientId;
		this.previousValue = previousValue;
		this.currentValue = currentValue;
		this.timestamp = System.currentTimeMillis();
	}

	@Override
	public String toString() {
		return "PulseJump [patientId=" + patientId + ", previousValue=" + previousValue + ", currentValue="
				+ currentValue + ", timestamp=" + timestamp + "]";
	}
	
}
