package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Hotel;

public class HotelDAO implements HotelInterface{

	@Override
	public List<Hotel> getAll() {
		 try {
	            Connection cnx = dbc.createConnection();
	            PreparedStatement stmt = cnx.prepareStatement("SELECT * FROM hotel");
	            ResultSet rs = stmt.executeQuery();
	            ArrayList<Hotel> hotels = new ArrayList<>();
	            while (rs.next()) {
	                int hotelId = rs.getInt("hotel_id");
	                String hotelName = rs.getString("hotel_name");
	                String hotelAddress = rs.getString("hotel_address");
	                String arrivalDate = rs.getString("arrival_date");
	                String departureDate = rs.getString("departure_date");
	                int nbAdults = rs.getInt("nb_adults");
	                int nbChildren = rs.getInt("nb_children");
	                int nbRooms = rs.getInt("nb_rooms");
	                String imgURL = rs.getString("img_url");
	                String description = rs.getString("description");
	                Double hotelPrice = rs.getDouble("hotel_price");

	                Hotel hotel = new Hotel(hotelId, hotelName, hotelAddress, arrivalDate, departureDate, nbAdults, nbChildren, nbRooms, imgURL, description, hotelPrice);
	                hotels.add(hotel);
	            }
	            return hotels;
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return null;
	    }

	

	@Override
	public void addHotel(Hotel hotel) {
		   String sql = "INSERT INTO hotel (hotel_name, hotel_address, arrival_date, departure_date, nb_adults, nb_children, nb_rooms, img_url, description, hotel_price) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		    try (Connection cnx = dbc.createConnection(); PreparedStatement stmt = cnx.prepareStatement(sql);) {
		        stmt.setString(1, hotel.getHotel_name());
		        stmt.setString(2, hotel.getHotel_address());
		        stmt.setString(3, hotel.getArrival_date());
		        stmt.setString(4, hotel.getDeparture_date());
		        stmt.setInt(5, hotel.getNb_adults());
		        stmt.setInt(6, hotel.getNb_children());
		        stmt.setInt(7, hotel.getNb_rooms());
		        stmt.setString(8, hotel.getImg_url());
		        stmt.setString(9, hotel.getDescription());
		        stmt.setDouble(10, hotel.getHotel_price());

		        stmt.executeUpdate();
		        cnx.commit();
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
	}

	@Override
	public Hotel findHotel(int id) {
		try {
	        Connection cnx = dbc.createConnection();
	        PreparedStatement stmt = cnx.prepareStatement("SELECT * FROM hotel WHERE hotel_id = ?");
	        stmt.setInt(1, id);
	        ResultSet rs = stmt.executeQuery();
	        if (rs.next()) {
	            int hotelId = rs.getInt("hotel_id");
	            String hotelName = rs.getString("hotel_name");
	            String hotelAddress = rs.getString("hotel_address");
	            String arrivalDate = rs.getString("arrival_date");
	            String departureDate = rs.getString("departure_date");
	            int nbAdults = rs.getInt("nb_adults");
	            int nbChildren = rs.getInt("nb_children");
	            int nbRooms = rs.getInt("nb_rooms");
	            String imgURL = rs.getString("img_url");
	            String description = rs.getString("description");
	            Double hotelPrice = rs.getDouble("hotel_price");

	            return new Hotel(hotelId, hotelName, hotelAddress, arrivalDate, departureDate, nbAdults, nbChildren, nbRooms, imgURL, description, hotelPrice);
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return null;
	}

	@Override
	public boolean deleteHotel(int id) {
		
		    try {
		        Connection cnx = dbc.createConnection();
		        PreparedStatement stmt = cnx.prepareStatement("DELETE FROM hotel WHERE hotel_id = ?");
		        stmt.setInt(1, id);
		        int rowsDeleted = stmt.executeUpdate();
		        return rowsDeleted > 0;
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
		    return false;
		}

	@Override
	public boolean updateHotel(Hotel hotel) {
		 try {
		        Connection cnx = dbc.createConnection();
		        PreparedStatement stmt = cnx.prepareStatement("UPDATE hotel SET hotel_name = ?, hotel_address = ?, arrival_date = ?, departure_date = ?, nb_adults = ?, nb_children = ?, nb_rooms = ?, img_url = ?, description = ?, hotel_price = ? WHERE hotel_id = ?");
		        stmt.setString(1, hotel.getHotel_name());
		        stmt.setString(2, hotel.getHotel_address());
		        stmt.setString(3, hotel.getArrival_date());
		        stmt.setString(4, hotel.getDeparture_date());
		        stmt.setInt(5, hotel.getNb_adults());
		        stmt.setInt(6, hotel.getNb_children());
		        stmt.setInt(7, hotel.getNb_rooms());
		        stmt.setString(8, hotel.getImg_url());
		        stmt.setString(9, hotel.getDescription());
		        stmt.setDouble(10, hotel.getHotel_price());
		        stmt.setInt(11, hotel.getHotel_id());

		        int rowsUpdated = stmt.executeUpdate();
		        return rowsUpdated > 0;
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
		    return false;
	}

	



	/*@Override
	public void addHotel(Hotel hotel) {
	    try {
	        Connection cnx = dbc.createConnection();
	        PreparedStatement ps = cnx.prepareStatement("INSERT INTO hotel (hotel_name, hotel_address, arrival_String, departure_date) VALUES (?, ?, ?, ?)");
	        ps.setString(1, hotel.getHotel_name());
	        ps.setString(2, hotel.getHotel_address());
	        ps.setString(3, hotel.getArrival_String());
	        ps.setString(4, hotel.getdeparture_date());
	        // Set other hotel properties in the PreparedStatement as needed

	        ps.executeUpString();
	        ps.close();
	        cnx.close();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}
	           */
	           

}
