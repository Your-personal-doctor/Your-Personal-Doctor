package web;
/**
* autor:Ruifeng zhu
* data: 10/10/2018 
* the mdoel for the person to connecet with the sql
*/

public class Person {
    private String uuid;
    private String username;
    private String password;
    private int usertype;
    private String name;
    private int age;
    private int contact;
    private String email;
    private boolean gender;
    
    public void Person(String _uuid,String _username,String _password,int _usertype,
                       String _name,int _age,int _contact,String _email,boolean _gender){
        this.uuid = _uuid;
        this.username = _username;
        this.password = _password;
        this.usertype = _usertype;
        this.name = _name;
        this.age = _age;
        this.contact = _contact;
        this.email = _email;
        this.gender = _gnder;
         
    }
    public String getUuid(){
        return uuid;
       
    }
    public void setUuid(String _uuid){
        this.uuid = _uuid;
    }
    public String getUsername(){
        return username;
    }
    
    public void setUsername(String _username){
        this.username = username;
    }
     public String getPassword(){
        return password;
       
    }
    public void setPassword(String _password){
        this.passsword = _password;
    }
     public int getUsertype(){
        return usertype;   
    }
    
    public void setUsertype(int _usertype){
        this.usertype = _usertype;
    } 
    
    public String getName(){
        return name;
       
    }
    public void setName(String _name){
        this.name = _name;
    }
    
     public int getAge(){
        return age;
       
    }
    public void setAge(int _age){
        this.age = _age;
    }
    
     public int getContact(){
        return contact;
       
    }
    public void setContact(int _contact){
        this.contact = _contact;
    }
    
     public String getEmail(){
        return email;
       
    }
    public void setEmail(String _email){
        this.email = _email;
    }
    
     public boolean getGender(){
        return gender;
       
    }
    public void setGender(boolean _gender){
        this.gender = _gender;
    }
