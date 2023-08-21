package edu.disease.asn3;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;
import java.util.UUID;

import edu.disease.asn1.Exposure;

public class Patient implements Comparable<Patient>{
UUID patientId;
String firstName;
String lastName;
Exposure[] exposures;
UUID[] diseaseIds;
int count=0,count1=0;
public static void main(String[] args) {
	//Exposure exp1=new Exposure(new LocalDateTime(null, null).now() ,"D")
	Patient p1=new Patient();
	p1.setLastName("naren");
	p1.setFirstName("Legend");
	Patient p2=new Patient();
	p2.setLastName("naren");
	p2.setFirstName("innocent");
	Patient p3=new Patient();
	p3.setFirstName("Rugged");
	p3.setLastName("Priya");
	TreeSet<Patient> list=new TreeSet<Patient>();
	list.add(p1);
	list.add(p2);
	list.add(p3);
	System.out.println(list);
}
public Patient() {
	
}
public Patient(int maxDiseases, int maxExposures) {
	if(maxDiseases <=0 && maxExposures <=0) {
		try {
		throw new IllegalArgumentException();
		}catch(IllegalArgumentException e) {
			e.printStackTrace();
		}
	}
	exposures=new Exposure[maxExposures];
	diseaseIds=new UUID[maxDiseases];
	
}
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

public String toString() {
	return "Patient [patientId=" + patientId + ",+"
			+ " lastName=" + lastName +  ",firstName=" + firstName+"]" ;
					
	
}

public int compareTo(Patient o) {
	int isEqual=this.lastName.compareToIgnoreCase(o.lastName);
	if(isEqual!=0) {
		return isEqual;
	}
	else {
		return this.firstName.compareToIgnoreCase(o.firstName);
	}
	
	//return this.lastName.compareToIgnoreCase(o.lastName);
}

}
