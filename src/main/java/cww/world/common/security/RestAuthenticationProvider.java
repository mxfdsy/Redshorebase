package cww.world.common.security;

import cww.world.common.constant.BaseCode;
import cww.world.common.exception.BaseException;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.authentication.preauth.PreAuthenticatedAuthenticationToken;


public class RestAuthenticationProvider implements AuthenticationProvider {

    /**
     * 对符合要求的合法token授权
     * @param authentication
     * @return
     * @throws AuthenticationException
     */
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        if (authentication instanceof PreAuthenticatedAuthenticationToken) {
            PreAuthenticatedAuthenticationToken preAuth = (PreAuthenticatedAuthenticationToken) authentication;
            RestAuthenticationToken sysAuth = (RestAuthenticationToken) preAuth.getPrincipal();
            if (sysAuth.getAuthorities() != null && sysAuth.getAuthorities().size() > 0) {
                GrantedAuthority gauth = sysAuth.getAuthorities().iterator().next();
                if ("BIKE_CLIENT".equals(gauth.getAuthority())) {
                    return sysAuth;
                }else if ("ROLE_SOMEONE".equals(gauth.getAuthority())) {
                    return sysAuth;
                }
            }
        }else if (authentication instanceof RestAuthenticationToken) {
            RestAuthenticationToken sysAuth = (RestAuthenticationToken) authentication;
            if (sysAuth.getAuthorities() != null && sysAuth.getAuthorities().size() > 0) {
                GrantedAuthority gauth = sysAuth.getAuthorities().iterator().next();
                if ("BIKE_CLIENT".equals(gauth.getAuthority())) {
                    return sysAuth;
                }else if ("ROLE_SOMEONE".equals(gauth.getAuthority())) {
                    return sysAuth;
                }
            }
        }
        throw new BaseException(BaseCode.UNKNOWN);
    }

    /**
     *@Author JackWang [www.coder520.com]
     *@Date 2017/7/29 22:18
     *@Description 校验授权token是不是合法 符合要求
     */
    @Override
    public boolean supports(Class<?> authentication) {
        return PreAuthenticatedAuthenticationToken.class.isAssignableFrom(authentication)||RestAuthenticationToken.class.isAssignableFrom(authentication);
    }
}
