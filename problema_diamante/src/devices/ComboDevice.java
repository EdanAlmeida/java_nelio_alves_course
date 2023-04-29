package devices;

public class ComboDevice extends Device implements Scanner, Printer {
	//não existe como extender mais de uma interface em Java
	//no entanto, é possivel impementar mais de uma interface
	//nesse caso, o comboDevice herda de Device e implementa Scanner e Printer
	//o que é perfeitamente possível


	public ComboDevice(String serialNumber) {
		super(serialNumber);
	}

	//sobreescreve o método que vem da interface Printer
	@Override
	public void print(String doc) {
		System.out.println("Combo printing: " + doc);
	}

	//sobreescreve o método que vem da interface Scanner
	@Override
	public String scan() {
		return "Combo scan result";
	}

	//sobreescreve o método que vem da classe abstrata Device
	@Override
	public void processDoc(String doc) {
		System.out.println("Combo processing: " + doc);
	}
}