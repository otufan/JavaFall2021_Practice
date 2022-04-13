package periodensystem;

public class Metall extends Element {

	private boolean halbmetall; // true, wenn es sich um ein Halbmetall handelt
	private double leitfaehigkeit;

	public Metall() {
		
	}


	public Metall(String symbol, String name,  int kernladungszahl, char schale, int aggregat, boolean hauptgruppe,
			boolean halbmetall, double leitfaehigkeit) {
		
		setName(name);
		setSymbol(symbol);
		setKernladungszahl(kernladungszahl);
		setSchale(schale);
		setAggregat(aggregat);
		setHauptgruppe(hauptgruppe);
		setHalbmetall(halbmetall);
		setLeitfaehigkeit(leitfaehigkeit);
		
	}

	public boolean isHalbmetall() {
		return this.halbmetall;
	}

	public void setHalbmetall(boolean halbmetall) {
		this.halbmetall = halbmetall;
	}

	public double getLeitfaehigkeit() {
		return leitfaehigkeit;
	}

	public void setLeitfaehigkeit(double leitfaehigkeit) {
		this.leitfaehigkeit = leitfaehigkeit;
	}

	@Override
	public String toString() {
		return super.toString() + ", \tHalbmetall=" + halbmetall + ", \tLeitfaehigkeit=" + leitfaehigkeit;
	}

}