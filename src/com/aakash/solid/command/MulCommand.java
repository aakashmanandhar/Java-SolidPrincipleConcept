/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aakash.solid.command;

/**
 *
 * @author aakashm
 */
public class MulCommand extends MathCommand {

    @Override
    public double execute(double x, double y) {
        return x*y;
    }
    
}
