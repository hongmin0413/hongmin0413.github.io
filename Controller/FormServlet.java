package Controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import Model.Person;

@SuppressWarnings("serial")
@WebServlet("/form") //處理<form>中的form導向
public class FormServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		Person person = new Person();
		person.setName(request.getParameter("name"));
		person.setGender(request.getParameter("gender"));
		person.setBirthday(request.getParameter("birthday"));
		person.setHobby(request.getParameterValues("hobby"));
		person.setOccupation(request.getParameter("occupation"));
		
		//建立session並新增sessionID
		HttpSession session = request.getSession();
		session.setAttribute("person", person); 
		response.sendRedirect("formResult.jsp");
	}

}