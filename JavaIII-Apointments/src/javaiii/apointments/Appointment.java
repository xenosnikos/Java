
package javaiii.apointments;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;


public class Appointment {
    
    Date date;
    int durationMinutes;
    String name;
    String description;
    HashSet<Reason> reasonList = new HashSet<>();
    
    Appointment(Date date, int durMin, String description, HashSet<Reason> reasonList){
        
    }
    Appointment(String fileInsert)throws Exception {
        String[] data = fileInsert.split(";");
        if (data.length != 5) {
            throw new Exception("Invalid number of items in line");
        }
        try {
            // continue parsing, use setters to set values
            
            Date date = dateFormatFile.parse(data[0]); // ex ParseException
            int durMin = Integer.parseInt(data[1]); // ex NumberFormatException
            String name= data[2];
            String description = data[3]; // ex IllegalArgumentException
            String hashList= data[4];
            String[] reas = hashList.split(",");
            for(int i=0;i<reas.length;i++){
                reasonList.add(Reason.valueOf(reas[i]));
            }
            setDate(date); // ex DataInvalidException
            setDurationMinutes(durMin); // ex DataInvalidException
            setDescription(description);
            //
            
        } catch (ParseException ex) {
            throw new Exception("Date format invalid", ex);
        } catch (NumberFormatException ex) {
            throw new Exception("Integer value expected", ex);
        }
    }
    private static final SimpleDateFormat dateFormatFile;

    static { // static initializer
        dateFormatFile = new SimpleDateFormat("yyyy-MM-dd");
        dateFormatFile.setLenient(false);
    }
    
    public Appointment(Date date, int durationMinutes, String name, String description,HashSet reasonList) throws Exception {
        setDate(date);
        setDurationMinutes(durationMinutes);
        setName(name);
        setDescription (description);
        setReasonList(reasonList);
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        
        this.date = date;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public void setDurationMinutes(int durationMinutes) throws Exception  {
        if(!(durationMinutes == 20 || durationMinutes == 40 || durationMinutes == 60)){
            throw new Exception("Your duration is not a valid 20 minute block");
        }
        this.durationMinutes = durationMinutes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.matches("[a-z][A-Z][-,.()'\"][0-9]")){
        this.name = name;
    }else{
            System.out.println("INVALID CHARACTERS!");
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public HashSet<Reason> getReasonList() {
        return reasonList;
    }

    public void setReasonList(HashSet<Reason> reasonList) {
        this.reasonList = reasonList;
    }
    
    
    enum Reason{
        CHECKUP, REFERRAL,TESTS,FOLLOWUP, UNWELL
    }
   
    @Override
    public String toString(){
   
    return String.format("%td,%d,%s,%s,%s",date, durationMinutes,name,description,reasonList);
}
public String toDataString(){
    return String.format("%td;%d;%s;%s;%s",date, durationMinutes,name,description, reasonList);
}
//add anonomous class here for sorting, using Comparator classes

static class DateSorter implements Comparator<Appointment>{
    

        @Override
        public int compare(Appointment arg0, Appointment arg1) {
        return 9;
        }
        }
    }
//static class DateComparator() implements Comparator{
    
//}




