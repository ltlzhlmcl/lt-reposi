/**
 * 
 */
package interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import domain.User;

/**
 * @ClassName:  AuthorizedInterceptor   
 * @Description: 访问权限验证拦截器
 */
public class AuthorizedInterceptor implements HandlerInterceptor {
	
	
	private static final String[] EGNORE_URI={"/loginForm","/login","/404.html"};
	
	public AuthorizedInterceptor() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.HandlerInterceptor#afterCompletion(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object, java.lang.Exception)
	 */
	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.HandlerInterceptor#postHandle(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object, org.springframework.web.servlet.ModelAndView)
	 */
	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.HandlerInterceptor#preHandle(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object)
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		// TODO 验证请求来源，是否登录
		boolean flag=false;
		String path=request.getServletPath();
	
		for(String s:EGNORE_URI){
			if (path.contains(s)){
				flag=true;
				break;
			}
		}
		if(!flag){
			User user=(User)request.getSession().getAttribute("user_session");
			if(user==null){
				request.setAttribute("message", "请先登录");
				request.getRequestDispatcher("/loginForm").forward(request, response);;
				return flag;
			}else{
				flag=true;
			}
		}
		return flag;
	}

}
