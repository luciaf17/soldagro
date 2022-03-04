package model;

import java.util.Date;
import java.util.LinkedList;

public class Pedido {
	
	private Date fecha;
	private Date fechaEntrega;
	private String descripcion;
	private String ordenDeCompra;
	private LinkedList<Pieza> piezas;
	private int cantidad;
	private Cliente cliente;
	private String plano;
	private String revision;

}
