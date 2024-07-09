package dao;

import java.util.List;

import model.Hotel;

public interface HotelInterface {
	public List<Hotel> getAll();
	public void addHotel(Hotel hotel);
	public Hotel findHotel(int id);
	public boolean updateHotel(Hotel hotel);
	public boolean deleteHotel(int id);
	
}