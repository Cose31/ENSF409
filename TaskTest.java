import org.junit.Test;
import static org.junit.Assert.*;

public class TaskTest {
    
    @Test
    public void testGetTaskID() {
        Task task = new Task(1, "Task 1", 60, 120);
        assertEquals(1, task.getTaskID());
    }
    
    @Test
    public void testGetDescription() {
        Task task = new Task(1, "Task 1", 60, 120);
        assertEquals("Task 1", task.getDescription());
    }
    
    @Test
    public void testSetDescription() {
        Task task = new Task(1, "Task 1", 60, 120);
        task.setDescription("Updated task description");
        assertEquals("Updated task description", task.getDescription());
    }
    
    @Test
    public void testGetDuration() {
        Task task = new Task(1, "Task 1", 60, 120);
        assertEquals(60, task.getDuration());
    }
    
    @Test
    public void testSetDuration() {
        Task task = new Task(1, "Task 1", 60, 120);
        task.setDuration(90);
        assertEquals(90, task.getDuration());
    }
    
    @Test
    public void testGetTimeWindow() {
        Task task = new Task(1, "Task 1", 60, 120);
        assertEquals(120, task.getTimeWindow());
    }
    
    @Test
    public void testSetTimeWindow() {
        Task task = new Task(1, "Task 1", 60, 120);
        task.setTimeWindow(180);
        assertEquals(180, task.getTimeWindow());
    }
}
