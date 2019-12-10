package pe.edu.delfines;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import pe.edu.delfines.models.entity.Alquiler;
import pe.edu.delfines.models.entity.Cliente;
import pe.edu.delfines.models.repository.AlquilerRepository;
import pe.edu.delfines.models.repository.ClienteRepository;
@RunWith(SpringRunner.class)
@SpringBootTest
class DelfinesApplicationTests {
	@Autowired
	private ClienteRepository  clienteRepository; 
	
	@Autowired
	private AlquilerRepository alquilerRepository;
	@Test
	void contextLoads() {
		try {
			
			Cliente jean = new Cliente  ();
			jean.setId(1);
			jean.setDocumento("docu");
			jean.setNombre("jean");
		jean.setFechaNacimiento(new Date(2019, 9, 9));
		jean.setLugarNacimiento("jr.tupac");
		jean.setSexo('M');
		jean.setObservacion("casa elegante" );
		
		jean= clienteRepository.save(jean);
		
		Cliente raul = new Cliente  ();
		raul.setId(2);
		raul.setDocumento("docu01");
		raul.setNombre("raul");
		raul.setFechaNacimiento(new Date(2019, 15, 9));
		raul.setLugarNacimiento("jr.tupac 941");
		raul.setSexo('M');
		raul.setObservacion("casa fina" );
		
		raul= clienteRepository.save(raul);
		
		//ALquiler
		Alquiler  tipo1 = new Alquiler(); 
		tipo1.setId(1);
		tipo1.setPrecio(120.5f);
		tipo1.setFecha_entrada(new Date(2019, 9, 9));
		tipo1.setFecha_salida(new Date(2019, 12, 9));
		tipo1.setEstado("activo");
		tipo1.setObservacion("buen estado");
		
		tipo1=alquilerRepository.save(tipo1);
		
		Alquiler  tipo2 = new Alquiler(); 
		tipo2.setId(2);
		tipo2.setPrecio(100.5f);
		tipo2.setFecha_entrada(new Date(2019, 12, 9));
		tipo2.setFecha_salida(new Date(2019, 20, 9));
		tipo2.setEstado("inactivo");
		tipo2.setObservacion("mal estado");
		
		tipo1=alquilerRepository.save(tipo1);
		
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
}
}
