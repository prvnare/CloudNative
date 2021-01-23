package com.praveen.ms.employeeDetails.controller;

import com.praveen.ms.employeeDetails.constants.CommonConstants;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(CommonConstants.EMPLOYEE_BASE_URL)
public class EmployeeInformationController {

    @GetMapping(CommonConstants.GET_EMPLOYEE_DETAILS_END_POINT)
    public ResponseEntity<String> getEmployeeDetails(@PathVariable("employee-id") String employeeId) {

        return ResponseEntity
                .ok()
                .headers(httpHeaders -> httpHeaders.add("content-Type", MediaType.APPLICATION_JSON_VALUE))
                .body("Employee Details");
    }

    @GetMapping("/ping")
    public ResponseEntity<String> ping() {
        return ResponseEntity
                .ok()
                .headers(httpHeaders -> httpHeaders.add("content-Type", MediaType.APPLICATION_JSON_VALUE))
                .body("Ping Success");
    }
}
