package socialnetwork.dbaccess;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import socialnetwork.dao.*;
import socialnetwork.model.*;
/***
 * 
 * @author le06
 *This class allow to do all accesses on the db
 */
public class DBAccess {
	public User newAccount(String lastname, String firstname, String email, String password) {
		Dao dao = Dao.INSTANCE;
		dao.add(lastname, firstname, email, password);
		return dao.getUser(email);
	}
	public void removeUser(Long id) {
		Dao.INSTANCE.remove(id);
	}
	
	public User login(String email){
		return Dao.INSTANCE.getUser(email);
	}
}
