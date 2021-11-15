package demo;
public class UseBreakInSwitch {

    public void Statement(){
        int day = 2;
        int n =2;
        switch (day){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("Default");

        }
        
        switch (n){

            case 1:
                logger.info("1");
               

            case 2:
                logger.info("2");

            default:
                logger.info("4");

        }
    }
}
