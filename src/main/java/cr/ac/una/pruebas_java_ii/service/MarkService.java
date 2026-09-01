package cr.ac.una.pruebas_java_ii.service;

import java.util.logging.Level ;
import java.util.logging.Logger;

import cr.ac.una.pruebas_java_ii.model.MarkDTO;
import cr.ac.una.pruebas_java_ii.model.TransportHelper;
import cr.ac.una.pruebas_java_ii.util.Respuesta;
import cr.ac.una.t_marks_ws.webservice.MarkWS_Service;
import cr.ac.una.t_marks_ws.webservice.Wrapper;

/**
 *
 * @author takkasama
 */
public class MarkService {
    private static final Logger LOG = Logger.getLogger(EmployeeService.class.getName());

    private MarkWS_Service markservice;


    public void initMarkService(){
        if(markservice == null){
            markservice = new MarkWS_Service();
        }
    }
    public Respuesta saveMark(MarkDTO markDTO){
        try{
            initMarkService();
            
            Wrapper wrapper = markservice.getMarkWSPort().saveMark(TransportHelper.transportMarkDTOWS(markDTO));
            if(!wrapper.isState())
                return new Respuesta(false, wrapper.getMessage(), wrapper.getInternalMessage());
            
            return new Respuesta(true, "", "", "Mark", 
                    TransportHelper.transportMarkDTO(wrapper.getMark()));
            
        } catch (Exception ex) {
            LOG.log(Level.SEVERE, "Error consultando el servicio web", ex);
            return new Respuesta(false, "No se pudo conecctar con el servidor", "saveMark" + ex.getMessage());
        }
        
    }

    
    public Respuesta deleteMark(Long id){
        try{
            initMarkService();
            
            Wrapper wrapper = markservice.getMarkWSPort().deleteMark(id);
                
            return new Respuesta(wrapper.isState(), wrapper.getMessage(), wrapper.getInternalMessage());
            
        }catch (Exception ex) {
            LOG.log(Level.SEVERE, "Error consultando el servicio web", ex);
            return new Respuesta(false, "No se pudo conecctar con el servidor", "deleteMark" + ex.getMessage());
        }
    }
    


    
}
