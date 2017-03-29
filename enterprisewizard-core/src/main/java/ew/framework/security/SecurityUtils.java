package ew.framework.security;

/**
 * Created by XiaoDu on 2016/12/17.
 */
public class SecurityUtils {
    public static String getuserLGNNAM(){
        return String.valueOf(org.apache.shiro.SecurityUtils.getSubject().getPrincipals());
    }
}
