module cr.ac.una.pruebas_java_ii {
    requires java.base;
    //Javafx
    requires javafx.controls;
    requires javafx.fxml;
    requires java.logging;
    requires javafx.media;
    requires MaterialFX;
    requires org.apache.poi.poi;
    requires org.apache.poi.ooxml.schemas;
    requires org.apache.poi.ooxml;
    requires net.sf.jasperreports.core;
    requires com.sun.xml.ws;
            
    requires java.instrument;

    requires jakarta.mail;
    requires jakarta.activation;
    requires jakarta.persistence;

    exports cr.ac.una.pruebas_java_ii;
    exports cr.ac.una.t_marks_ws.webservice to com.sun.xml.ws;
    
    opens cr.ac.una.pruebas_java_ii.controller to javafx.fxml;
    opens cr.ac.una.pruebas_java_ii to javafx.fxml;
    opens cr.ac.una.pruebas_java_ii.model to  net.sf.jasperreports.core;
    opens cr.ac.una.t_marks_ws.webservice to com.sun.xml.bind;    
}
