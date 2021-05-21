package entity;

public class CommonCard extends Card {
	private Integer number;


    public Integer getNumber() {
		return number;
	}


	public void setNumber(Integer number) {
		this.number = number;
	}


	public CommonCard() {
		super();
	}


	public CommonCard(Integer number) {
		super();
		this.number = number;
	}


	public String toString(){
        return this.color + String.valueOf(number) + this.color.RESET;
    }
}
