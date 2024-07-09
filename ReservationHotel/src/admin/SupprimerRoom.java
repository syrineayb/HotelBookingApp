package admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.RoomDAO;
import model.Room;

/**
 * Servlet implementation class SupprimerRoom
 */
@WebServlet("/SupprimerRoom")
public class SupprimerRoom extends HttpServlet {
	private static final long serialVersionUID = 1L;
	RoomDAO dao = new RoomDAO();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SupprimerRoom() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   int id = Integer.parseInt(request.getParameter("id"));
	        Room room = dao.findRoom(id);
	        if (room != null) {
	            boolean deleted = dao.deleteRoom(id);
	            if (deleted == true ){
	                response.sendRedirect("ListRooms");
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
