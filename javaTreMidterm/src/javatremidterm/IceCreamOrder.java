
package javatremidterm;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;

class IceCreamOrder {
  
/*  Forgot to Include, incomplete but important
    IceCreamOrder(String dataLine)throws Exception {
        String[] data = dataLine.split(";");
        if (data.length != 3) {
            throw new Exception("Invalid number of items in line");
        }
        try {
            // continue parsing, use setters to set values
            String name= data[0];
            Date date = dateFormatFile.parse(data[1]); 
            String flavoursList =data[2];
            
            
            
            String[] flavours = flavourList.split(",");
            for(int i=0;i<reas.length;i++){
                reasonList.add(Reason.valueOf(reas[i]));
            }
            setDate(date); // ex DataInvalidException
            setName(name); // ex DataInvalidException
            setFlavList(flavList);
            //
            
        } catch (ParseException ex) {
            throw new Exception("Date format invalid", ex);
        } catch (NumberFormatException ex) {
            throw new Exception("Integer value expected", ex);
        }
    }
    */
    
    
    public IceCreamOrder(String name, Date delivDate, ArrayList flavList) throws DataInvalidException {
        setName(name);
        setDelivDate(delivDate);
        setFlavList(flavList);
    }
    public IceCreamOrder(String fileInsert) throws DataInvalidException {
        setName(name);
        setDelivDate(delivDate);
        setFlavList(flavList);
    }
  
    
    String name;
    Date delivDate;
    ArrayList<Flavour> flavList= new ArrayList<>();

    IceCreamOrder() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
       if(!(name.matches("[a-z][A-Z][-,.()'\"]"))){
        this.name = name;
    }else{
            System.out.println("INVALID CHARACTERS!");
        }
    }

    public Date getDelivDate() {
        return delivDate;
    }

    public void setDelivDate(Date delivDate) throws DataInvalidException {
        
        Calendar cal = Calendar.getInstance();
        Date today = cal.getTime();
        cal.setTime(delivDate);
        int year = cal.get(Calendar.YEAR);
        int month= cal.get(Calendar.MONTH);
        int day= cal.get(Calendar.DAY_OF_MONTH);
        //Date futureDay = day+100;
        
        if (year < 1900 || year > 2100) { // error
            throw new DataInvalidException("Year must be 1900 to 2100");
        
        }else if(delivDate.before(today)){
            throw new DataInvalidException("Can't go back in Time unfortunetely");
        }//elseIf(delivDate.after(futureDay)){}
    }

    public ArrayList<Flavour> getFlavList() {
        return flavList;
    }

    public void setFlavList(ArrayList<Flavour> flavList) {
        if(flavList.size()<1){
            System.out.println("Your cone would look pretty pathetic\n"
                    + "Add a Scoop");
        }
        this.flavList = flavList;
    }
    private static final SimpleDateFormat dateFormat;

    static { // static initializer
        dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
    }
    

    enum Flavour{
        VANILLA, CHOCOLATE,STRAWBERRY,ROCKYROAD
    }
    
    public String toString(){
       return String.format("%s;'%ty/%tM/%td;%s",name,delivDate,delivDate,delivDate,flavList);
    }
    public String toDataString(){
        return String.format("%s;'%ty/%tM/%td;%t;%s",name,delivDate,delivDate,delivDate,delivDate,flavList);
    }
    
    
        
    }
    
    
    
    

