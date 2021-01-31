package srv2;


import bean.Product;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ColorMessageServlet2 extends HttpServlet {

	public void doPost (
		HttpServletRequest request, HttpServletResponse response
	) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");

		PrintWriter out=response.getWriter();
		try {
			request.setCharacterEncoding("UTF-8");
			
			String mes = request.getParameter("message");
			if(mes==null || mes.length()==0){
				String nullmes = "メッセージが入力されていません";
				request.setAttribute("nullmes",nullmes);
				request.getRequestDispatcher("/kadai/srv2/color2.jsp")
				.forward(request, response);
			}else{
			String col = request.getParameter("color");
			request.setAttribute("message",mes);
			request.setAttribute("color",col);
			
			request.getRequestDispatcher("/kadai/srv2/colormessage2.jsp")
				.forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace(out);
		}
	}
}
/*

*/