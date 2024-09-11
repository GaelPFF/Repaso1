package TDA;

public class Televisor {
	private String marcaTv;
	private String tecpantallaTv;
	private String formaTv;
	private byte pulgadasTv;
	
	public Televisor() {}
	
	public Televisor(String marcaTv, String tecpantallaTv, String formaTv, byte pulgadasTv) {
		this.marcaTv=marcaTv;
		this.tecpantallaTv=tecpantallaTv;
		this.formaTv=formaTv;
		this.pulgadasTv=pulgadasTv;
	}

	public void setMarcaTv(String marcaTv) {
		this.marcaTv = marcaTv;
	}

	public void setTecpantallaTv(String tecpantallaTv) {
		this.tecpantallaTv = tecpantallaTv;
	}

	public void setFormaTv(String formaTv) {
		this.formaTv = formaTv;
	}

	public void setPulgadasTv(byte pulgadasTv) {
		this.pulgadasTv = pulgadasTv;
	}

	@Override
	public String toString() {
		return "Televisor [marcaTv=" + marcaTv + ", tecpantallaTv=" + tecpantallaTv + ", formaTv=" + formaTv
				+ ", pulgadasTv=" + pulgadasTv + "]";
	}
	

}
