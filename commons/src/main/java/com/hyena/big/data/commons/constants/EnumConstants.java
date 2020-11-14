package com.hyena.big.data.commons.constants;

import lombok.Getter;

public class EnumConstants {


    /**
     * source type : app , pc , h5
     */
    public static enum SourceType{


        /**
         * from app
         */
        APP(1, "app"),


        /**
         * from pc
         */
        PC(2,"pc"),

        /**
         * from h5
         */
        H5(3,"h5");


        /**
         * source type value
         */
        @Getter
        private int value ;


        /**
         * source type name
         */
        @Getter
        private String name;


        SourceType(int value, String name) {
            this.value = value ;
            this.name = name;
        }

        public static SourceType fromValue(int value) {
            SourceType sourceType = null;

            for (SourceType s : SourceType.values()) {
                if (s.value == value) {
                    sourceType = s;
                }
            }


            return sourceType;
        }
    }
}
