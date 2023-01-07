package lk.ijse.Spring;

import lk.ijse.Spring.config.AppConfig;
import lk.ijse.Spring.pojo.BasicDataSource;
import lk.ijse.Spring.pojo.Customer;
import lk.ijse.Spring.pojo.DBConnection;
import lk.ijse.Spring.pojo.PojoOne;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author : Ashan Sandeep
 * @date : 1/6/2023
 * @since : 0.1.0
 **/

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

        ctx.register(AppConfig.class);
        ctx.refresh();

        // Context Invocation
        // 1. Using Class name of a pojo
        Customer c1 = ctx.getBean(Customer.class);
        System.out.println(c1);
        c1.getCustomerName();

        Customer c2 = ctx.getBean(Customer.class);
        System.out.println(c2);

        System.out.println(c1 == c2); // Returns true(Cause of a and b both are the Same Pojo(Singleton Object))

        // --------------------------------------------------

        /*BasicDataSource bean = ctx.getBean(BasicDataSource.class);
        System.out.println(bean);*/

        // 2. Using Bean Id of a pojo
        // How to get Bean Id of a pojo ---> First of all, get the class name of relevant pojo,
        // then, Convert the first letter of that class name into Simple and that can be used as a Bean Id of a Pojo
        Customer customer = (Customer) ctx.getBean("customer");
        System.out.println(customer);

        PojoOne pojo = (PojoOne) ctx.getBean("pojo");
        System.out.println(pojo);

        BasicDataSource bds = (BasicDataSource) ctx.getBean("bds");
        System.out.println(bds);

        DBConnection connection = (DBConnection) ctx.getBean("DBConnection");
        System.out.println(connection);

        ctx.close();
    }
}
