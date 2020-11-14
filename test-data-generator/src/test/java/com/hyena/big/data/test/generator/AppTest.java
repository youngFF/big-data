package com.hyena.big.data.test.generator;

import static org.junit.Assert.assertTrue;

import com.hyena.big.data.generator.hdfs.HdfsGenerator;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Test
    public void generateData(){
        HdfsGenerator hdfsGenerator = new HdfsGenerator();
        hdfsGenerator.generateData("/Users/hyena/Desktop/big-data/user_access.log");
    }
}
