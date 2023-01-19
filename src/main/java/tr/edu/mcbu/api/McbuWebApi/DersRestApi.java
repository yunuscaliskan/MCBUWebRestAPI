package tr.edu.mcbu.api.McbuWebApi;

import java.util.ArrayList;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController // (Annotation) Rest web servis sınıfı özelliği kazandırıyoruz
@RequestMapping("/dersler") // "/" ile baslayan web isteklerini bu sınıfa yönlendirir"
public class DersRestApi {

	private static final List<String> DERSLER = new ArrayList<>();
	{
		DERSLER.add("Kombinatoryal Optimizasyon");
		DERSLER.add("Veri Madenciligi");
		DERSLER.add("Insan Bilgisayar Etkilesimi");
		DERSLER.add("Ataturk Ilkeleri ve Inkılap Tarihi II");
		DERSLER.add("Problem Cozumunde Bilisimsel Yaklasimlar");
		DERSLER.add("Otomata Teorisi ve Formal Diller");

	}

	@GetMapping("/")
	public List<String> listele() {
		return DERSLER;

	}

	@PostMapping("/")
	public boolean add(@RequestBody String dersAd) {
		DERSLER.add(dersAd);
		return true;
	}

	@DeleteMapping("/")
	public ResponseEntity<DersRestApi> deleteall() {
		return null;

	}

	
}