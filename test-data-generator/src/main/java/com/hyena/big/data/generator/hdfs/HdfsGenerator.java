package com.hyena.big.data.generator.hdfs;

import com.google.common.collect.Lists;
import com.hyena.big.data.commons.constants.EnumConstants;
import com.hyena.big.data.commons.constants.StringUtils;
import com.hyena.big.data.generator.FileDataGenerator;
import com.hyena.big.data.commons.constants.FileConstants;
import lombok.extern.log4j.Log4j;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.util.Date;

/**
 * generate a 1GB size file which simulates user access log
 *
 * name     time    ip      source(app/pc)
 */
@Log4j
public class HdfsGenerator implements FileDataGenerator {

    /**
     * file location
     */
    private String location;


    @Override
    public void generatorData() {
        throw new UnsupportedOperationException("generateDate(location) method for use,this method don't support right now");
    }

    @Override
    public void generateData(String location) {
        try {
            File file = new File(location);
            long length = 0L ;
            while ((length = file.length()) < FileConstants._1_GB) {
                String log = getUserLog();
                FileUtils.writeLines(file, Lists.newArrayList(log), true);
            }

            log.info("generate log over...");
        } catch (Exception e) {
            log.error("generate data error",e);
        }finally {

        }
    }


    /**
     * get uer log
     * @return user log
     */
    public String getUserLog(){
        String name = StringUtils.getRandomName(6);
        String ip  = StringUtils.getRandomIp();
        EnumConstants.SourceType[] values = EnumConstants.SourceType.values();


        return name +  "   " + new Date() + "  " + ip +   "   " + values[((int) (Math.random() * 10000)) % EnumConstants.SourceType.H5.getValue()];





    }



}
