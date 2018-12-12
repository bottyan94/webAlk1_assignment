package iit.uni.miskolc.hu.DAO;

import iit.uni.miskolc.hu.daoService.HrDAO;
import iit.uni.miskolc.hu.model.Hr;

import java.util.ArrayList;
import java.util.Collection;

public class HrDAOImpl implements HrDAO {
    private Collection<Hr> hr;

    public HrDAOImpl(){
        hr = new ArrayList<>();
        hr.add(new Hr(1,"Bottyan Tamas","bottyan94@gmail.com"));
        hr.add(new Hr(2,"Test HR","test@test.com"));
        hr.add(new Hr(2,"asd","test@test.com"));
        hr.add(new Hr(2,"Tomi","test@test.com"));

    }

    @Override
    public Collection<Hr> listHr() {
        return this.hr;
    }
}
