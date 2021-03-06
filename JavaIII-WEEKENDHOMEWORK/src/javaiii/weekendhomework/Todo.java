package javaiii.weekendhomework;

import java.security.InvalidParameterException;
import java.util.Calendar;
import java.util.Date;





public class Todo {

    String task;
    Date dueDate;
    int hoursOfWork;
    TaskStatus  status;

   

   
    
    enum TaskStatus {
        PENDING, DONE
    }

    //   status
    //    enum TaskStatus {PEnding, Done };
    public Todo(String task, Date dueDate, int hoursOfWork) {
        setTask(task);
        setDueDate(dueDate);
        setHoursOfWork(hoursOfWork);
        setStatus(status);
    }
 public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }
 /*   Todo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
*/
    public String getTask() {
        return task;
    }

    public void setTask(String task) {

        if (task.length() < 2 || task.length() > 50) {
            throw new InvalidParameterException("Task must be 2 - 50 characters long ");
            
        } else if (task.contains(";") || task.contains("`")) {
            throw new InvalidParameterException("You Have Entered an Invalid Character");
        }

        this.task = task;

    }

    public Date getDueDate() {
        return dueDate;
    }

     public void setDueDate(Date dueDate) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(dueDate);
        int year = cal.get(Calendar.YEAR);
        if (year < 1900 || year > 2100) { // error
            throw new IllegalArgumentException("Year must be 1900 to 2100");
        }
        this.dueDate = dueDate;
    }
    
    public int getHoursOfWork() {
        return hoursOfWork;
    }

    public void setHoursOfWork(int hoursOfWork) {
        this.hoursOfWork = hoursOfWork;
    }

    @Override
    public String toString() {
       // return "Todo{" + "task=" + task + ", dueDate=" + dueDate + ", hoursOfWork=" + hoursOfWork + '}';
       return String.format("%s, due on '%ty/%tm/%td, will take %d hours of work", task, dueDate,dueDate,dueDate, hoursOfWork);
    }
    public String toDataString(){
        String []data = dataLine.split(";");
        if(data.length !=4){
            throw new IllegalArgumentException("Invalid number of items in line");
        }
                String dueDateStr = dateFormatFile.format(dueDate);
        return String.format("%s; '%ty/%tm/%td;%d", task, dueDate,dueDate,dueDate, hoursOfWork, status);
    }

    public Todo(String dataLine){
    
    //dataline.split(";");
    
}

}
