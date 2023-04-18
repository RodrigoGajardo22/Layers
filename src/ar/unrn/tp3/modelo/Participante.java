package ar.unrn.tp3.modelo;

public class Participante {

	private String telefono;
	private String nombre;
	private String region;

	public Participante(String nombreYApellido, String telefono, String region) throws ErrorDeDatos {

		this.nombre   = nombreYApellido;
		this.telefono = telefono;
		this.region   = region;

		validarDatos(nombre, telefono, region);

	}

	private void validarDatos(String nombre, String tel, String region) throws ErrorDeDatos {
		if (nombre.equals("")) {
			throw new ErrorDeDatos("Cargue su nombre");
		}
		if (telefono.equals("")) {
			throw new ErrorDeDatos("Debe cargar un telefono");

		}
		if (!validarTelefono(telefono)) {
			throw new ErrorDeDatos("El teléfono debe ingresarse de la siguiente forma: NNNN-NNNNNN");

		}
		if (!region.equals("China") && !region.equals("US") && !region.equals("Europa")) {
			throw new ErrorDeDatos("Region desconocida. Las conocidas son: China, US, Europa");

		}
	}

	public boolean validarTelefono(String telefono) {
		String regex = "\\d{4}-\\d{6}";
		return telefono.matches(regex);
	}

	public String datos() {
		if (nombre != null)
			return "" + nombre + "|" + telefono + "|" + region;
		else
			return "No se encontraron datos.";
	}

}
