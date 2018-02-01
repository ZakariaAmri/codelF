package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Address;
import entity.Contact;
import service.AddressService;
import service.ContactService;
import util.HibernateUtil;

/**
 * Servlet implementation class CreateContactServlet
 */
public class CreateContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateContactServlet() {
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
		doGet(request, response);
		System.out.println("servlet");
		ContactService cs = new ContactService();
		Contact c = cs.createContact(request.getParameter("firstname"), request.getParameter("lastname"), request.getParameter("email"));
		if(c == null)
			System.out.println(this.getClass().getName()+"=> CREATE FAIL (contact)");
		AddressService as = new AddressService();
		Address a = as.createAddress(request.getParameter("street"), request.getParameter("city"), request.getParameter("zip"));
		if(a == null)
			System.out.println(this.getClass().getName()+"=> CREATE FAIL (address)");
		c.setAddress(a);
		HibernateUtil.hibernateUpdateObject(c);
		RequestDispatcher rd = request.getRequestDispatcher( "/test.html" );
		rd.forward(request, response);
	}

}
