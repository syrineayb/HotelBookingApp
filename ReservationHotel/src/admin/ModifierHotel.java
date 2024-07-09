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
 * Servlet implementation class ModifierHotel
 */
@WebServlet("/ModifierHotel")
public class ModifierHotel extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HotelDAO dao = new HotelDAO();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModifierHotel() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 int id = Integer.parseInt(request.getParameter("id"));
	        Hotel hotel = dao.findHotel(id);
	        request.setAttribute("hotel", hotel);
	        request.getRequestDispatcher("/WEB-INF/admin/modifierhotel.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    int hotel_id = Integer.parseInt(request.getParameter("hotel_id"));
	    String hotel_name = request.getParameter("hotel_name");
	    String hotel_address = request.getParameter("hotel_address");
	    
	    int nb_adults = Integer.parseInt(request.getParameter("nb_adults"));
	    int nb_children = Integer.parseInt(request.getParameter("nb_children"));
	    int nb_rooms = Integer.parseInt(request.getParameter("nb_rooms"));
	    String img_url = request.getParameter("img_url");
	    String description = request.getParameter("description");
	    double hotel_price = Double.parseDouble(request.getParameter("hotel_price"));
	    String arrival_date = request.getParameter("arrival_date");
	    String departure_date = request.getParameter("departure_date");

	

	    Hotel hotel = new Hotel(hotel_id, hotel_name, hotel_address, arrival_date, departure_date, nb_adults, nb_children, nb_rooms, img_url, description, hotel_price);
	    boolean updated = dao.updateHotel(hotel);
	    if (updated) {
	        response.sendRedirect("ListHotels");
	    } else {
	        response.sendRedirect("error.jsp");
	    }
	}

	}


