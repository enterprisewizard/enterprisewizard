package dwz.framework.context;

import ew.framework.user.User;

public class DefaultAppContext implements AppContext {

	private User user = null;


	public DefaultAppContext() {
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
