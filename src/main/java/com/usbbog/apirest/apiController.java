package com.usbbog.apirest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class apiController {
	
	private List<String> paises = new ArrayList <String>();
	
	public apiController() {
		paises.add("Colombia");
		paises.add("Canadá");
		paises.add("Ecuador");
		paises.add("Perú");
		paises.add("Rusia");
		paises.add("Australia");
		paises.add("Alemania");
		paises.add("Suiza");
		paises.add("Noruega");
		paises.add("Suecia");
	}
	
	// READ - Obtener todos los países
	@GetMapping("/paises")
	public List<String> getAllCountries(){
		return paises;
	}
	
	// READ - Obtener un país por ID
	@GetMapping("/paises/{idPais}")
	public String getCountryById(@PathVariable int idPais) {
		if(idPais >= 0 && idPais < paises.size()) {
			return paises.get(idPais);
		} else {
			return "País no encontrado";
		}
	}
	
	// CREATE - Agregar un nuevo país
	@PostMapping("/paises")
	public String addCountry(@RequestBody String nuevoPais) {
		paises.add(nuevoPais);
		return "País agregado exitosamente";
	}
	
	// UPDATE - Actualizar un país existente
	@PutMapping("/paises/{idPais}")
	public String updateCountry(@PathVariable int idPais, @RequestBody String paisActualizado) {
		if(idPais >= 0 && idPais < paises.size()) {
			paises.set(idPais, paisActualizado);
			return "País actualizado exitosamente";
		} else {
			return "País no encontrado";
		}
	}
	
	// DELETE - Eliminar un país
	@DeleteMapping("/paises/{idPais}")
	public String deleteCountry(@PathVariable int idPais) {
		if(idPais >= 0 && idPais < paises.size()) {
			paises.remove(idPais);
			return "País eliminado exitosamente";
		} else {
			return "País no encontrado";
		}
	}
}

