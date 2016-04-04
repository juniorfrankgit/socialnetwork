package socialnetwork.dbaccess;
import socialnetwork.dao.*;
import socialnetwork.model.*;
/***
 * 
 * @author le06
 *This class allow to do all accesses on the db
 */
public class DBAccess {
	public void newAccount(String lastname, String firstname, String email, String password) {
		Dao.INSTANCE.add(lastname, firstname, email, password);
	}
}
