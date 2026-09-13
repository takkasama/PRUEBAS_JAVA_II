package cr.ac.una.pruebas_java_ii.service;

import cr.ac.una.pruebas_java_ii.model.EmployeeDTO;

import java.util.logging.Level;
import java.util.logging.Logger;

import cr.ac.una.pruebas_java_ii.model.TransportHelper;
import cr.ac.una.pruebas_java_ii.util.Respuesta;
import cr.ac.una.t_marks.webservice.TMarksWS_Service;
import cr.ac.una.t_marks.webservice.Wrapper;


/**
 *
 * @author jafeth
 */
public class EmployeeService {

    private static final Logger LOG = Logger.getLogger(EmployeeService.class.getName());

    private TMarksWS_Service employeeService;

    public void initService() {
        if (employeeService == null) {
            employeeService = new TMarksWS_Service();
        }
    }

    public Respuesta getAdmin(Long folio, String password) {
        try {
            initService();
            
            Wrapper wrapper = employeeService.getTMarksWSPort().getAdmin(folio, password);

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
            initService();
            Wrapper wrapper = employeeService.getTMarksWSPort().getEmployee(id);
            
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

    
    public Respuesta saveEmployee(EmployeeDTO employeeDTO){
        initService();
        try{
           Wrapper wrapper = employeeService.getTMarksWSPort().
                   saveEmployee(TransportHelper.transportEmployeeDTOWS(employeeDTO));
            
            if(wrapper.isState())
                return new Respuesta(false, wrapper.getMessage(), wrapper.getInternalMessage());
            
            return new Respuesta(true, "" ,"","employee",
            TransportHelper.transportEmployeeDTO(wrapper.getEmploye()));
            
        }catch (Exception ex) {
            LOG.log(Level.SEVERE, "Error consultando el servicio web", ex);
            return new Respuesta(false, "No se pudo conecctar con el servidor", "saveEmployee" + ex.getMessage());
        }

        
    }
    
    
    public Respuesta deleteEmployee(Long id){
        initService();
        
        try{
            Wrapper wrapper = employeeService.getTMarksWSPort().deleteEmployee(id);
            
            if(!wrapper.isState())
                return new Respuesta(false, wrapper.getMessage(), wrapper.getInternalMessage());
            
            return new Respuesta(true, "", "");
            
        }catch (Exception ex) {
            LOG.log(Level.SEVERE, "Error consultando el servicio web", ex);
            return new Respuesta(false, "No se pudo conecctar con el servidor", "deleteEmployee" + ex.getMessage());
        }
        
    }
}
