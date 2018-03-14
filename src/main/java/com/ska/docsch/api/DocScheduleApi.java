package com.ska.docsch.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sandeep on 3/14/18.
 */
@RestController()
public class DocScheduleApi {

  @PostMapping("/docschedule/schedule")
  @Produces(value = {"application/json"})
  @Consumes(value = {"application/json"})
  public Response doPost() {
    return Response.noContent().build();
  }
}
