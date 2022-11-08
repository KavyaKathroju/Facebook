package loggingDemo.exception;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ErrorMessage {

	private int statusCode;
	private String message;
	
}
