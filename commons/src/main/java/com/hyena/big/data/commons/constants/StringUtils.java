package com.hyena.big.data.commons.constants;

public class StringUtils {


    /**
     * final chars
     */
    public static final char[] CHARS = {
            'a','b','c','d','e','f','g','h','i','j','k','l','m','n',
            'o','p','q','r','s','t','u','v','w','x','y','z',
            'A','B','C','D','E','F','G','H','I','J','K','L','M','N',
            'O','P','Q','R','S','T','U','V','W','X','Y','Z'
    };


    /**
     * final integers
     */
    public static final int[] INTEGERS = {0,1,2,3,4,5,6,7,8,9};






    // ------------------- common methods for generate specific data --------- //

    /**
     * designate the name length you wanted
     * @param nameLength name length
     * @return random name for test
     */
    public static String getRandomName(int nameLength) {
        if (nameLength <= 0) {
            throw new IllegalArgumentException("name length can't be negative or zero");
        }

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < nameLength; i++) {
            sb.append(CHARS[(int)((Math.random() * 10000) % CHARS.length)]);
        }

        return sb.toString();
    }


    /**
     * get random ip for test data
     * @return
     */
    public static String getRandomIp() {
        int ipSlot = 4;


        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < ipSlot; i++) {
            int ip = (int)((Math.random() * 10000) % 255);
            sb.append(ip);
            if (i != (ipSlot - 1)) {
                sb.append(".");
            }
        }

        return sb.toString();
    }


}
