package entities;

public class Sale {

	private Integer id;
	private RealStateAgent realStateAgent;
	private Property property;

	public Sale() {
	}

	public Sale(Integer id, RealStateAgent realStateAgent, Property property) {
		this.id = id;
		this.realStateAgent = realStateAgent;
		this.property = property;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public RealStateAgent getRealStateAgent() {
		return realStateAgent;
	}

	public void setRealStateAgent(RealStateAgent realStateAgent) {
		this.realStateAgent = realStateAgent;
	}

	public Property getProperty() {
		return property;
	}

	public void setProperty(Property property) {
		this.property = property;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Venda= " + id + "\n");
		sb.append("Corretor= " + realStateAgent.getName() + "\n");
		sb.append("Creci= " + realStateAgent.getCreci() + "\n");
		sb.append("Imóvel= " + property.getType() + "\n");
		sb.append("Preço= " + String.format("%.2f", property.getPrice()) + "\n");
		return sb.toString();
	}

}
