package com.marcianos.learning.lambda.expressions;

interface NumericValidator {
    boolean isValid(int x);
}

class IsEvenValidator implements NumericValidator {

    @Override
    public boolean isValid(int x) {
        return x % 2 == 0;
    }
}

class IsPrimeValidator implements NumericValidator {

    @Override
    public boolean isValid(int x) {
        for (int i = x-1; i > 1; i--) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}

public class ExemplosLambda {

    public static void main(String[] args) {

        NumericValidator validatorIsPrime = new IsPrimeValidator();
        NumericValidator validatorIsEven = new IsEvenValidator();


        //usando lambda
        NumericValidator validatorIsOdd = (int x) -> (x % 2 == 1);  //arrow function

        NumericValidator validatorIsMultiple3And5 = (x) ->
                                                                {
                                                                    if (x % 3 == 0) {
                                                                        if (x % 5 == 0){
                                                                            return true;
                                                                        }
                                                                    }
                                                                    return false;
                                                                };

        printValidNumber(17, validatorIsOdd);
        printValidNumber(18, validatorIsOdd);








//        printValidNumber(12, validatorIsEven);
//        printValidNumber(12, validatorIsPrime);
//
//
//        printValidNumber(5, validatorIsEven);
//        printValidNumber(5, validatorIsPrime);

//        printValidNumber(2, validatorIsEven);
//        printValidNumber(2, validatorIsPrime);
    }

    public static void printValidNumber(int x, NumericValidator validator) {
        if (validator.isValid(x)) {
            System.out.println(x + " is valid");
        }
    }
}
