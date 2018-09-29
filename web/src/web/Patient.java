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
    public String getAccount(){
        return acccount;
    }
    public void setAccount(String account){                         
        this.account = account;
    }
    public String getPuser(){
        return puser;
    }
    
   public String setPuser(){
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
    public Member(String account,String puser,String password,String mail
            ,String pid,String number){
        super();
        this.account = acoount;
        this.puser = puser;
        this.password = password;
        this.mail = mail;
        this.pid = pid;
        this.number = number;
    }
    public patient(){
        super();
    }
}
