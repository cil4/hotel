package jdbc.controller;
import java.sql.Connection;
import java.sql.Date;
import java.util.List;

import jdbc.dao.HuespedesDAO;
import jdbc.modelo.Huespedes;
import views.ConnectionFactory;


public class HuespedesController {
	 private HuespedesDAO huespedDAO;
	 
	 public HuespedesController() {
			Connection connection = new ConnectionFactory().recuperarConexion();
			this.huespedDAO = new HuespedesDAO(connection);
		}
	 
		public void guardar(Huespedes huespedes) {
			this.huespedDAO.guardar(huespedes);
		}
		public List<Huespedes> listarHuespedes() {
			return this.huespedDAO.listarHuespedes();
		}
		
		public List<Huespedes> listarHuespedesId(String id) {
			return this.huespedDAO.buscarId(id);
		}
		
		public void actualizar(String nombre, String apellido, Date fechaNacimiento, String nacionalidad, String telefono, Integer idReservas, Integer id) {
			this.huespedDAO.Actualizar(nombre, apellido, fechaNacimiento, nacionalidad, telefono, idReservas, id);
		}
		
		public void Eliminar(Integer id) {
			this.huespedDAO.Eliminar(id);
		}
}
