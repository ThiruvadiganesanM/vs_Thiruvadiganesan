package edu.disease.asn1;

import java.util.UUID;

public class Disease {
UUID diseasesId;
String name;
public Disease(UUID diseasesId, String name) {
	super();
	this.diseasesId = diseasesId;
	this.name = name;
}
public int hashCode() {
	return super.hashCode();
}
public boolean equals(Object obj) {
	return super.equals(obj);
}
public String toString() {
	return super.toString();
}
public UUID getDiseasesId() {
	return diseasesId;
}
public void setDiseasesId(UUID diseasesId) {
	this.diseasesId = diseasesId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}


}
