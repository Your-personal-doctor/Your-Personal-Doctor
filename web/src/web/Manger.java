package manger;

/**
 * author: Ruifeng zhu
 * data: 9/29/2018
 * manger class for the manger ability
 */

public class Manger {
  private int MID;
	private String MuserName;
	private String MpassWord;
        private String add;
        private String delete;
        
        public int getMid() {
		return MID;
	}
	
	public void setMID(int MID){
            this.MID = MID;
        }
        
        public String getMuserName(){
            return MuserName;
        }
        
        public void setMuserName(String MuserName){
            this.MuserName = MuserName;
        }
        
        public String getMpassWord(){
            return MpassWord;
        }
        
        public void setMpassWord(){
            this.MpassWord = MpassWord;
        }
        public int hashCode() {
	
		int result = 1;
		result = 31 * result + ((MpassWord == null) ? 0 : MpassWord.hashCode());
		result = 31 * result + ((MuserName == null) ? 0 : MuserName.hashCode());
		return result;
        }
        
        public boolean equals(Object obj){
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if(getClass()!= obj.getClass())
                return false;
            Manger other = (Manger) obj;
            if(MuserName == null){
                if(other.MuserName != null);
                    return false;
            }else if (!MuserName.equals(other.MuserName))
                 return false;
            return true;
        }
        public String getAdd(){
            return add;
        }
        
        public void setAdd(){
            this.add = add;
        }
        
        public String getDelete(){
            return delete;
        }
       
        public void setDelete(){
            this.delete = delete;
        }
        public String toString(){
            return (this.MID+","+MuserName+","+MpassWord.toString()+","+add+","+delete);
        }
}      