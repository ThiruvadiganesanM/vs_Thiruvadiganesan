package edu.disease.asn1;

import java.time.LocalDateTime;
import java.util.UUID;

public class Patient {
UUID patientId;
String firstName;
String lastName;
int count=0,count1=0;
int maxExposures,maxDiseases;
public Patient(int maxDiseases, int maxExposures) {
	if(maxDiseases <=0 && maxExposures <=0) {
		try {
		throw new IllegalArgumentException();
		}catch(IllegalArgumentException e) {
			e.printStackTrace();
		}
	}
	this.maxExposures=maxExposures;
	this.maxDiseases=maxDiseases;
//	exposures=new Exposure[maxExposures];
//	diseaseIds=new UUID[maxDiseases];
}
 Exposure[] exposures=new Exposure[maxExposures];
UUID []diseaseIds=new UUID[maxDiseases];

public void addDiseaseId(UUID diseaseid) {
	if(count==diseaseIds.length) {
		try {
			throw new IndexOutOfBoundsException();
		}
		catch(IndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}
	diseaseIds[count]=diseaseid;
	count++;
}
public UUID getPatientId() {
	return patientId;
}
public void setPatientId(UUID patientId) {
	this.patientId = patientId;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public void addExposure(Exposure exp) {
	if(count1==exposures.length) {
		try {
			throw new IndexOutOfBoundsException();
		}
		catch(IndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}
	exposures[count1]=exp;
	count++;
}
public static void main(String[] args) {
	//Exposure exp1=new Exposure(new LocalDateTime(null, null).now() ,"D")
	
}
}
