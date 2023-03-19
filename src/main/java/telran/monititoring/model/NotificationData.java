package telran.monititoring.model;

public class NotificationData {

	public String doctorEmail;
	public String doctorName;
	public String patientName;
	
	public NotificationData() {
	}

	public NotificationData(String doctorEmail, String doctorName, String patientName) {
		this.doctorEmail = doctorEmail;
		this.doctorName = doctorName;
		this.patientName = patientName;
	}

	@Override
	public String toString() {
		return "NotificationData [doctorEmail=" + doctorEmail + ", doctorName=" + doctorName + ", patientName="
				+ patientName + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((doctorEmail == null) ? 0 : doctorEmail.hashCode());
		result = prime * result + ((doctorName == null) ? 0 : doctorName.hashCode());
		result = prime * result + ((patientName == null) ? 0 : patientName.hashCode());
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
		NotificationData other = (NotificationData) obj;
		if (doctorEmail == null) {
			if (other.doctorEmail != null)
				return false;
		} else if (!doctorEmail.equals(other.doctorEmail))
			return false;
		if (doctorName == null) {
			if (other.doctorName != null)
				return false;
		} else if (!doctorName.equals(other.doctorName))
			return false;
		if (patientName == null) {
			if (other.patientName != null)
				return false;
		} else if (!patientName.equals(other.patientName))
			return false;
		return true;
	}
	
	
}
