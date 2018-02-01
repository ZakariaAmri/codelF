package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.PhoneNumber;
import service.PhoneNumberService;

/**
 * Servlet implementation class CreatePhoneNumberServlet
 */
public class CreatePhoneNumberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreatePhoneNumberServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request,response);
		PhoneNumberService pns = new PhoneNumberService();
		PhoneNumber pn = pns.createPhoneNumber(request.getParameter("kind"),
											  request.getParameter("number"));
		if(pn == null)
			System.out.println(this.getClass().getName()+"=> CREATE FAIL");
		RequestDispatcher rd = request.getRequestDispatcher( "/test.html" );
		rd.forward(request, response);
	}

}
