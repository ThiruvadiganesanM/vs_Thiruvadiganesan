package edu.disease.asn3;

import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.UUID;

public class Exposure {
	UUID patientId;
	LocalDateTime datetime;
	String exposuretype;
	public Exposure() {
		
	}
public Exposure(LocalDateTime datetime,String exposuretype,UUID patientId) {
	this.datetime=datetime;
	this.patientId=patientId;
	new Exposure().setExposuretype(exposuretype);
}
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((datetime == null) ? 0 : datetime.hashCode());
	result = prime * result + ((exposuretype == null) ? 0 : exposuretype.hashCode());
	result = prime * result + ((patientId == null) ? 0 : patientId.hashCode());
	return result;
}
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Exposure other = (Exposure) obj;
	if (datetime == null) {
		if (other.datetime != null)
			return false;
	} else if (!datetime.equals(other.datetime))
		return false;
	if (exposuretype == null) {
		if (other.exposuretype != null)
			return false;
	} else if (!exposuretype.equals(other.exposuretype))
		return false;
	if (patientId == null) {
		if (other.patientId != null)
			return false;
	} else if (!patientId.equals(other.patientId))
		return false;
	return true;
}
public String toString() {

	return super.toString();
}
public UUID getPatientId() {
	return patientId;
}
public LocalDateTime getDatetime() {
	return datetime;
}
public String getExposuretype() {
	return exposuretype;
}

public void setDatetime(LocalDateTime datetime) {
	this.datetime = datetime;
}
public void setExposuretype(String exposuretype) {
	if(exposuretype.equalsIgnoreCase("D")) {
		this.exposuretype="DirectExposure";
	}
	else if(exposuretype.equalsIgnoreCase("I")) {
		this.exposuretype="IndirectExposure";
	}
	else {
	try {
		throw new IllegalArgumentException();
	}catch(IllegalArgumentException e) {
		e.printStackTrace();
	}
	}
}



}
