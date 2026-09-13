//package cr.ac.una.t_marks_ws.webservice;
//
//
//import cr.ac.una.t_marks_ws.model.RegisterDTO;
//import cr.ac.una.t_marks_ws.model.Wrapper;
//import cr.ac.una.t_marks_ws.service.RegisterService;
//import cr.ac.una.t_marks_ws.util.Respuesta;
//import jakarta.ejb.EJB;
//import jakarta.jws.WebMethod;
//import jakarta.jws.WebParam;
//import jakarta.jws.WebService;
//
///**
// *
// * @author takkasama
// */
//
//@WebService(serviceName = "RegisterWS")
//public class RegisterWS {
//    
//    @EJB
//    private RegisterService registerService;
//    
//    @WebMethod(operationName = "saveRegister")
//    public Wrapper saveFolio(@WebParam(name = "registerDTO")RegisterDTO registerDTO){
//        Respuesta res = registerService.saveRegister(registerDTO);
//        
//        Wrapper wrapper = new Wrapper(res.getEstado(), res.getMensaje(), res.getMensajeInterno());
//        
//        if(res.getEstado())
//            wrapper.setContent(res.getResultado("Register"));
//        
//        return wrapper;
//    }
//    
//}
