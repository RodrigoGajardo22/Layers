package ar.unrn.tp3.main;

import ar.unrn.tp3.bd.JdbcParticipantes;
import ar.unrn.tp3.modelo.RegistroUsuario;
import ar.unrn.tp3.ui.UI;

public class Main {

	public static void main(String[] args) {

		JdbcParticipantes repositorio = new JdbcParticipantes();

		UI                ui          = new UI(new RegistroUsuario(repositorio));

	}
}
