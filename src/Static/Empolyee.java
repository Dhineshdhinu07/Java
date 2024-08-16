package Static;

public class Empolyee {
    String FirstName;
    String LastName;
    int id;
    boolean maritalStatus;
    static int empCount;
    public Empolyee(String FirstName,String LastName,int id,boolean maritalStatus){
        this.FirstName=FirstName;
        this.LastName=LastName;
        this.id=id;
        this.maritalStatus=maritalStatus;
        Empolyee.empCount+=1;

    }

}

