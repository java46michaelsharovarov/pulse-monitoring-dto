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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + currentValue;
		result = prime * result + (int) (patientId ^ (patientId >>> 32));
		result = prime * result + previousValue;
		result = prime * result + (int) (timestamp ^ (timestamp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PulseJump other = (PulseJump) obj;
		if (currentValue != other.currentValue)
			return false;
		if (patientId != other.patientId)
			return false;
		if (previousValue != other.previousValue)
			return false;
		return true;
	}
	
}
