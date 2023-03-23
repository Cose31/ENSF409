
package edu.ucalgary.oop;
import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.*;

public class TaskTest 
{
    //testing values for Task
    Task task = new Task(1, "Task 1", 40, 3);
    
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
        assertEquals("Constructor or getter gave wrong duration", 40, task.getDuration());
    }
    
    //Testing of SetDuration
    @Test
    public void testSetDuration() 
    {
        task.setDuration(30);
        assertEquals("Setter did not update duration properly, or getter for duration is not working properly with update", 30, task.getDuration());
    }
    
    //Testing of GetTimeWindow
    @Test
    public void testGetTimeWindow() 
    {
        assertEquals("Constructor or getter gave wrong TimeWindow", 3, task.getTimeWindow());
    }
    
    //Testing of setTimeWindow
    @Test
    public void testSetTimeWindow() 
    {
        task.setTimeWindow(2);
        assertEquals("Setter did not update TimeWindow correctly, or getter for timewindow is not working properly with update", 2, task.getTimeWindow());
    }
    
    //TaskList Testing begins here
    
    //Test Constructor for TaskList
    @Test
    public void testTaskListConstructor()
    {
        TaskList taskList = new TaskList();
        assertNotNull("Tasklist object not created.", taskList)
    }
    
    //Test getTaskList
    @Test
    public void testGetTaskList() 
    {
        TaskList taskList = new TaskList();
        ArrayList<Task> tasks = taskList.getTaskList();
        assertNotNull("TaskList method getTaskList returned null", tasks);
        assertTrue("TaskList did not return an ArrayList of Tasks (tasks isn't of type Task)", tasks instanceof ArrayList<Task>);
    }
    
    //Test addTask
    @Test
    public void testAddTask() 
    {
        TaskList taskList = new TaskList();
        taskList.addTask(1, "Task 1", 40, 3);
        Task tasks = taskList.getTaskList();
        assertEquals("AddTask did not add the correct taskID.", 1, tasks.get(0).getTaskID());
        assertEquals("AddTask did not add the correct description.", "Task 1", tasks.get(0).getDescription());
        assertEquals("AddTask did not add the correct duration.", 40, tasks.get(0).getDuration());
        assertEquals("AddTask did not add the correct TimeWindow.", 3, tasks.get(0).getTimeWindow());
    }
    
    //Test clearList
    @Test
    public void testClearList() 
    {
        TaskList taskList = new TaskList();
        taskList.addTask(1, "Task 1", 40, 3);
        taskList.clearList();
        ArrayList<Task> tasks = taskList.getTaskList();
        assertTrue("Task List is not empty, clearList did not clear properly.", tasks.isEmpty());
    }
}
