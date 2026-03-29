package dao;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


//voila le dao de api
//@Repository
//@Profile("api")
@Component("daoApi")
public class DaoApi implements IDao {
    public double getValue() {
        return 220;
    }
}
