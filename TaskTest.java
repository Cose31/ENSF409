
package edu.ucalgary.oop;
import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.*;

public class TaskTest 
{
    //testing values for Task
    Task task = new Task(1, "Task 1", 60, 120);
    
    //Test of Task Constructor
    @Test 
    public void testTaskConstructor()
    {
        assertNotNull("Task constructor is working improperly, did not create the object.", task)
    }
    //Testing of getTaskID
    @Test
    public void testGetTaskID() 
    {
        assertEquals("Constructor or getter gave wrong TaskID", 1, task.getTaskID());
    }
    
    //Testing of getDescription
    @Test
    public void testGetDescription() 
    {
        assertEquals("Constructor or getter gave wrong description", "Task 1", task.getDescription());
    }
    
    //Testing of setDescription
    @Test
    public void testSetDescription() 
    {
        task.setDescription("Updated task description");
        assertEquals("Setter did not update description, or getter for description is not working properly with update", "Updated task description", task.getDescription());
    }
    
    //Testing of getDuration
    @Test
    public void testGetDuration() 
    {
        assertEquals("Constructor or getter gave wrong duration", 60, task.getDuration());
    }
    
    //Testing of SetDuration
    @Test
    public void testSetDuration() 
    {
        task.setDuration(90);
        assertEquals("Setter did not update duration properly, or getter for duration is not working properly with update", 90, task.getDuration());
    }
    
    //Testing of GetTimeWindow
    @Test
    public void testGetTimeWindow() 
    {
        assertEquals("Constructor or getter gave wrong TimeWindow", 120, task.getTimeWindow());
    }
    
    //Testing of setTimeWindow
    @Test
    public void testSetTimeWindow() 
    {
        task.setTimeWindow(180);
        assertEquals("Setter did not update TimeWindow correctly, or getter for timewindow is not working properly with update", 180, task.getTimeWindow());
    }
    
    //TaskList Testing begins here
    
    TaskList taskList = new TaskList();
    taskList.addTask(1, "Task 1", 40, 3);
    
    //Test addTask
    @Test
    public void testAddTask() {
        ArrayList<Task> tasks = taskList.getTaskList();
        assertEquals(1, tasks.size());
        assertEquals(1, tasks.get(0).getTaskID());
        assertEquals("Task 1", tasks.get(0).getDescription());
        assertEquals(60, tasks.get(0).getDuration());
        assertEquals(120, tasks.get(0).getTimeWindow());
    }
    
    //Test clearList
    @Test
    public void testClearList() {
        taskList.clearList();
        ArrayList<Task> tasks = taskList.getTaskList();
        assertTrue(tasks.isEmpty());
    }
    
    //Test getTaskList
    @Test
    public void testGetTaskList() {
        ArrayList<Task> tasks = taskList.getTaskList();
        assertEquals(1, tasks.size());
        assertEquals(1, tasks.get(0).getTaskID());
        assertEquals("Task 1", tasks.get(0).getDescription());
        assertEquals(60, tasks.get(0).getDuration());
        assertEquals(120, tasks.get(0).getTimeWindow());
    }
}
