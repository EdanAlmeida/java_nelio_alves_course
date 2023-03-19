package entities;

public class RealStateAgent {

	private String creci;
	private String name;
	
	public RealStateAgent() {
	}

	public RealStateAgent(String creci, String name) {
		this.creci = creci;
		this.name = name;
	}

	public String getCreci() {
		return creci;
	}

	public void setCreci(String creci) {
		this.creci = creci;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
