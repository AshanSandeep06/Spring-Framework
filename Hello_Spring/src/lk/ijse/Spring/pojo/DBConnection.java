package lk.ijse.Spring.pojo;

import org.springframework.stereotype.Component;

/**
 * @author : Ashan Sandeep
 * @date : 1/6/2023
 * @since : 0.1.0
 **/

@Component
public class DBConnection {
    public DBConnection(){
        System.out.println("DBConnection : Instantiated");
    }

    public void testConnection(){
        System.out.println("Connection Received");
    }
}
