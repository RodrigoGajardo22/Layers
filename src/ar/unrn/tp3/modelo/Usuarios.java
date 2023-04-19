package ar.unrn.tp3.modelo;

//Puente que conecta con la UI

public interface Usuarios {

	public void nuevoRegistro(String nombre, String tel, String region) throws ErrorDeDatos;

}
