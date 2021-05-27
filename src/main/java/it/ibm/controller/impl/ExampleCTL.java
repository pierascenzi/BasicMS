/**
 * 
 */
package it.ibm.controller.impl;

import org.springframework.web.bind.annotation.RestController;

import it.ibm.controller.IExampleCTL;

@RestController
public class ExampleCTL implements IExampleCTL {

	@Override
	public String echo(String word) {
		return word;
	}
}
