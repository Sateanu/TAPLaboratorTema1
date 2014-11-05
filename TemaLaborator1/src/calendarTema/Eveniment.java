package calendarTema;

public class Eveniment {

	private String text;
	private Integer luna;
	
	String getText() {
		return text;
	}
	
	void setText(String text) {
		this.text = text;
	}
	
	Integer getLuna() {
		return luna;
	}
	
	void setLuna(Integer luna) {
		this.luna = luna;
	}
	
	public Eveniment()
	{
		
	}
	public Eveniment(String text, Integer luna)
	{
		this.text=text;
		this.luna=luna;
	}
	
	@Override
	public String toString()
	{
		return this.text + " - Luna " + luna;
	}
	
}
