/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author faris
 */
@Stateless
@LocalBean
public class HelloSessionBean {

    public String hello(String name)
    {
        return "Hello " + name;
    }
}
