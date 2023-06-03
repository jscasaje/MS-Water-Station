package com.example.water.station.kakasoasis.controller;


import com.example.water.station.kakasoasis.model.entity.Account;
import com.example.water.station.kakasoasis.model.entity.Response;
import com.example.water.station.kakasoasis.service.DemoServiceImpl;
import org.slf4j.LoggerFactory;
import jakarta.ws.rs.Produces;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import jakarta.ws.rs.QueryParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({ "/demo" })
public class AccountController
{
    private static final Logger log;
    @Autowired
    DemoServiceImpl demoServiceV2;

    @GetMapping({ "/helloWorld" })
    @Produces({ "application/json" })
    public ResponseEntity<Response> getFirstAccount(@QueryParam("flag") final String flag) {
        Response response;
        if (flag.equals("Yes")) {
             Account account = demoServiceV2.getAll();
           log.info(""+ account);
            response = Response.builder().name(account.getAccountName()).status(Integer.valueOf(200)).build();
        }
        else {
            AccountController.log.info("Not Found.");
            response = Response.builder().message("NotFound").build();
        }
        return (ResponseEntity<Response>)new ResponseEntity((Object)response, (HttpStatusCode)HttpStatus.OK);
    }

    static {
        log = LoggerFactory.getLogger((Class)AccountController.class);
    }
}