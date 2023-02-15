package jdbc.modelo;

import java.sql.Date;

public class Reserva {
	
	private Integer id;
	private Date fecha_entrada;
	private Date fecha_salida;
	private String valor;
	private String forma_pago;
	
	
	public Reserva(Date fecha_entrada, Date fecha_salida, String valor, String forma_pago) {
		super();		
		this.fecha_entrada = fecha_entrada;
		this.fecha_salida = fecha_salida;
		this.valor = valor;
		this.forma_pago = forma_pago;
	}
		
	public Reserva(Integer id, Date fecha_entrada, Date fecha_salida, String valor, String forma_pago) {
		this.id = id;
		this.fecha_entrada = fecha_entrada;
		this.fecha_salida = fecha_salida;
		this.valor = valor;
		this.forma_pago = forma_pago;
	}

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	public Date getfecha_entrada() {
		return fecha_entrada;
	}

	public Date getfecha_salida() {
		return fecha_salida;
	}

	public String getvalor() {
		return valor;
	}

	public String getforma_pago() {
		return forma_pago;
	}

	
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return String.format("La reserva generada fue: %d, %s, %s, %s, %s", this.id, this.fechaE, this.fechaS, this.valor, this.formaPago);
//	}
//	
	
	
}

