package srv1;

import tool.Page;
import java.util.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class CurrentTimeServlet extends HttpServlet {

	public void doGet (
		HttpServletRequest request, HttpServletResponse response
	) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out=response.getWriter();
		
		Page.header(out);
		GregorianCalendar gc = new GregorianCalendar();
		
		int y = gc.get(Calendar.YEAR);
		int m = gc.get(Calendar.MONTH);
		int day = gc.get(Calendar.DATE);
		int h = gc.get(Calendar.HOUR_OF_DAY);
		int min = gc.get(Calendar.MINUTE);
		int s = gc.get(Calendar.SECOND);
		out.println("<p>今日は"+y+"/"+m+"/"+day+"です。</p>");
		out.println("<p>時刻は"+h+"時"+min+"分"+s+"秒です。</p>");
		
		
		Page.footer(out);
	}

}
