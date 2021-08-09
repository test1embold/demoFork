package javacodechecker;
public class ExpressionAlwaysFalse {


    public  void expression(){
        boolean isValid = true;
        boolean isNumber = false;

        if(false){
            logger.info("Bye");
        }



        if(isValid && isNumber){
            logger.info("hello");
        }


    }

    public  void expression1(){
        boolean isValid = false;

        if(isValid){
            logger.info("hello");
        }


    }

    public  void expression2(){
        boolean isNumber = true;

        if(isNumber){
            logger.info("hello");
        }


    }


}
