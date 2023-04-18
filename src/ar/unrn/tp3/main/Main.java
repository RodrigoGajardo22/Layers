package ar.unrn.tp3.main;

import ar.unrn.tp3.bd.JdbcParticipantes;
import ar.unrn.tp3.ui.UI;

public class Main {

	public static void main(String[] args) {

		JdbcParticipantes repositorio = new JdbcParticipantes();
		System.out.println(repositorio != null);

		UI ui = new UI(repositorio);

	}
}
