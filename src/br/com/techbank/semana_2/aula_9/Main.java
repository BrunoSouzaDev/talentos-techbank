package br.com.techbank.semana_2.aula_9;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        //Function
        Function myFunction = new Function<Integer,Integer>(){
            @Override
            public Integer apply(Integer integer) {
                return integer*5;
            }
        };

        //Predicate
        Predicate myPredicate = new Predicate<Integer>(){
            @Override
            public boolean test(Integer integer) {
                return integer > 5;
            }
        };

        //Supplier
        Supplier mySupplier = new Supplier<Double>(){
            @Override
            public Double get() {
                return Math.pow(90, 2);
            }
        };

        //Consumer
        Consumer myConsumer = new Consumer<String>() {
            @Override
            public void accept(String o) {
                System.out.println(o);
            }
        };
    }
}
