import org.junit.Test;
import static org.junit.Assert.*;

public class TaskTest 
{
    Task task = new Task(1, "Task 1", 60, 120);
    @Test
    public void testGetTaskID() 
    {
        
        assertEquals("Constructor or getter gave wrong TaskID", 1, task.getTaskID());
    }
    
    @Test
    public void testGetDescription() 
    {
       
        assertEquals("Constructor or getter gave wrong description", "Task 1", task.getDescription());
    }
    
    @Test
    public void testSetDescription() 
    {
        task.setDescription("Updated task description");
        assertEquals("Setter did not update description, or getter for description is not working properly with update", "Updated task description", task.getDescription());
    }
    
    @Test
    public void testGetDuration() 
    {
        assertEquals("Constructor or getter gave wrong duration", 60, task.getDuration());
    }
    
    @Test
    public void testSetDuration() 
    {
        task.setDuration(90);
        assertEquals("Setter did not update duration properly, or getter for duration is not working properly with update", 90, task.getDuration());
    }
    
    @Test
    public void testGetTimeWindow() 
    {
        assertEquals("Constructor or getter gave wrong TimeWindow", 120, task.getTimeWindow());
    }
    
    @Test
    public void testSetTimeWindow() 
    {
        task.setTimeWindow(180);
        assertEquals("Setter did not update TimeWindow correctly, or getter for timewindow is not working properly with update", 180, task.getTimeWindow());
    }
}
