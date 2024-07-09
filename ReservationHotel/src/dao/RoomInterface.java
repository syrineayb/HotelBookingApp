package dao;

import java.util.List;

import model.Room;

public interface RoomInterface {
	public List<Room> getAll();
	public void addRoom(Room Room);
	public Room findRoom(int id);
	public boolean updateRoom(Room Room);
	public boolean deleteRoom(int id);
}
