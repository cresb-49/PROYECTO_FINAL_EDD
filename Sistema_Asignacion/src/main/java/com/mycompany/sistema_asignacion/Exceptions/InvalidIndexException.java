/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sistema_asignacion.Exceptions;

/**
 *
 * @author benjamin
 */
public class InvalidIndexException extends Exception{

    public InvalidIndexException() {
    }

    public InvalidIndexException(String message) {
        super(message);
    }
    
}
