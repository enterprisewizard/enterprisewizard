package dwz.framework.context;

import ew.framework.user.User;

public interface AppContext {

	User getUser();

	void setUser(User user);

}
