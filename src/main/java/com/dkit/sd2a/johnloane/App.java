package com.dkit.sd2a.johnloane;

/**
 * Cloning
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Player playerOne = new Player(100, 0, "Brian");

        //For each method prove that it is either a deep or a shallow copy
        makeShallowCopy(playerOne);
        makeDeepCopy(playerOne);
        copyUsingACopyConstructor(playerOne);
        makeCloneCopy(playerOne);
    }
}
