package lk.ijse.Spring.pojo;

import org.springframework.stereotype.Component;

/**
 * @author : Ashan Sandeep
 * @date : 1/6/2023
 * @since : 0.1.0
 **/

@Component("pojo")
public class PojoOne {

    public PojoOne(){
        System.out.println("PojoOne : Instantiated");
    }

}
