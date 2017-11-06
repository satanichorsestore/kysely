package kysely.dao;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class OsoitettaEiLoydyPoikkeus extends RuntimeException {

	public OsoitettaEiLoydyPoikkeus(Exception cause) {
		super(cause);
	}
	
}
