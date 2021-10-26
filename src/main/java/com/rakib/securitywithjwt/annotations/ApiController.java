package com.rakib.securitywithjwt.annotations;

import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Controller
@ResponseBody
@CrossOrigin(origins = "*", methods =
        {GET, POST, PUT, DELETE, OPTIONS})
public @interface ApiController {
    @AliasFor(
            annotation = Controller.class
    )
    String value() default "";
}
