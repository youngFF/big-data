package com.hyena.big.data.generator;


/**
 * generate file data for specific project
 */
public interface FileDataGenerator extends Generator {

    /**
     * generate data to specific location
     *
     * @param location file location
     */
    void generateData(String location);
}
