package WSSpringBoot.WSSpringBoot.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class NfaResource {

	private Map<Integer, Nfa> nfas;

	public NfaResource(){
		nfas = new HashMap<Integer, Nfa>();

		Nfa n1 = new Nfa(1,"1001","abc");
		Nfa n2 = new Nfa(2,"1002","def");
		Nfa n3 = new Nfa(3,"1003","ghi");

		nfas.put(1, n1);
		nfas.put(2, n2);
		nfas.put(3, n3);
	}

	@RequestMapping(value = "/nfas", method = RequestMethod.GET)
	public ResponseEntity<List<Nfa>> listar(){
		return new ResponseEntity<List<Nfa>>(new ArrayList<Nfa>(nfas.values()), HttpStatus.OK);
	}

	@RequestMapping(value = "/nfas/{id}", method = RequestMethod.GET)
	public ResponseEntity<List<Nfa>> buscar(@PathVariable("id") Integer id){
		//Nfa nfaRes = nfas.get(id);
		Map<Integer, Nfa> nfaRes = new HashMap<Integer, Nfa>();
		nfaRes.put(id, nfas.get(id));

		if(nfas.get(id) == null){
			return new ResponseEntity<>(HttpStatus.OK);
		}else{
			return new ResponseEntity<List<Nfa>>(new ArrayList<Nfa>(nfaRes.values()), HttpStatus.OK);
			//return new ResponseEntity<>(HttpStatus.OK);
		}
	}

	@RequestMapping(value = "/nfas/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deletar(@PathVariable("id") int id){
		Nfa nfaRes = nfas.remove(id);

		if (nfaRes == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<>(HttpStatus.NO_CONTENT);

	}

}
