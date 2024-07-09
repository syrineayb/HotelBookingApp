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
 * Servlet implementation class AjoutRoom
 */
@WebServlet("/AjoutRoom")
public class AjoutRoom extends HttpServlet {
	private static final long serialVersionUID = 1L;
	RoomDAO dao = new RoomDAO();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjoutRoom() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher("/WEB-INF/admin/ajoutroom.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String room_type = request.getParameter("room_type");
	    int nb_beds = Integer.parseInt(request.getParameter("nb_beds"));
	    String img_url = request.getParameter("img_url");
	 

	    

	    Room room = new Room(room_type,nb_beds,img_url);
	    dao.addRoom(room);
	    response.sendRedirect("ListRooms");
	}

}
