package ejercicio3;

public class EdificioDeOficinas extends Edificio{
	
	private int oficinas;
	
	public EdificioDeOficinas() {
		super();
		this.oficinas = 0;
	};
	

	public EdificioDeOficinas(int oficinas,double SuperficieEdificio, ITipoInstalacion TipoInstalacion) {
		super(SuperficieEdificio,TipoInstalacion );
		this.oficinas = oficinas;
	}


	public int getOficinas() {
		return oficinas;
	}


	@Override
	public String toString() {
		return "EdificioDeOficinas [oficinas=" + oficinas + "]";
	}


	




}
