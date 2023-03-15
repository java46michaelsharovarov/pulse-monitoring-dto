package telran.monititoring.model;

public class PulseProbe {

	public long patientID;
	public long timestamp;
	public long sequenceNumber;
	public int value;
	
	public PulseProbe() {
	}

	public PulseProbe(long patientID, long sequenceNumber, int value) {
		this.patientID = patientID;
		this.timestamp = System.currentTimeMillis();
		this.sequenceNumber = sequenceNumber;
		this.value = value;
	}

	@Override
	public String toString() {
		return "PulseProbe#" + sequenceNumber + " [patientID=" + patientID + ", timestamp=" + timestamp + ", value=" + value + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (patientID ^ (patientID >>> 32));
		result = prime * result + (int) (sequenceNumber ^ (sequenceNumber >>> 32));
		result = prime * result + (int) (timestamp ^ (timestamp >>> 32));
		result = prime * result + value;
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
		PulseProbe other = (PulseProbe) obj;
		if (patientID != other.patientID)
			return false;
		if (value != other.value)
			return false;
		return true;
	} 		
	
}
