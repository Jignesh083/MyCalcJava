package MyPackage;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class MyServlet
 */
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String[] jokes = {
			"Why do Java Developer wear glasses? Because they don't CSharp!",
			"I told my computer I needed a break, and now it won't stop sending me Kit Kat bars.",
			"Why don't Programmers like nature? It has to many bugs.",
			"How many Programmers does it take to change a light bulb? None, it's a hardware problem.",

		};
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String str1 = request.getParameter("num1");
		String str2 = request.getParameter("num2");
		String str3 = request.getParameter("btn1");
		
		
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		
		int ans;
		
		
		switch(str3) {
		case "1": ans = num1+num2;
		break;
		case "2": ans = num1-num2;
		break;
		case "3": ans = num1*num2;
		break;
		default: ans = num1/num2;
		break;
		}
		
		int randomIndex = (int) (Math.random() * jokes.length);
		String randomJoke = jokes[randomIndex];
		
		response.sendRedirect("NewFile.jsp?Ans= "+ ans +"&joke= "+randomJoke);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
