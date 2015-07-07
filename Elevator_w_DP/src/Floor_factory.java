
public class Floor_factory {

	public Floor_factory() {
		// TODO Auto-generated constructor stub
	}
	
	public Floor create_floor(String type,int floor_no, Button up_button, Button down_button)
	{
		if(type.equals("top"))
		{
			return new Top_floor(floor_no, up_button, down_button);
		}
		else if(type.equals("intermediate"))
		{
			return new Intermediate_floor(floor_no, up_button, down_button);
		}
		else if(type.equals("ground"))
		{
			return new Ground_floor(floor_no, up_button, down_button);
		}
		else
		{
			return null;
		}
	}
}
