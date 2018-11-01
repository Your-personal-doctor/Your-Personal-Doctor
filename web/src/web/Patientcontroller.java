package web;

/**
 *
 * @author zhuru
 */
public class Patientcontroller {
    private Patient model;
    private Patientview view;
    
    public Patientcontroller(Patient model, Patientview view){
      this.model = model;
      this.view = view;
    }
    
    public void setPid(int Pid){
        model.setPid(Pid);
    }
    
    public int getPid(){
        return model.getPid();
    }
    
    public void setAccount(String account){
        model.setAccount(account);
    }
    
    public String getAccount(){
        return model.getAccount();
    }
    
    public void setPuser(String Puser){
        model.setPuser();
    }
}
