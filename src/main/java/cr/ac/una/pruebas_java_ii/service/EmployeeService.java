package cr.ac.una. pruebas_java_ii.service;

import java.util.logging.Level;
import java.util.logging.Logger;

import cr.ac.una.pruebas_java_ii.model.TransportHelper;
import cr.ac.una.pruebas_java_ii.util.Respuesta;
import cr.ac.una.t_marks_ws.webservice.EmployeeWS_Service;
import cr.ac.una.t_marks_ws.webservice.Wrapper;


/**
 *
 * @author jafeth
 */
public class EmployeeService {

    private static final Logger LOG = Logger.getLogger(EmployeeService.class.getName());

    private EmployeeWS_Service employeeService;

    public void initEmployeeService() {
        if (employeeService == null) {
            employeeService = new EmployeeWS_Service();
        }
    }

    public Respuesta getAdmin(Long folio, String password) {
        try {
            initEmployeeService();
            
            Wrapper wrapper = employeeService.getEmployeeWSPort().getAdmin(folio, password);

            if (!wrapper.isState()) {
                return new Respuesta(false, wrapper.getMessage(), wrapper.getInternalMessage());
            }

            return new Respuesta(true, "", "", "Employee", 
            TransportHelper.transportEmployeeDTO(wrapper.getEmploye()));
        } catch (Exception ex) {
            LOG.log(Level.SEVERE, "Error consultando el servicio web", ex);
            return new Respuesta(false, "No se pudo conectar con el servidor.",
                    "getAdmin: " + ex.getMessage());
        }
    }
    
    public Respuesta getEmployee(Long id){
        try{
            initEmployeeService();
            Wrapper wrapper = employeeService.getEmployeeWSPort().getEmployee(id);
            
            if(!wrapper.isState())
                return new Respuesta(false, wrapper.getMessage(), wrapper.getInternalMessage());
            
            return new Respuesta(true, "", "", "Employee",
                    TransportHelper.transportEmployeeDTO(wrapper.getEmploye()));
            
        }catch (Exception ex) {
            LOG.log(Level.SEVERE, "Error consultando el servicio web", ex);
            return new Respuesta(false, "No se pudo conectar con el servidor.",
                    "getEmployee: " + ex.getMessage());
        }
        
    }

}
