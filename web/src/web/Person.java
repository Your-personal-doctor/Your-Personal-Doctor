package web;


public class Person {
    public String uuid;
    public String username;
    public String password;
    public int usertype;
    public String name;
    public int age;
    public int contact;
    public String email;
    public boolean gender;
    
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
     public String getUsertype(){
        return usertype;   
    }
    
    public void setUsertype(String _usertype){
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
    
     public String getContact(){
        return contact;
       
    }
    public void setContact(String _contact){
        this.contact = _contact;
    }
    
     public String getEmail(){
        return eamil;
       
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
