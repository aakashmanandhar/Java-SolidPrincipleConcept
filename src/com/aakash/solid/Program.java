/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aakash.solid;

import com.aakash.solid.command.MathCommand;
import com.aakash.solid.command.MathFactory;

/**
 *
 * @author aakashm
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double x = 10, y = 2;
        MathCommand cmd=MathFactory.get("^");
        
        if(cmd!=null){
            System.out.println(cmd.execute(x, y));
        }else{
            System.out.println("Command not found");
        }
    }

}
