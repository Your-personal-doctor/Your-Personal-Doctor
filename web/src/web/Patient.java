package web;
/**
 *9/25/2018
 * autor:Ruifeng zhu
 * Memebr class 
 */
public class Patient{
private String account;
private String password;
private String mail;
private String pid;
private String number;
private String gender;
private String height;
private String message;
private String wight;
    public String getAccount(){
        return acccount;
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
    public String getPid(){
        return pid;
    }
    public void setPid(String pid){                         
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
    
    public String getHeight(){
        return height;
    }
    
    public void setHight(){
        this.hight = hight;
    }
    
    public String getMessage(){
        return message;
    }
    
    public void setMessage(){
        this.message
    }
    
    public String getWeight(){
        return weight;
    }
    
    public void setWeight(){
        this.weight = weight;
    }
    public Patient(String account,String puser,String password,String mail
            ,String pid,String number,String gender, String height, String message, String weight){
        super();
        this.account = acoount;
        this.puser = puser;
        this.password = password;
        this.mail = mail;
        this.pid = pid;
        this.number = number;
        this.gender = gender;
        this.height = height;
        this.message = message;
        this.weight = weight;
    }
    public patient(){
        super();
    }
}
