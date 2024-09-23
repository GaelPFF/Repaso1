package TDA;

public class Auto {
	// atributos
	private String marcaAuto;
	private String colorAuto;
	private String modeloAuto;
	private short añoAuto;
	private byte numllantasAuto;
	// Constructor vacio
	public Auto() {}
	
	// Constructor parametrizado
	public Auto(String marcaAuto, String colorAuto, String modeloAuto, short añoAuto, byte numllantasAuto) {
		this.marcaAuto=marcaAuto;
		this.colorAuto=colorAuto;
		this.modeloAuto=modeloAuto;
		this.añoAuto=añoAuto;
		this.numllantasAuto=numllantasAuto;
	
	}
	
	public void setMarcaAuto(String marcaAuto) {
		this.marcaAuto = marcaAuto;
	}

	public void setColorAuto(String colorAuto) {
		this.colorAuto = colorAuto;
	}

	public void setModeloAuto(String modeloAuto) {
		this.modeloAuto = modeloAuto;
	}

	public void setAñoAuto(short añoAuto) {
		this.añoAuto = añoAuto;
	}

	public void setNumllantasAuto(byte numllantasAuto) {
		this.numllantasAuto = numllantasAuto;
	}

	// el toString sirve para pasar el onjeto a cadena
	@Override
	public String toString() {
		return "Auto [marcaAuto=" + marcaAuto + ", colorAuto=" + colorAuto + ", modeloAuto=" + modeloAuto + ", añoAuto="
				+ añoAuto + ", numllantasAuto=" + numllantasAuto + "]";
	}
	
	

}
	