package dao;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
//voila le dao de fichier
//@Repository
//@Profile("file")
@Component("daoFile")
public class DaoFile implements IDao {
    public double getValue() {
        return 180;
    }
}