package admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import dao.HotelDAO;
import model.Hotel;

/**
 * Servlet implementation class SupprimerHotel
 */
@WebServlet("/SupprimerHotel")
public class SupprimerHotel extends HttpServlet {
	private static final long serialVersionUID = 1L;
	HotelDAO dao = new HotelDAO();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SupprimerHotel() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        Hotel hotel = dao.findHotel(id);
        if (hotel != null) {
            boolean deleted = dao.deleteHotel(id);
            if (deleted == true ){
                response.sendRedirect("ListHotels");
            } else {
            	response.sendRedirect("404.jsp");
            }
        } else {
        	response.sendRedirect("404.jsp");
        }
    
}



	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
