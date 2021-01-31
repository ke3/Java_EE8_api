package srv5;


import bean.EnzanBean;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class EnzanServlet extends HttpServlet {

	public void doPost (
		HttpServletRequest request, HttpServletResponse response
	) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		
		try {
			
			request.setCharacterEncoding("UTF-8");

			EnzanBean eb = new EnzanBean();
			String v1 = request.getParameter("value1");
			String ezs = request.getParameter("enzansi");
			String v2 = request.getParameter("value2");
			if(
			v1==null || v1.length()==0 ||
			ezs==null || ezs.length()==0 ||
			v2==null || v2.length()==0){
				String nullmes = "演算する値または演算子を入力してください";
				request.setAttribute("nullmes", nullmes);
				request.getRequestDispatcher("/kadai/srv5/enzan_result.jsp")
					.forward(request, response);
			}else{
				eb.setV1(v1);
				eb.setEzs(ezs);
				eb.setV2(v2);
				eb.setResult();
				request.setAttribute("EnzanBean",eb);
				request.getRequestDispatcher("/kadai/srv5/enzan_result.jsp")
					.forward(request, response);
			}
		} catch (NumberFormatException e) {
				String error1 = "項目１と項目３は、数値を入力してください";
				request.setAttribute("error1",error1);
				request.getRequestDispatcher("/kadai/srv5/enzan_result.jsp")
				.forward(request, response);
		} catch (IllegalArgumentException e){
				String error2 ="演算子に誤りがあります";
				request.setAttribute("error2",error2);
				request.getRequestDispatcher("/kadai/srv5/enzan_result.jsp")
				.forward(request, response);
		}
		 catch (ArithmeticException e) {
				String error3 = "0で割ることはできません";
				request.setAttribute("error3",error3);
				request.getRequestDispatcher("/kadai/srv5/enzan_result.jsp")
				.forward(request, response);
		}
	}
}
/*
*/