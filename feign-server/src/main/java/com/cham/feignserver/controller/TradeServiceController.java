package com.cham.feignserver.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TradeServiceController {

    private static Logger log = LoggerFactory.getLogger(TradeServiceController.class);

    @GetMapping(value = "/api/stream/trades", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String getTradeStream() {
        log.info("Inside TradeServiceController.getTradeStream..");
        return "SWAP Trade";
    }
}
