package periodensystem;

public class Metall {

	private boolean halbmetall; // true, wenn es sich um ein Halbmetall handelt
	private double leitfaehigkeit;

	public Metall() {
		
	}

	public Metall(boolean halbmetall, double leitfaehigkeit) {

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
		return "{ " + getClass().getSimpleName() + ", Halbmetall=" + halbmetall + ", Leitfaehigkeit=" + leitfaehigkeit
				+ "}";
	}

}
