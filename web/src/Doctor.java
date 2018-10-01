package web;


public class Doctor extends Person{
    private int docID;
    private String docusername;
    private String docpassword; 
    
    public Doctor(){
            super();
    }
    public int getdocID(){
            return docID;
    }
    
    @Override
        public int hashCode(){
            int hash = 1;
                hash = hash * 17 + docID;
                hash = hash * 31 + docusername.hashCode();
                hash = hash * 13 + (docpassword == null ? 0 : docpassword.hashCode());
                    return hash;
    }
    
    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Doctor other = (Doctor) obj;
		if (docpassword == null) {
			if (other.docpassword != null)
				return false;
		} else if (!docpassword.equals(other.docpassword))
			return false;
		if (docusername == null) {
			if (other.docusername != null)
				return false;
		} else if (!docusername.equals(other.docusername))
			return false;
		return true;
	}
    public void setdocID(int docID) {
		this.docID = docID;
	}

	public String getDocuserName() {
		return docusername;
	}

	public void setDocuserName(String docusername) {
		this.docusername = docusername;
	}

	public String getDocpassWord() {
		return docpassword;
	}

	public void setDocpassWord(String docpassword) {
		this.docpassword = docpassword;
	}
	
	
	@Override
	public String toString() {
		return (this.docID+","+docusername+","+docpassword.toString()+","+ firstName + "," + lastName);
	}
    
}
