package mx.uv.ProyectoAutobuses;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import org.example.autobus.AgregarHorariosRequest;
import org.example.autobus.AgregarHorariosResponse;
import org.example.autobus.AgregarRequest;
import org.example.autobus.AgregarResponse;
import org.example.autobus.AsignarAsientoRequest;
import org.example.autobus.AsignarAsientoResponse;
import org.example.autobus.AsignarNumBoletoRequest;
import org.example.autobus.AsignarNumBoletoResponse;
import org.example.autobus.ConsultarRequest;
import org.example.autobus.ConsultarResponse;
import org.example.autobus.EliminarAsientoRequest;
import org.example.autobus.EliminarAsientoResponse;
import org.example.autobus.EliminarHorariosRequest;
import org.example.autobus.EliminarHorariosResponse;
import org.example.autobus.EliminarRequest;
import org.example.autobus.EliminarResponse;
import org.example.autobus.ModificarHorariosRequest;
import org.example.autobus.ModificarHorariosResponse;
import org.example.autobus.ModificarRequest;
import org.example.autobus.ModificarResponse;
import org.example.autobus.VerDispAsientoRequest;
import org.example.autobus.VerDispAsientoResponse;
import org.example.autobus.VerHorariosRequest;
import org.example.autobus.VerHorariosResponse;


@Endpoint
public class EndPoint {
	
	//Empieza el crud de rutas
	
	// Empieza  la parte de rutas siendo esta el agregar ruta 
	@PayloadRoot(localPart = "AgregarRequest", namespace = "http://www.example.org/Autobus")
	
	@ResponsePayload
	public AgregarResponse getNombreRuta(@RequestPayload AgregarRequest peticion) {
		AgregarResponse respuesta = new AgregarResponse();
		respuesta.setRespuesta("La ruta " + peticion.getNombreRuta() + " " + "ha sido agregada ");
		return respuesta;
		
	}
	
	//Aqui se hace la consulta de las rutas disponibles
	
	@PayloadRoot(localPart = "ConsultarRequest", namespace = "http://www.example.org/Autobus")
	
	@ResponsePayload
	public ConsultarResponse getNombreRuta(@RequestPayload ConsultarRequest peticion){
		ConsultarResponse respuesta = new ConsultarResponse();
		respuesta.setRespuesta("La ruta es" + peticion.getNombreRuta());
		return respuesta;
	}
	
	//EliminarRuta
	
	@PayloadRoot(localPart = "EliminarRequest", namespace = "http://www.example.org/Autobus")
	
	@ResponsePayload
	public EliminarResponse getNombreRuta(@RequestPayload EliminarRequest peticion){
		EliminarResponse respuesta = new EliminarResponse();
		respuesta.setRespuesta("La ruta" + peticion.getNombreRuta() + " " + "ha sido eliminada" );
		return respuesta;
	}
	
	//Modificar la ruta
	
	@PayloadRoot(localPart = "ModificarRequest", namespace = "http://www.example.org/Autobus")
	
	@ResponsePayload
	public ModificarResponse getNombreRuta(@RequestPayload ModificarRequest peticion){
		ModificarResponse respuesta = new ModificarResponse();
		respuesta.setRespuesta("La ruta" + peticion.getNombreRuta() + " " + "ha sido modificada" );
		return respuesta;
	}
	
	
	//Termina crud de rutas
	
	
	//Comienza crud de horarios
	//Editar horario
	
	
	
	@PayloadRoot(localPart = "AgregarHorariosRequest", namespace = "http://www.example.org/Autobus")
	
	@ResponsePayload
	public AgregarHorariosResponse getHorario(@RequestPayload AgregarHorariosRequest peticion){
		AgregarHorariosResponse respuesta = new AgregarHorariosResponse();
		respuesta.setRespuesta("El horario" + peticion.getHorario() + " " + "ha sido añadido" );
		return respuesta;
	}
	
	
	@PayloadRoot(localPart = "VerHorariosRequest", namespace = "http://www.example.org/Autobus")
	
	@ResponsePayload
	public VerHorariosResponse getHorario(@RequestPayload VerHorariosRequest peticion){
		VerHorariosResponse respuesta = new VerHorariosResponse();
		respuesta.setRespuesta("El horario solicitado es" + peticion.getHorario() );
		return respuesta;
	}
	
	
	@PayloadRoot(localPart = "ModificarHorariosRequest", namespace = "http://www.example.org/Autobus")
	
	@ResponsePayload
	public ModificarHorariosResponse getHorario(@RequestPayload ModificarHorariosRequest peticion){
		ModificarHorariosResponse respuesta = new ModificarHorariosResponse();
		respuesta.setRespuesta("El horario" + peticion.getHorario() + " " + "Ha sido modificado"  );
		return respuesta;
	}
	

	@PayloadRoot(localPart = "EliminarHorariosRequest", namespace = "http://www.example.org/Autobus")
	
	@ResponsePayload
	public EliminarHorariosResponse getHorario(@RequestPayload EliminarHorariosRequest peticion){
		EliminarHorariosResponse respuesta = new EliminarHorariosResponse();
		respuesta.setRespuesta("El horario" + peticion.getHorario() + " " + "Ha sido eliminado"  );
		return respuesta;
	}
	

	
 
	
	// Inicia crud de asientos 
	
	//Ver disponibilidad de asiento 
	
	
	@PayloadRoot(localPart = "VerDispAsientoRequest", namespace = "http://www.example.org/Autobus")
	
	@ResponsePayload
	public VerDispAsientoResponse getNumAsiento(@RequestPayload VerDispAsientoRequest peticion){
		VerDispAsientoResponse respuesta = new VerDispAsientoResponse();
		respuesta.setRespuesta("El asiento " + peticion.getNumAsiento() + " " + "esta disponible");
		return respuesta;
	}
	
	//Asignar asiento
	
	@PayloadRoot(localPart = "AsignarAsientoRequest", namespace = "http://www.example.org/Autobus")
	
	@ResponsePayload
	public AsignarAsientoResponse getNumAsiento(@RequestPayload AsignarAsientoRequest peticion){
		AsignarAsientoResponse respuesta = new AsignarAsientoResponse();
		respuesta.setRespuesta("El asiento " + peticion.getNumAsiento() + " " + "ha sido asignado");
		return respuesta;
	}
	
	
	//Eliminar Asiento
	
	@PayloadRoot(localPart = "EliminarAsientoRequest", namespace = "http://www.example.org/Autobus")
	
	@ResponsePayload
	public EliminarAsientoResponse getNumAsiento(@RequestPayload EliminarAsientoRequest peticion){
		EliminarAsientoResponse respuesta = new EliminarAsientoResponse();
		respuesta.setRespuesta("El asiento " + peticion.getNumAsiento() + " " + "ha sido Eliminado");
		return respuesta;
	}
	
	
	
	@PayloadRoot(localPart = "AsignarNumBoletoRequest", namespace = "http://www.example.org/Autobus")
	
	@ResponsePayload
	public AsignarNumBoletoResponse getNumBoleto(@RequestPayload AsignarNumBoletoRequest peticion){
		AsignarNumBoletoResponse respuesta = new AsignarNumBoletoResponse();
		respuesta.setRespuesta("Tu numero de boleto es " + peticion.getNumBoleto());
		return respuesta;
	}
	
	
	

}
	
	
	
	

