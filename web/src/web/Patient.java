package web;
/**
 *9/25/2018
 * autor:Ruifeng zhu
 * Patient class 
 */
public class Patient extends Person {

    private int  pid;
    private String account;
    private String puser;
    private String password;
    private String mail;
    private String number;
    private String gender;
    private String message;
    
    
    @Override
	public int hashCode() {
		
		int result = 1;
		result = 31 * result + ((puser == null) ? 0 : puser.hashCode());
		result = 31 * result + ((password == null) ? 0 : password.hashCode());
		result = 31 * result + pid;
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
		Patient other = (Patient) obj;
		if (puser == null) {
			if (other.puser != null)
				return false;
		} else if (!puser.equals(other.puser))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (pid != other.pid)
			return false;
		return true;
	}

    public String getAccount(){
        return account;
    }
    public void setAccount(String account){                         
        this.account = account;
    }
    public String getPuser(){
        return puser;
    }
    
   public void setPuser(){
        this.puser = puser;
   }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){                         
        this.password = password;
    }
    public String getMail(){
        return mail;
    }
    public void setMail(String mail){                         
        this.mail = mail;
    }
    public int getPid(){
        return pid;
    }
    public void setPid(int pid){                         
        this.pid = pid;
    }
    public String getNumber(){
        return number;
    }
    public void setNumber(String number){                         
        this.number = number;
    }
    
    public String getGender(){
        return gender;
    }
    
    public void setGender(){
        this.gender = gender;
    }
    
    public String getMessage(){
        return message;
    }
    
    public void setMessage(){
        this.message = message;
    }
    
    public Patient(String account,String puser,String password,String mail
            ,int pid,String number,String gender, String message){
        super();
        this.account = account;
        this.puser = puser;
        this.password = password;
        this.mail = mail;
        this.pid = pid;
        this.number = number;
        this.gender = gender;
        this.message = message;
    }
    public Patient(){
        super();
    }
}
