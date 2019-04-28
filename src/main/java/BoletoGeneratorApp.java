import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;
//import org.springframework.boot.builder.SpringApplicationBuilder;
//import org.springframework.context.ConfigurableApplicationContext;
//
//import java.awt.*;

@SpringBootApplication
//public class BoletoGeneratorApp extends JFrame
public class BoletoGeneratorApp {


    public static void main(String[] args) {
        SpringApplication.run(BoletoGeneratorApp.class, args);

//        ConfigurableApplicationContext context = new SpringApplicationBuilder(BoletoGeneratorApp.class)
//                .headless(false).run(args);
//
//        EventQueue.invokeLater(() -> {
//            BoletoGeneratorApp ex = context.getBean(BoletoGeneratorApp.class);
//            ex.setVisible(true);
//        });
    }
}
