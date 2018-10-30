package web;
/**
* actor:Ruifeng zhu
* data: 10/10/2018 
* the model for the person to connecet with the sql
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
        this.gender = _gender;
         
    }
    /**
     * @return the id
     */
    public String getUuid(){
        return uuid;
       
    }
    /**
     * @param _uuid to set
     */
    public void setUuid(String _uuid){
        this.uuid = _uuid;
    }
    /**
     * @return the username
     */
    public String getUsername(){
        return username;
    }
    /**
     * @param _username to set
     */
    public void setUsername(String _username){
        this.username = username;
    }
    /**
     * @return the password
     */
     public String getPassword(){
        return password;
       
    }
    /**
     * @param _password to set
     */
    public void setPassword(String _password){
        this.password = _password;
    }
    /**
     * @return the usertype
     */
     public int getUsertype(){
        return usertype;   
    }
    /**
     * @param _usertype to set
     */
    public void setUsertype(int _usertype){
        this.usertype = _usertype;
    } 
    /**
     * @return the name
     */
    public String getName(){
        return name;
       
    }
    /**
     * @param _name to set
     */
    public void setName(String _name){
        this.name = _name;
    }
    /**
     * @return the age
     */
     public int getAge(){
        return age;  
    }
    /**
     * @param _age to set
     */ 
    public void setAge(int _age){
        this.age = _age;
    }
    /**
     * @return the contact
     */
     public int getContact(){
        return contact;
       
    }
    /**
     * @param _contact to set
     */ 
    public void setContact(int _contact){
        this.contact = _contact;
    }
    /**
     * @return the email
     */
     public String getEmail(){
        return email;
       
    }
    /**
     * @param _email to set
     */ 
    public void setEmail(String _email){
        this.email = _email;
    }
    /**
     * @return the gender
     */
     public boolean getGender(){
        return gender;
       
    }
    /**
     * @param _gender to set
     */ 
    public void setGender(boolean _gender){
        this.gender = _gender;
    }
}
