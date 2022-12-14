package pe.edu.uni.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.uni.app.model.Empleado;
import pe.edu.uni.app.repository.EmpleadoRepository;
import pe.edu.uni.app.service.EmpleadoService;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

	@Autowired
	private EmpleadoRepository empleadoRepository;
	
	@Override
	public List<Empleado> listarTodos() {
		return (List<Empleado>) empleadoRepository.findAll();
	}

	@Override
	public Empleado buscarPorId(Long id) {
		// return empleadoRepository.findById(id).orElse(null);
		return empleadoRepository.buscarPorId(id);
	}

	@Override
	public Empleado grabar(Empleado empleado) {
		return empleadoRepository.save(empleado);
	}

	@Override
	public void eliminar(Long id) {
		empleadoRepository.deleteById(id);
	}

	@Override
	public List<Empleado> findByNombreLike(String nombre) {
		return empleadoRepository.findByNombreLike(nombre);
	}

	@Override
	public List<Empleado> findByNombreContaining(String nombre) {
		return empleadoRepository.findByNombreLike(nombre);
	}

	public Empleado buscarPorEmail(String email) {
		return empleadoRepository.buscarPorEmail(email);
	}
	
	public List<Empleado> buscarPorNombre(String nombre){
		return empleadoRepository.buscarPorNombre(nombre);
	}
	
	public List<Empleado> buscarEmpleados(String nombre, String apellido){
		return empleadoRepository.buscarEmpleados(nombre, apellido);
	}
	
}
