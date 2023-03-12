package telran.monititoring.model;

public class PulseProbe {

	public long patientID;
	public long timestamp;
	public long sequenceNumber;
	public int value;
	
	public PulseProbe() {
	}

	public PulseProbe(long patientID, long timestamp, long sequenceNumber, int value) {
		this.patientID = patientID;
		this.timestamp = timestamp;
		this.sequenceNumber = sequenceNumber;
		this.value = value;
	}

	@Override
	public String toString() {
		return "PulseProbe#" + sequenceNumber + " [patientID=" + patientID + ", timestamp=" + timestamp + ", value=" + value + "]";
	} 	
	
	
}
