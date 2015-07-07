
public class Elevator {
	
	private static Elevator instance=null;
	public Button panel_button;
	public Door elevator_door;
	public Floor current_floor;
	
	private Elevator(int total_floors,Floor current_floor) {
		// TODO Auto-generated constructor stub
		this.current_floor=current_floor;
		this.panel_button=new Panel_button(total_floors);
		this.elevator_door=new Elevator_door();
	}
	
	public static Elevator create_elevator(int total_floors,Floor current_floor)
	{
		if(instance==null)
		{
			instance=new Elevator(total_floors,current_floor);
		}
		return instance;
	}
	
	public int get_direction(int request_floor_no)
	{
		if(request_floor_no>current_floor.floor_no)
		{
			return 1;
		}
		else if(request_floor_no<current_floor.floor_no)
		{
			return 0;
		}
		return -1;
	}
}
