package br.com.RuanFelipe.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.RuanFelipe.coverters.NumberConverter;
import br.com.RuanFelipe.exceptions.UnsupportedMathOperationException;
import br.com.RuanFelipe.math.SimpleMath;

@RestController
public class MathController { 
	private SimpleMath math = new SimpleMath();
	 
	
	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method= RequestMethod.GET)
	public Double sum (
			@PathVariable(value="numberOne"
			) String numberOne,
			@PathVariable(value="numberTwo"
					) String numberTwo
			) throws Exception{
		
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		return math.sum(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
	}
	@RequestMapping(value = "/subtracao/{numberOne}/{numberTwo}", method= RequestMethod.GET)
	public Double subtracao (
			@PathVariable(value="numberOne"
			) String numberOne,
			@PathVariable(value="numberTwo"
					) String numberTwo
			) throws Exception{
		
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		return math.subtracao(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
	}
	@RequestMapping(value = "/multiplicacao/{numberOne}/{numberTwo}", method= RequestMethod.GET)
	public Double multiplicao (
			@PathVariable(value="numberOne"
			) String numberOne,
			@PathVariable(value="numberTwo"
					) String numberTwo
			) throws Exception{
		
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		return math.multiplicao(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
	}
	@RequestMapping(value = "/divisao/{numberOne}/{numberTwo}", method= RequestMethod.GET)
	public Double divisao (
			@PathVariable(value="numberOne"
			) String numberOne,
			@PathVariable(value="numberTwo"
					) String numberTwo
			) throws Exception{
		
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		return math.divisao(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
	}
	@RequestMapping(value = "/media/{numberOne}/{numberTwo}", method= RequestMethod.GET)
	public Double media (
			@PathVariable(value="numberOne"
			) String numberOne,
			@PathVariable(value="numberTwo"
					) String numberTwo
			) throws Exception{
		
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		return math.media(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
	}
	@RequestMapping(value = "/raiz/{numberOne}", method= RequestMethod.GET)
	public Double raiz (
			@PathVariable(value="numberOne"
			) String numberOne
			) throws Exception{
		
		if(!NumberConverter.isNumeric(numberOne)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		return math.raiz(NumberConverter.convertToDouble(numberOne));
	}
	
	
	

	
	
	



}
