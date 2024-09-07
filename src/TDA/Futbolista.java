package TDA;

public class Futbolista {
	private String nombreFutbolista;
	private String posicionFutbolista;
	private String equipoFutbolista;
	private String colortenisFutbolista;
	private String pieFutbolista;
	private byte numeroFutbolista;
	// Constructor vacio
	public Futbolista() {}
	
	// Constructor parametrizado
	public Futbolista(String nombreFutbolista, String posicionFutbolista, String equipoFutbolista, String colortenisFutbolista,String pieFutbolista, byte numeroFutbolista) {
		this.nombreFutbolista=nombreFutbolista;
		this.posicionFutbolista=posicionFutbolista;
		this.equipoFutbolista=equipoFutbolista;
		this.colortenisFutbolista=colortenisFutbolista;
		this.pieFutbolista=pieFutbolista;
		this.numeroFutbolista=numeroFutbolista;
	
	}

	public void setNombreFutbolista(String nombreFutbolista) {
		this.nombreFutbolista = nombreFutbolista;
	}

	public void setPosicionFutbolista(String posicionFutbolista) {
		this.posicionFutbolista = posicionFutbolista;
	}

	public void setEquipoFutbolista(String equipoFutbolista) {
		this.equipoFutbolista = equipoFutbolista;
	}

	public void setColortenisFutbolista(String colortenisFutbolista) {
		this.colortenisFutbolista = colortenisFutbolista;
	}
	
	public void setPieFutbolista(String pieFutbolista) {
		this.pieFutbolista = pieFutbolista;
	}

	public void setNumeroFutbolista(byte numeroFutbolista) {
		this.numeroFutbolista = numeroFutbolista;
	}

	@Override
	public String toString() {
		return "Futbolista [nombreFutbolista=" + nombreFutbolista + ", posicionFutbolista=" + posicionFutbolista
				+ ", equipoFutbolista=" + equipoFutbolista + ", colortenisFutbolista=" + colortenisFutbolista
				+ ", pieFutbolista=" + pieFutbolista + ", numeroFutbolista=" + numeroFutbolista + "]";
	}

	
}
