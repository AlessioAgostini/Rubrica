/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubrica;

/**
 *
 * @author Alessio Agostini
 */
public class DictionaryItemNotFoundException extends RuntimeException {

    /**
     * Creates a new instance of <code>DictionaryItemNotFound</code> without
     * detail message.
     */
    public DictionaryItemNotFoundException() {
    }

    /**
     * Constructs an instance of <code>DictionaryItemNotFound</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public DictionaryItemNotFoundException(String msg) {
        super(msg);
    }
}