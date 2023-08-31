package edu.disease.asn6;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import edu.disease.asn3.Disease;

public class DiseaseAndPatientTest {
	
	private List<Disease> diseases;
	private List<Patient> patients;
@Test
public void testGetDiseases() {
	
	DiseaseAndPatient dap=new DiseaseAndPatient(diseases,patients);
	 assertNotNull(dap.getDiseases());
}

@Test
public void testSetDiseases() {
	DiseaseAndPatient dap=new DiseaseAndPatient(diseases,patients);
	 dap.setDiseases(diseases);
	 
}
@Test
public void testGetPatients() {
	
	DiseaseAndPatient dap=new DiseaseAndPatient(diseases,patients);
	 assertNotNull(dap.getPatients());
}

@Test
public void testSetPatients() {
	DiseaseAndPatient dap=new DiseaseAndPatient(diseases,patients);
	 dap.setPatients(patients);
}
@Test
public void testDefaultConstructor() {
	DiseaseAndPatient dap=new DiseaseAndPatient();
}

}