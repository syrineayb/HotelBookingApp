package model;

public class Room {
	private int room_id;
	private int nb_beds;
	private String room_type;
	private String img_url;
	public Room(int room_id, String room_type ,int nb_beds,String img_url) {
		super();
		this.room_id = room_id;
		this.nb_beds = nb_beds;
		this.room_type = room_type;
		this.img_url = img_url;
	}
	public Room(String room_type,int nb_beds, String img_url) {
		super();
		this.nb_beds = nb_beds;
		this.room_type = room_type;
		this.img_url = img_url;
	}
	public int getRoom_id() {
		return room_id;
	}
	public void setRoom_id(int room_id) {
		this.room_id = room_id;
	}
	public int getNb_beds() {
		return nb_beds;
	}
	public void setNb_beds(int nb_beds) {
		this.nb_beds = nb_beds;
	}
	public String getRoom_type() {
		return room_type;
	}
	public void setRoom_type(String room_type) {
		this.room_type = room_type;
	}
	public String getImg_url() {
		return img_url;
	}
	public void setImg_url(String img_url) {
		this.img_url = img_url;
	}
	@Override
	public String toString() {
		return "Room [room_id=" + room_id + ", nb_beds=" + nb_beds + ", room_type=" + room_type + ", img_url=" + img_url
				+ "]";
	}
	
	
}
