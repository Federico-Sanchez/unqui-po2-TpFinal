package desafio;

import java.util.Date;

import muestra.Muestra;

public class DesafioIncompleto extends DesafioState {

	public void nuevaMuestra(DesafioUsuario desafioUsuario, Muestra muestra) {
		if (desafioUsuario.esCompatibleCon(muestra)) {
			desafioUsuario.incrementarMuestrasRecolectadas();
			
			if(desafioUsuario.esUltimaMuestra()) {
				desafioUsuario.setEstado(new DesafioCompletado());
				desafioUsuario.setMomentoSuperado(new Date());
			}
		}
	}

	@Override
	public int getPorcentajeDeCompletitud(DesafioUsuario desafioUsuario) {
		return desafioUsuario.muestrasCompatibles() / desafioUsuario.getDesafio().getCantidadDeMuestra();
	};
	
}