package com.company.chapnineteen;

import java.text.DateFormat;
import java.util.Date;


/**
 * @author czy
 * @date 2021/3/16
 */
public enum ConstantSpecificMethod {
    DATE_TIME{
        @Override
        String getInfo(){
            return
               DateFormat.getDateInstance().format(new Date());
        }
    },
    CLASSPATH{
      @Override
      String getInfo(){
          return System.getenv("CLASSPATH");
        }
    },
    VERSION{
        @Override
        String getInfo(){
            return System.getProperty("java.version");
        }
    };
    abstract String getInfo();
    public static void main(String[] args){
        for (ConstantSpecificMethod csm : values()) {
            System.out.println(csm.getInfo());
        }

    }
}
