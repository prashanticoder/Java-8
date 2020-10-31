
public class Transcation {
     private final Trader trader;
     private final int year;
     private final int value;
     
     
	public Transcation(Trader trader, int year, int value) {
		super();
		this.trader = trader;
		this.year = year;
		this.value = value;
	}
	public Trader getTrader() {
		return trader;
	}
	public int getYear() {
		return year;
	}
	public int getValue() {
		return value;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Transcation [trader=");
		builder.append(trader);
		builder.append(", year=");
		builder.append(year);
		builder.append(", value=");
		builder.append(value);
		builder.append("]");
		return builder.toString();
	}
     
	

	}


