
package web;

/**
 *
 * @author zhuru
 */
public class doccontroller {
    private Doctor model;
    private Doctorview view;
    
    public doccontroller(Doctor model, Doctorview view){
        this.model = model;
        this.view = view;
    
    }
    
    public void setdocID(int docID){
         model.setdocID(docID);
    }
    
    public int getdocID(){
     return model.getdocID();
    }
    
    public void setDocusername(String docusername){
        model.setDocuserName(docusername);
    }
    
    public String getDocusername(){
        return model.getDocuserName();
    }
    
    public void setDocpassword(String docpassword){
        model.setDocpassWord(docpassword);
    }
    
    public String getDocpassword(){
       return model.getDocpassWord();
    }
    
    public void updataView(){
        view.printDoctorDetail(model.getdocID(),model.getDocpassWord(),model.getDocuserName());
    }
}
