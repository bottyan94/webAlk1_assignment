package iit.uni.miskolc.hu.model;

import iit.uni.miskolc.hu.exceptions.InvalidIDFormatExceptions;

public class Hr {

    private int hrID;
    private String hrName;
    private String email;

    public Hr(int hrID, String hrName, String email) {
        this.hrID = hrID;
        this.hrName = hrName;
        this.email = email;
    }

    public int getHrID() throws InvalidIDFormatExceptions{
        if(hrID < 1){throw new InvalidIDFormatExceptions();}
        return hrID;
    }

    public void setHrID(int hrID) {
        this.hrID = hrID;
    }

    public String getHrName() {
        return hrName;
    }

    public void setHrName(String hrName) {
        this.hrName = hrName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
