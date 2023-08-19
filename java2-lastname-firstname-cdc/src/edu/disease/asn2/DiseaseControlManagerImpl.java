package edu.disease.asn2;

import java.util.UUID;

import edu.disease.asn1.Exposure;

public class DiseaseControlManagerImpl implements DiseaseControlManager{
	int maxDiseases,maxPatients;
	int diseaseCount=0;
	public DiseaseControlManagerImpl(int maxDiseases,int maxPatients) {
		if(maxDiseases <=0 && maxPatients <=0) {
			try {
			throw new IllegalArgumentException();
			}catch(IllegalArgumentException e) {
				e.printStackTrace();
			}
		}
		this.maxDiseases=maxDiseases;
		this.maxPatients=maxPatients;
	}
	private Disease[] diseases=new Disease[maxDiseases];
	private Patient[] patient=new Patient[maxPatients];
	
	public Disease addDisease(String diseaseName, boolean isInfectious) {
		Disease disease;
		if(diseases.length==diseaseCount) {
			try {
			throw new IllegalStateException();
			}catch(IllegalStateException e){
				e.printStackTrace();
			}
		}
		if(isInfectious) {
			disease=new InfectiousDisease(null,diseaseName);
		}
		else {
			disease=new NonInfectiousDisease(null, diseaseName);
		}
		if(disease!=null) {
			diseases[diseaseCount]=disease;
			diseaseCount++;
		}
	return disease;
	}

	public Disease getDisease(UUID diseaseId) {
		Disease disease1=null;
		for(int i=0;i<diseases.length;i++) {
			if(diseaseId==diseases[i].diseasesId) {
				disease1=diseases[i];
			}
		}
		if(disease1==null) {
			try {
			throw new NullPointerException();
			}catch(NullPointerException e) {
				e.printStackTrace();
			}
		}
		return disease1;
	}

	public Patient addPatient(String firstName, String lastName, int maxDiseases, int maxExposures) {
		return null;
	}

	public Patient getPatient(UUID patientId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void addDiseaseToPatient(UUID patientId, UUID diseaseId) {
		// TODO Auto-generated method stub
		
	}

	public void addExposureToPatient(UUID patientId, Exposure exposure) {
		// TODO Auto-generated method stub
		
	}
}
