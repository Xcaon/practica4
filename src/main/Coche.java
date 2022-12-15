package pruebasUnit;

public class Coche {
	
	// Nombre del coche
	private String modelo;
	private String marca;
	private int precio;
	private String color;
	
	private int financiacionMeses;
	private int entrada;
	private int cuota;
	private String nombreConductor;
	private String prueba12we23r2;
	 
    //Constructor 
    //@param message to be printed 
    public Coche(String modelo, String marca, int precio, String color, int financiacionMeses, int entrada, int cuota, String nombreConductor){ 
       this.modelo = modelo; 
       this.marca = marca;
       this.precio = precio;
       this.color = color;
       this.financiacionMeses = financiacionMeses;
       this.entrada = entrada;
       this.cuota = cuota;
       this.nombreConductor = nombreConductor; 
    }

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getFinanciacionMeses() {
		return financiacionMeses;
	}

	public void setFinanciacionMeses(int financiacionMeses) {
		this.financiacionMeses = financiacionMeses;
	}

	public int getEntrada() {
		return entrada;
	}

	public void setEntrada(int entrada) {
		this.entrada = entrada;
	}

	public int getCuota() {
		return cuota;
	}

	public void setCuota(int cuota) {
		this.cuota = cuota;
	}

	public String getNombreConductor() {
		return nombreConductor;
	}

	public void setNombreConductor(String nombreConductor) {
		this.nombreConductor = nombreConductor;
	}

	
	
	
        
    
    
    
}
