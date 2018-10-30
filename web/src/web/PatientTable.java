package web;

/**
 *
 * @author Ruifeng zhu
 */
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

@SuppressWarnings("serial")
public class PatientTable extends AbstractTableModel {
	/**
	 * Sets the column names of the patient table to be in a specific format only
	 */
	private String[] columnNames = {"Doctor ID", "Doctor Username", "Patient ID", "First Name", "Last Name", "DOB",
			"Address", "Phone Number", "Billing Cycle", "Medical Condition", "Comments"};
	private ArrayList<Patient> patientlist = null;
	
	/**
	 * Constructor for the table model creates an AbstractTableModel, and initiates the patientlist off which the table is based as being
	 * corresponding to that table.
	 * @param patientlist  The filtered patient list upon which the JTable view is based.
	 */
	public PatientTable(ArrayList<Patient> patientlist){
		this.patientlist = patientlist;
	}
	
	 public Class<? extends Object> getColumnClass(int c) {
	      return getValueAt(0, c).getClass();
	    }
	
	public String getColumnName(int col) {
		return columnNames[col];
	}

	@Override
	public int getRowCount() {
		return patientlist.size();
	}

	@Override
	public int getColumnCount() {
		return columnNames.length;
	}

	/**
	 * Though not used, this is a necessary method to be overridden with the AbstractTableModel class.
	 */
	@Override
	public Object getValueAt(int row, int col) {
		 Patient patient = patientlist.get(row);
         switch (col) {
         case 0:
              return patient.getAccount();
         case 1:
              return patient.getPuser();
         case 2:
              return patient.getPid();
         case 3:
              return patient.getpFirstName();
         case 4:
              return patient.getpLastName();
         case 5:
        	 return patient.getpDob();
         case 6:
        	 return patient.getpAddress();
         case 7:
        	 return patient.getpPhoneNumber();
         case 8:
        	 return patient.getpBillingCycle();
         case 9:
        	 return patient.getpMedicalCondition();
         case 10:
        	 return patient.getpComments() ;
         default:
              return "unknown";
         }
	}
	
	/**
	 * Sets the table to whatever the arraylist is, including the size, and then fires an event to the table to say the table should be repainted.
	*
	* @param patientlist  An arraylist of patients
	*
	 */
	public void setList(ArrayList<Patient> patientlist) {
        this.patientlist = patientlist;
        fireTableDataChanged();
    }
	
	/**
	 * Removes the specifed row called into the method. The row removed must be the same as corresponding to the tablemodel (ConvertRowIndextoModel).
	 * Then, fire an event to the table to repaint the view.
	*
	*@param row  The row to be removed from the table (has to be passed
	*as corresponding to the tablemodel via <code>convertRowIndextoModel</code>).
	*
	 */
	public void removeRow(int row)
    {
		patientlist.remove(row);
        fireTableRowsDeleted(row, row);
    } 
	
	/**
	 * Adds a row to the tablemodel which is the index of the patient in the patientlist, and calls fireTableCellUpdated for every column in the row,
	 * as well as the row itself. Because the patientlist has been set upon initiation of the tablemodel, this is the same patientlist corresponding
	 * to the tablemodel, so the rows align.
	*
	* @param patient  An patient Object to be added
	*
	 */
	public void addRow(Patient patient) {
		patientlist.add(patient);
	    int row = patientlist.indexOf(patient);
	    for(int column = 0; column < patientlist.size(); column++) {
	        fireTableCellUpdated(row, column);
	    }
	    fireTableRowsInserted(row, row);
	}

	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
	    Patient patient = patientlist.get(rowIndex);
	    switch (columnIndex) {
        case 0:
            if (aValue instanceof String) {
            	patient.setFirstName((String) aValue); 
            	patient.setLastName((String) aValue);
            	patient.setpAddress((String) aValue);
            	patient.setpMedicalCondition((String) aValue);
            	patient.setpBillingCycle((String) aValue);
            	patient.setpComments((String) aValue);
            	patient.setpDob((String) aValue);
            	patient.setpatientdUserName((String) aValue);
            }
            break;
        case 1:
            if (aValue instanceof Integer) {
            	patient.setpatientdID((Integer) aValue);
            	patient.setPid((Integer) aValue);
            }
            break;
    }
    fireTableCellUpdated(rowIndex, columnIndex);
	}

}