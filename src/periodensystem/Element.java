package periodensystem;

public class Element {
	
	private String name;
	private String symbol;
	private int kernladungszahl; //Ordnungzahl
	private char schale;
	private int aggregat; // Aggregatzustand bei 25C (298K) --> FEST=1, FLUESSIG=2, GASFOERMIG=3
	private boolean hauptgruppe; // Hauptgruppe/Nebengruppe --> Haupt= True , Neben=False
	
	
		
	public Element() {
		
	}
	
	public Element(String symbol, String name,  int kernladungszahl, char schale, int aggregat, boolean hauptgruppe) {
		
		setName(name);
		setSymbol(symbol);
		setKernladungszahl(kernladungszahl);
		setSchale(schale);
		setAggregat(aggregat);
		setHauptgruppe(hauptgruppe);
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}


	public int getKernladungszahl() {
		return kernladungszahl;
	}

	public void setKernladungszahl(int kernladungszahl) {
		this.kernladungszahl = kernladungszahl;
	}

	public char getSchale() {
		return schale;
	}

	public void setSchale(char schale) {
		this.schale = schale;
	}

	public int getAggregat() {
		return aggregat;
	}

	public void setAggregat(int aggregat) {
		this.aggregat = aggregat;
	}

	public boolean isHauptgruppe() {
		return hauptgruppe;
	}

	public void setHauptgruppe(boolean hauptgruppe) {
		this.hauptgruppe = hauptgruppe;
	}
	

	@Override
	public String toString() {
		
		String aggr=aggregat==1 ? "fest" : aggregat==2? "flüssig" : "gasf.";
		String h=hauptgruppe ? "H" : "N";
		
		
		return getClass().getSimpleName()+ "   \tSymbol=" + symbol +", \tName=" + name +  ",              \tOZ=" + kernladungszahl + ",    \tSchale="
				+ schale + ",     \tAggreg.=" + aggr + ",     \tH/N=" + h;
	}

	@Override
	public boolean equals(Object obj) {
		
		return super.equals(obj);
	}

	

}