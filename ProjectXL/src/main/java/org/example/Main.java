package org.example;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        //Thread 1
        class Thread1 implements Runnable{
            @Override
            public void run() {
                System.out.println("Output of Thread1 Begnins:");
                FileInputStream fis = null;
                try {
                    fis = new FileInputStream(new File("/home/amantya/Downloads/E1.xls"));
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                }

                HSSFWorkbook wb = null;
                try {
                    wb = new HSSFWorkbook(fis);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                HSSFSheet sheet = wb.getSheetAt(0);
                FormulaEvaluator formulaEvaluator = wb.getCreationHelper().createFormulaEvaluator();

                ConcurrentHashMap<Integer,Details> thread1Map=new ConcurrentHashMap<Integer, Details>();

                for(Row row: sheet){

                    ArrayList<String> stringList = new ArrayList<>();
                    ArrayList<Double> integerList = new ArrayList<>();

                    for (Cell cell: row){
                        switch (formulaEvaluator.evaluateInCell(cell).getCellType()){
                            case Cell.CELL_TYPE_NUMERIC:
                                integerList.add(cell.getNumericCellValue());
                                //System.out.println("\t\t"+cell.getNumericCellValue());
                                break;
                            case Cell.CELL_TYPE_STRING:
                                stringList.add(cell.getStringCellValue());
                                //System.out.println("\t\t"+cell.getStringCellValue());
                                break;
                        }
                    }

                    if(stringList.contains("First Name")||stringList.isEmpty()||integerList.contains("1.0"))
                    {
                        continue;
                    }

                    double id = integerList.get(2);
                    double o = integerList.get(0);
                    double age = integerList.get(1);
                    String firstName = stringList.get(0);
                    String lastName=stringList.get(1);
                    String gender=stringList.get(2);
                    String country=stringList.get(3);
                    String date=stringList.get(4);

                    Details obj = new Details(firstName, lastName, gender, country, (int) age, date, (int) id);
                    thread1Map.put(obj.id, obj);
                }
                System.out.println(thread1Map+"\n");
            }
        }

        //Thread 2
        class Thread2 implements Runnable{
            @Override
            public void run() {
                System.out.println("Output of Thread2 Begnins:");
                FileInputStream fis = null;
                try {
                    fis = new FileInputStream(new File("/home/amantya/Downloads/E2.xls"));
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                }

                HSSFWorkbook wb = null;
                try {
                    wb = new HSSFWorkbook(fis);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                HSSFSheet sheet = wb.getSheetAt(0);
                FormulaEvaluator formulaEvaluator = wb.getCreationHelper().createFormulaEvaluator();

                ConcurrentHashMap<Integer,Details> thread2Map=new ConcurrentHashMap<Integer, Details>();

                for(Row row: sheet){
                    ArrayList<String> stringList = new ArrayList<>();
                    ArrayList<Double> integerList = new ArrayList<>();
                    for (Cell cell: row){
                        switch (formulaEvaluator.evaluateInCell(cell).getCellType()){
                            case Cell.CELL_TYPE_NUMERIC:
                                integerList.add(cell.getNumericCellValue());
                                //System.out.println("\t\t"+cell.getNumericCellValue());
                                break;
                            case Cell.CELL_TYPE_STRING:
                                stringList.add(cell.getStringCellValue());
                                //System.out.println("\t\t"+cell.getStringCellValue());
                                break;
                        }
                    }

                    if(stringList.contains("First Name")||stringList.isEmpty()||integerList.contains("1.0"))
                    {
                        continue;
                    }

                    double id = integerList.get(2);
                    double o = integerList.get(0);
                    double age = integerList.get(1);
                    String firstName = stringList.get(0);
                    String lastName=stringList.get(1);
                    String gender=stringList.get(2);
                    String country=stringList.get(3);
                    String date=stringList.get(4);

                    Details obj = new Details(firstName, lastName, gender, country, (int) age, date, (int) id);
                    thread2Map.put(obj.id, obj);
                }
                System.out.println(thread2Map);
            }
        }

        Thread1 a = new Thread1();
        Thread2 b = new Thread2();
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);

        t1.start();
        t1.join();
        t2.start();
    }
}