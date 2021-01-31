package srv4;


import bean.BmiBean;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class BmiServlet extends HttpServlet {

	public void doPost (
		HttpServletRequest request, HttpServletResponse response
	) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		
		try {
			
			request.setCharacterEncoding("UTF-8");

			BmiBean bb = new BmiBean();
			String h = request.getParameter("height");
			String w = request.getParameter("weight");
			if(
			h==null || h.length()==0 ||
			w==null || w.length()==0){
				String nullmes = "身長または体重が未入力です";
				request.setAttribute("nullmes", nullmes);
				request.getRequestDispatcher("/kadai/srv4/bmi.jsp")
					.forward(request, response);

			}else{
				bb.setHeight(h);
				bb.setWeight(w);
				bb.setBmi();
				bb.setMes();
				request.setAttribute("BmiBean",bb);
				request.getRequestDispatcher("/kadai/srv4/bmi_result.jsp")
					.forward(request, response);
			}
		} catch (NumberFormatException e) {
				String errormes = "身長と体重は数値を入力してください";
				request.setAttribute("errormes",errormes);
				request.getRequestDispatcher("/kadai/srv4/bmi.jsp")
				.forward(request, response);
		}
		 catch (Exception e) {
				String errormes = "身長または体重が負数です";
				request.setAttribute("errormes",errormes);
				request.getRequestDispatcher("/kadai/srv4/bmi.jsp")
				.forward(request, response);
		}
	}
}
/*
*/