package dummy.calc.service;

import dummy.calc.embedded.service.CalcService;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;

import dummy.calc.bean.MultiplyRequest;
import dummy.calc.bean.DivideRequest;
import dummy.calc.bean.GenericResponse;

@Endpoint
public class CalcEndpoint {

    private CalcService calcService;
    protected final Log logger = LogFactory.getLog(getClass());

    /**
     * Sets the "business service" to delegate to.
     */
    public void setCalcService(CalcService calcService) {
        this.calcService = calcService;
    }

    /**
     * Process the "multiply" operation.
     */
    @PayloadRoot(localPart = "multiply-request", namespace = "http://dummy/calc")
    public GenericResponse doMultiply(MultiplyRequest request) {

        GenericResponse response = new GenericResponse();
                //fill response
        response.setTerm1(request.getTerm1());
        response.setTerm2(request.getTerm2());
        response.setOperation("multiply");
        response.setResponse(calcService.processNumberTypeOperation(request.getTerm1(), request.getTerm2(), "multiply"));
        return response;

    }

     /**
     * Process the "divide" operation.
     */
    @PayloadRoot(localPart = "divide-request", namespace = "http://dummy/calc")
    public GenericResponse doDivide(DivideRequest request) {

        GenericResponse response = new GenericResponse();
        response.setTerm1(request.getTerm1());
        response.setTerm2(request.getTerm2());
        response.setOperation("multiply");
        response.setResponse(calcService.processNumberTypeOperation(request.getTerm1(), request.getTerm2(), "divide"));
        return response;

    }


}
