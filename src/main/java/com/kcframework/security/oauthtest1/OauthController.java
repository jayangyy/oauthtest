/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kcframework.security.oauthtest1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jayan
 */
@RestController
public class OauthController {

    @RequestMapping("/oauthhello")
    public String aouth() {
        return "i am oauth";
    }
}
