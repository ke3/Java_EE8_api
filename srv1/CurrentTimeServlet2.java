package srv1;

import tool.Page;
import java.util.*;
import java.time.*;
import java.time.format.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class CurrentTimeServlet2 extends HttpServlet {

	public void doGet (
		HttpServletRequest request, HttpServletResponse response
	) throws ServletException, IOException {
		LocalDate today = LocalDate.now();
		DateTimeFormatter  fmter =
			DateTimeFormatter.ofPattern("yyyy/MM/dd");
		
		LocalDateTime today2 = LocalDateTime.now();
		DateTimeFormatter fmter2 =
		   DateTimeFormatter.ofPattern("H時m分s秒");
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out=response.getWriter();
		Page.header(out);
		
		out.println("<p>補充：DateTimeFormatterより取得</p>");
		out.println("<p>今日は" + today.format(fmter) + "です。</p>");
		out.println("<p>時刻は" + today2.format(fmter2) + "です。</p>");
		
		Page.footer(out);
	}

}
