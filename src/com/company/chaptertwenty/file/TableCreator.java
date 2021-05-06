package com.company.chaptertwenty.file;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * 创建数据表
 *
 * @author czy
 * @date 2021/3/22
 */
public class TableCreator {
    public static void main(String[] args) throws ClassNotFoundException {
        if (args.length < 1) {
            System.out.println("arguments: annotated classes");
            System.exit(0);
        }
        for (String arg : args) {
            Class<?> cl = Class.forName(arg);
            DBTable annotation = cl.getAnnotation(DBTable.class);
            if (annotation == null) {
                System.out.println("No annotation in class " + arg);
                continue;
            }
            String tableName = annotation.name();
            if (tableName.length() < 1) {
                tableName = cl.getName().toUpperCase();
            }
            List<String> columnDefs = new ArrayList<>();
            for (Field field : cl.getDeclaredFields()) {
                String columnName = null;
                Annotation[] anns = field.getDeclaredAnnotations();
                if (anns.length < 1) {
                    continue;
                }
                if (anns[0] instanceof SQLInteger) {
                    SQLInteger sInt = (SQLInteger) anns[0];
                    if (sInt.name().length() < 1) {
                        columnName = field.getName().toUpperCase();
                    } else {
                        columnName = sInt.name();
                    }
                    columnDefs.add(columnName + " INT" +
                            getConstraints(sInt.constraints()));
                }
                if (anns[0] instanceof SQLString) {
                    SQLString sString = (SQLString) anns[0];
                    if (sString.name().length() < 1) {
                        columnName = field.getName().toUpperCase();
                    } else {
                        columnName = sString.name();
                    }
                    columnDefs.add(columnName + "VARCHAR(" + sString.value() + ")");
                }
                StringBuilder createdCommand = new StringBuilder("create table " + tableName + "(");
                for (String columnDef : columnDefs) {
                    createdCommand.append("\n    " + columnDef + ",");
                }
                String tableCreate = createdCommand.substring(0, createdCommand.length() - 1) + ");";
                System.out.println("Table creation SQL for " +
                        arg + " is:\n" + tableCreate);
            }
        }
        System.out.println("");
    }
    private static String getConstraints(Constraints con){
        String constraints = "";
        if(!con.allowNull()){
            constraints+=" NOT NULL";
        }
        if (con.primaryKey()){
            constraints+= " PRIMARY KEY";
        }
        if (con.unique()){
            constraints+= " UNIQUE";
        }
        return constraints;
    }
}
