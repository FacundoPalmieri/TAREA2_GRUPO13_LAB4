package ejercicio3;

public class EdificioDeOficinas extends Edificio implements ITipoInstalacion{
	
	private int oficinas;
	
	public EdificioDeOficinas() {
		super();
		this.oficinas = 0;
	};
	

	public EdificioDeOficinas(int oficinas,double SuperficieEdificio) {
		super(SuperficieEdificio);
		this.oficinas = oficinas;
	}


	public int getOficinas() {
		return oficinas;
	}


	@Override
	public String toString() {
		return "EdificioDeOficinas - Superficie= "+getSuperficieEdificio()+" - Cantidad de oficinas= " + oficinas + " - Tipo de Instalacion: "+getTipoDeInstalacion();
	}


	@Override
	public int getTipoDeInstalacion() {
		return 1;
	}


	




}
