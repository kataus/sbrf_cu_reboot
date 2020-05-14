package ru.itvitality.sbrf.cu;

import ru.itvitality.sbrf.cu.atm.ATM;
import ru.itvitality.sbrf.cu.atm.exceptions.ATMException;
import ru.itvitality.sbrf.cu.atm.exceptions.IncorectValue;
import ru.itvitality.sbrf.cu.atm.exceptions.NoAvailableRequestCount;
import ru.itvitality.sbrf.cu.atm.impl.ATMImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ATM atm = new ATMImpl();

        try {
            atm.get( 100 );
        }catch ( ATMException e ){
            e.printStackTrace();
        }catch ( Exception e ){

        }
    }
}
