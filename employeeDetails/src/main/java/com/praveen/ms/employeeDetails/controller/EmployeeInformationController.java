package com.praveen.ms.employeeDetails.controller;

import com.praveen.ms.employeeDetails.constants.CommonConstants;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(CommonConstants.EMPLOYEE_BASE_URL)
public class EmployeeInformationController {

    @GetMapping("{employee-id}/details")
    public ResponseEntity<String> getEmployeeDetails(@PathVariable("employee-id") String employeeId ){
        return ResponseEntity
                .ok()
                .headers(httpHeaders -> httpHeaders.add("content-Type", MediaType.APPLICATION_JSON_VALUE))
                .body("Employee Details");
    }
}
