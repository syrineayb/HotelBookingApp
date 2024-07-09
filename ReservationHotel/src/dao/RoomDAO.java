package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Room;

public class RoomDAO  implements RoomInterface{

	@Override
	public List<Room> getAll() {
		try {
            Connection cnx = dbc.createConnection();
            PreparedStatement stmt = cnx.prepareStatement("SELECT * FROM room");
            ResultSet rs = stmt.executeQuery();
            ArrayList<Room> rooms = new ArrayList<>();
            while (rs.next()) {
                int roomId = rs.getInt("room_id");
                String roomType = rs.getString("room_type");
                int nbBeds = rs.getInt("nb_beds");
                String imgURL = rs.getString("img_url");
               

                Room room = new Room(roomId, roomType, nbBeds, imgURL);
                rooms.add(room);
            }
            return rooms;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
	}

	@Override
	public void addRoom(Room room) {
		String sql = "INSERT INTO room (room_type,  nb_beds, img_url) VALUES (?, ?, ?)";
	    try (Connection cnx = dbc.createConnection(); PreparedStatement stmt = cnx.prepareStatement(sql);) {
	        stmt.setString(1, room.getRoom_type());
	        stmt.setInt(2, room.getNb_beds());
	        stmt.setString(3, room.getImg_url());
	        stmt.executeUpdate();
	        cnx.commit();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
		
	}

	@Override
	public Room findRoom(int id) {
		try {
	        Connection cnx = dbc.createConnection();
	        PreparedStatement stmt = cnx.prepareStatement("SELECT * FROM room WHERE room_id = ?");
	        stmt.setInt(1, id);
	        ResultSet rs = stmt.executeQuery();
	        if (rs.next()) {
	            int roomId = rs.getInt("room_id");
	            String roomType = rs.getString("room_type");
	            int nbBeds = rs.getInt("nb_beds");
	            String imgURL = rs.getString("img_url");
	            return new Room(roomId,roomType,nbBeds,imgURL);
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return null;
	}

	@Override
	public boolean updateRoom(Room room) {
	    try {
	        Connection cnx = dbc.createConnection();
	        PreparedStatement stmt = cnx.prepareStatement("UPDATE room SET room_type = ?, nb_beds = ?, img_url = ? WHERE room_id = ?");
	        stmt.setString(1, room.getRoom_type());
	        stmt.setInt(2, room.getNb_beds());
	        stmt.setString(3, room.getImg_url());
	        stmt.setInt(4, room.getRoom_id()); 

	        int rowsUpdated = stmt.executeUpdate();
	        return rowsUpdated > 0;
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return false;
	}

	@Override
	public boolean deleteRoom(int id) {

	    try {
	        Connection cnx = dbc.createConnection();
	        PreparedStatement stmt = cnx.prepareStatement("DELETE FROM room WHERE room_id = ?");
	        stmt.setInt(1, id);
	        int rowsDeleted = stmt.executeUpdate();
	        return rowsDeleted > 0;
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return false;
	}

}
