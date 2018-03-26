package be.tlemos.api.config;

import be.tlemos.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.logging.Level;
import java.util.logging.Logger;

@ControllerAdvice(basePackages = "be.tlemos")
public class GlobalAdviceController {
    private final static Logger LOGGER = Logger.getLogger(UserService.class.getName());

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> returnStatusForIllegalArgumentException(final IllegalArgumentException exception) {
        LOGGER.log(Level.SEVERE,"ERROR: " + exception.getMessage());
        return new ResponseEntity<>(
                exception.getMessage(),
                HttpStatus.NOT_FOUND);
    }
}
