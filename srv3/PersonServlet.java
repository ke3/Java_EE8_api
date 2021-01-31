package srv3;


import bean.PersonBean;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class PersonServlet extends HttpServlet {

	public void doPost (
		HttpServletRequest request, HttpServletResponse response
	) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");

		PrintWriter out=response.getWriter();
		try {
			
			request.setCharacterEncoding("UTF-8");
			String name = request.getParameter("name");
			String add = request.getParameter("address");
			String tel = request.getParameter("telephone");
			
			PersonBean p = new PersonBean();
			p.setName(name);
			p.setAdd(add);
			p.setTel(tel);
			
			request.setAttribute("PersonBean",p);

			request.getRequestDispatcher("/jsp/srv3/person_info.jsp")
				.forward(request, response);
			
		} catch (Exception e) {
			e.printStackTrace(out);
		}
	}
}
/*
*/