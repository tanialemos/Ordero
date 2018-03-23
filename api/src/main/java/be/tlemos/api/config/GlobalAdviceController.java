package be.tlemos.api.config;

import be.tlemos.service.UserService;
import org.springframework.web.bind.annotation.ControllerAdvice;

import java.util.logging.Logger;

@ControllerAdvice(basePackages = "be.tlemos")
public class GlobalAdviceController {
    private final static Logger LOGGER = Logger.getLogger(UserService.class.getName());

}
