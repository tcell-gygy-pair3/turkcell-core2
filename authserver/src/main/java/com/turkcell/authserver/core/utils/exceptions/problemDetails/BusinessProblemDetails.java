package com.turkcell.authserver.core.utils.exceptions.problemDetails;

public class BusinessProblemDetails extends ProblemDetails{
    public BusinessProblemDetails(){
        setTitle("Business Rule Violation");
        setType("");
        setStatus("403");
    }

}
