package srv6;


import java.time.*;
import java.time.format.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet {
	
	private String user;
	private String name;
	private String password;
	
	public void init() throws ServletException {
		ServletConfig config = getServletConfig();
		user = config.getInitParameter("user");
		password = config.getInitParameter("password");
		name = config.getInitParameter("name");
	}
	
	public void doPost (
		HttpServletRequest request, HttpServletResponse response
	) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		LocalDateTime time = LocalDateTime.now();
		DateTimeFormatter fmter =
		DateTimeFormatter.ofPattern("H時 m分 s秒");
		String tInfo = time.format(fmter);
		HttpSession session = request.getSession();
		try {
			
			String logout = request.getParameter("logout");
			if(logout!=null && logout.length()!=0 && logout.equals("ログアウト")==true){
			
				//セッション終了、削除
				session.invalidate();
				String outmes = "ログアウトしました。";
				request.setAttribute("outmes", outmes);
				request.getRequestDispatcher("/kadai/srv6/login.jsp")
					.forward(request, response);
				
			}else{
				String ckuser = request.getParameter("user");
				String ckpass = request.getParameter("password");
				
				if(
				ckuser==null || ckuser.length()==0 || this.user.equals(ckuser)==false ||
				ckpass==null || ckpass.length()==0 || this.password.equals(ckpass)==false ){
					
					String error = "ユーザー名 またはパスワードに誤りがあります";
					request.setAttribute("ermes", error);
					request.setAttribute("time", tInfo);
					request.getRequestDispatcher("/kadai/srv6/login_result.jsp")
						.forward(request, response);
				}else {
					
					String suser = (String)session.getAttribute("user");
					if(suser != null){
						if(suser.equals(ckuser)==true){
							
							String alrmes = "さん  ログイン中です";
							request.setAttribute("mes", alrmes);

						}
					}else {
						String okmes = "さん  ログイン成功です";
						request.setAttribute("mes", okmes);
						//セッションオブジェクト格納
						session.setAttribute("user", ckuser);
					}
					request.setAttribute("time", tInfo);
					request.getRequestDispatcher("/kadai/srv6/login_result.jsp")
						.forward(request, response);
				}
			}
		} catch (Exception e) {
			
		}
	}
}
/*
*/