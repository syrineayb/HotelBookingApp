package model;


public class Hotel {
    private int hotel_id;
    private String hotel_name;
    private String hotel_address;
    private String arrival_date;
    private String departure_date;
    private int nb_adults;
    private int nb_children;
    private int nb_rooms;
    private String img_url;
    private String description;
    private double hotel_price;
    public Hotel(int hotel_id, String hotel_name, String hotel_address, String arrival_date, String departure_date) {
		super();
		this.hotel_id = hotel_id;
		this.hotel_name = hotel_name;
		this.hotel_address = hotel_address;
		this.arrival_date = arrival_date;
		this.departure_date = departure_date;
	}
	
    
    public Hotel(String hotel_name, String hotel_address, String arrival_date, String departure_date) {
		super();
		this.hotel_name = hotel_name;
		this.hotel_address = hotel_address;
		this.arrival_date = arrival_date;
		this.departure_date = departure_date;
	}

	public Hotel(int hotel_id, String hotel_name, String hotel_address, String arrival_date, String departure_date,
			int nb_adults, int nb_children, int nb_rooms, String img_url, String description, double hotel_price) {
		super();
		this.hotel_id = hotel_id;
		this.hotel_name = hotel_name;
		this.hotel_address = hotel_address;
		this.arrival_date = arrival_date;
		this.departure_date = departure_date;
		this.nb_adults = nb_adults;
		this.nb_children = nb_children;
		this.nb_rooms = nb_rooms;
		this.img_url = img_url;
		this.description = description;
		this.hotel_price = hotel_price;
	}

	public Hotel(int hotel_id, String hotel_name, String hotel_address, int nb_rooms) {
    	this.hotel_id=hotel_id;
    	this.hotel_name=hotel_name;
    	this.hotel_address=hotel_address;
    	this.nb_children= nb_rooms;
    			
    }
    
	
	public Hotel(String hotel_name, String hotel_address, String arrival_date, String departure_date, int nb_adults,
			int nb_children, int nb_rooms, String img_url, String description, double hotel_price) {
		super();
		this.hotel_name = hotel_name;
		this.hotel_address = hotel_address;
		this.arrival_date = arrival_date;
		this.departure_date = departure_date;
		this.nb_adults = nb_adults;
		this.nb_children = nb_children;
		this.nb_rooms = nb_rooms;
		this.img_url = img_url;
		this.description = description;
		this.hotel_price = hotel_price;
	}

	public int getHotel_id() {
		return hotel_id;
	}
	public void setHotel_id(int hotel_id) {
		this.hotel_id = hotel_id;
	}
	public String getHotel_name() {
		return hotel_name;
	}
	public void setHotel_name(String hotel_name) {
		this.hotel_name = hotel_name;
	}
	public String getHotel_address() {
		return hotel_address;
	}
	public void setHotel_address(String hotel_address) {
		this.hotel_address = hotel_address;
	}
	public String getArrival_date() {
		return arrival_date;
	}
	public void setArrival_date(String arrival_date) {
		this.arrival_date = arrival_date;
	}
	public String getDeparture_date() {
		return departure_date;
	}
	public void setDeparture_date(String departure_date) {
		this.departure_date = departure_date;
	}
	public int getNb_adults() {
		return nb_adults;
	}
	public void setNb_adults(int nb_adults) {
		this.nb_adults = nb_adults;
	}
	public int getNb_children() {
		return nb_children;
	}
	public void setNb_children(int nb_children) {
		this.nb_children = nb_children;
	}
	public int getNb_rooms() {
		return nb_rooms;
	}
	public void setNb_rooms(int nb_rooms) {
		this.nb_rooms = nb_rooms;
	}
	public String getImg_url() {
		return img_url;
	}
	public void setImg_url(String img_url) {
		this.img_url = img_url;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getHotel_price() {
		return hotel_price;
	}
	public void setHotel_price(double hotel_price) {
		this.hotel_price = hotel_price;
	}
    
    
}