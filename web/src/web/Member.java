package web;
/**
 *9/25/2018
 * autor:Ruifeng zhu
 * Memebr class 
 */
public class Member{
private String account;
private String password;
private String mail;
private String id;
private String number;
    public String getAccount(){
        return account;
    }
    public void setAccount(String account){                         
        this.account = account;
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
    public String getId(){
        return id;
    }
    public void setID(String id){                         
        this.id = id;
    }
    public String getNumber(){
        return number;
    }
    public void setNumber(String number){                         
        this.number = number;
    }
    public Member(String account,String password,String mail
            ,String id,String number){
        super();
        this.account = account;
        this.password = password;
        this.mail = mail;
        this.id = id;
        this.number = number;
    }
    public Member(){
        super();
    }
}
