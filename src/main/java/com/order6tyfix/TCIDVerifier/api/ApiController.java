package com.order6tyfix.TCIDVerifier.api;

import com.order6tyfix.TCIDVerifier.common.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


@RestController
@RequiredArgsConstructor
@RequestMapping("api/verify")
public class ApiController {


    private final ApiService apiService;


    @GetMapping("/{tc}")
    public Response verify(@PathVariable String tc) {
        long startTime = System.nanoTime();
        int code = apiService.verify(tc);
        long endTime = System.nanoTime();

        double responseTime = (endTime - startTime) / 1e6;

        Response response = new Response()
                .setCode(code)
                .setResponseTime(responseTime)
                .setQueryDate(new Date());

        return response;
    }


}
