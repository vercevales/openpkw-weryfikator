package org.openpkw.web.controllers;

import org.openpkw.currentresults.CurrentResultService;
import org.openpkw.qualifier.OpenPKWAPIController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * @author Karol Dzięgiel
 * @version 17 Sep 2015
 */
@OpenPKWAPIController
public class ResultScheduledController {

    @Autowired
    CurrentResultService currentResultService;

    @RequestMapping(value = "/results", method = RequestMethod.GET)
    public String results(){
        return "Message from service: " + currentResultService.getDate();

    }
}