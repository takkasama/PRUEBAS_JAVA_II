//package cr.ac.una.t_marks_ws.webservice;
//
//import cr.ac.una.t_marks_ws.model.EmployeeDTO;
//import cr.ac.una.t_marks_ws.model.Wrapper;
//import cr.ac.una.t_marks_ws.service.EmployeeService;
//import cr.ac.una.t_marks_ws.util.Respuesta;
//import jakarta.ejb.EJB;
//import jakarta.jws.WebService;
//import jakarta.jws.WebMethod;
//import jakarta.jws.WebParam;
//
///**
// *
// * @author jafet
// */
//
//@WebService(serviceName = "EmployeeWS")
//public class EmployeeWS {
//    @EJB
//    private EmployeeService employeService;
//
//    @WebMethod(operationName = "getAdmin")
//    public Wrapper getAdmin(
//    @WebParam(name = "folio") Long folio,
//    @WebParam(name = "password")String password){
//        
//        Respuesta res = employeService.getAdmin(folio, password);
//        
//        Wrapper wrapper = new Wrapper(res.getEstado(), res.getMensaje(), res.getMensajeInterno());
//        if (res.getEstado())
//            wrapper.setContent((EmployeeDTO) res.getResultado("Employee"));
//       
//        return wrapper;    
//    }
//
//    @WebMethod(operationName = "getEmployee")
//    public Wrapper getEmployee(
//    @WebParam(name = "id") Long id){
//        Respuesta res = employeService.getEmployee(id);
//        Wrapper wrapper = new Wrapper(res.getEstado(), res.getMensaje(), res.getMensajeInterno());
//        if (res.getEstado())
//            wrapper.setContent((EmployeeDTO) res.getResultado("Employee"));
//        return wrapper; 
//    }
//    
//}
