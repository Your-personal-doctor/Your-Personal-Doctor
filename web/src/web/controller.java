package web;

/**
 *  data:10/8/2018
 * @author Ruifeng zhu
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class controller {
    private String patientfilename = "patient table";
    private String doctorfilename = "doctor list";
    private File patientfile = new File(patientfilename);
    private File doctorfile = new File(doctorfilename);
    private static final String COMMA_DELIMITER = ",";
    private static final int docID = 0;
    private static final int docusername = 1;
    private static final int docpassword = 2;
    private static final int docfirstname= 3;
    private static final int doclastname= 4;


    
    public void wtiteNewPatientFile() throws FileNotFoundException{
        if(!patientfile.exists()){
            try{
                    patientfile.createNewFile();
                    System.out.println("the new patient file was completed now");
            }  catch(IOException e){
                    e.printStackTrace();
            }
        }
    }
    public void writeNewDoctorFile() throws FileNotFoundException {
		if (!doctorfile.exists()) {
			try {
				doctorfile.createNewFile();
				System.out.println("the new doctor file was completed now");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
}   public ArrayList<Doctor> extractDoctorList(){
    	BufferedReader fileReader = null;
    	ArrayList<Doctor> doctorlist = new  ArrayList<Doctor>();
    	try {
    		String line = "";
    		fileReader = new BufferedReader(new FileReader(doctorfilename));
    		fileReader.readLine();
    		while ((line = fileReader.readLine()) != null) {
    			String[] tokens = line.split(COMMA_DELIMITER,5);
    			if (tokens.length > 0) {
    				Doctor doctor = new Doctor();
    				doctor.setdocID(Integer.parseInt(tokens[docID]));
                                doctor.setFirstName(tokens[docfirstname]);
    				doctor.setLastName(tokens[doclastname]);
    				doctor.setDocuserName(tokens[docusername]);
    				doctor.setDocpassWord(tokens[docpassword]);
    				doctorlist.add(doctor);
    			}
    		}
    	}
    	catch (Exception e) {
    		System.out.println("Error in CSVFileReader!");
    		e.printStackTrace();
    	} 
    	finally {try {
    			fileReader.close();
    		} catch (IOException e) {
    			System.out.println("Error while closing fileReader!");
    			e.printStackTrace();
    		}
    	}
    	return doctorlist;
    }
}
