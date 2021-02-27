package javaiii.weekendhomework;

import java.security.InvalidParameterException;
import java.util.Date;

public class Todo {

    public Todo(String task, Date dueDate, int hoursOfWork) {
        this.task = task;
        this.dueDate = dueDate;
        this.hoursOfWork = hoursOfWork;
    }

    String task;
    Date dueDate;
    int hoursOfWork;
    //   status
    //    enum TaskStatus {PEnding, Done };

    public String getTask() {
        return task;
    }

    public void setTask(String task) {

        if (task.length() < 2 || task.length() > 50) {
            throw new InvalidParameterException("Task must be 2 - 50 characters long ");
        } else if (task.contains(";")|| task.contains("`")){
            throw new InvalidParameterException("You Have Entered an Invalid Character");
        }

        this.task = task;

    }

    public Date getDueDate() {
        return dueDate;
    }

   /* public void setDueDate(Date dueDate) {
        if(dueDate(year)<1900|| dueDate(year)>2100){
            throw new InvalidParameterException("You Have entered an unacheivable year");
        }
        this.dueDate = dueDate;
    }
*/
    public int getHoursOfWork() {
        return hoursOfWork;
    }

    public void setHoursOfWork(int hoursOfWork) {
        this.hoursOfWork = hoursOfWork;
    }

}
