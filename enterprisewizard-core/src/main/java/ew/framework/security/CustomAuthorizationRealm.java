package ew.framework.security;

import dwz.framework.context.SpringContainer;

import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

public class CustomAuthorizationRealm extends AuthorizingRealm {

        @Override
        public String getName() {
            return "CustomAuthorizationRealm";
        }

        //支持UsernamePasswordToken
        @Override
        public boolean supports(AuthenticationToken token) {
            return token instanceof UsernamePasswordToken;
        }

        //认证
        @Override
        protected AuthenticationInfo doGetAuthenticationInfo(
                AuthenticationToken token) throws AuthenticationException {

            //从token中 获取用户身份信息
            String username = (String) token.getPrincipal();
            //拿username从数据库中查询
            //....
            //如果查询不到则返回null

            //获取从数据库查询出来的用户密码
//            UsrinfMapper usrinfMapper = (UsrinfMapper)SpringContainer.getBean("usrinfMapper");
//            Usrinf USRINF = usrinfMapper.loadByLGNNAM(username);
//            if(USRINF == null){
//                return null;
//            }
//            String password =  USRINF.getLGNPWD();//这里使用静态数据模拟。。
//            //返回认证信息由父类AuthenticatingRealm进行认证
//            SimpleAuthenticationInfo sinfo = new SimpleAuthenticationInfo(username, password, getName());
//            return sinfo;
            return null;
        }


    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }
}
