package astrochart.shared;

public enum Month {
	January(1),
	February(2),
	March(3), 
	April(4),
	May(5), 
	June(6), 
	July(7),
	August(8),
	September(9),
	October(10), 
	November(11), 
	December(12);
	
	final int number;
	
	private Month(final int number) {
        this.number = number;
    }
    
    public int getNumber() {
        return number;
    }
    
    @Override
    public String toString() {
        return this.name();
    }
}
