package admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.HotelDAO;
import dao.RoomDAO;
import model.Hotel;
import model.Room;

/**
 * Servlet implementation class ModifierRoom
 */
@WebServlet("/ModifierRoom")
public class ModifierRoom extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private RoomDAO dao = new RoomDAO();

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModifierRoom() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 int id = Integer.parseInt(request.getParameter("id"));
	        Room room = dao.findRoom(id);
	        request.setAttribute("room", room);
	        request.getRequestDispatcher("/WEB-INF/admin/modifierroom.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 int room_id = Integer.parseInt(request.getParameter("room_id"));
		 int nb_beds = Integer.parseInt(request.getParameter("nb_beds"));
		 String room_type = request.getParameter("room_type");
		 String img_url = request.getParameter("img_url");
		  Room room = new Room(room_id,room_type,nb_beds,img_url);
		    boolean updated = dao.updateRoom(room);
		    if (updated) {
		        response.sendRedirect("ListRooms");
		    } else {
		        response.sendRedirect("error.jsp");
		    }
		}

}
