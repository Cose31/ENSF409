import org.junit.Test;
import static org.junit.Assert.*;

public class TaskTest {
    Task task = new Task(1, "Task 1", 60, 120);
    @Test
    public void testGetTaskID() {
        assertEquals(1, task.getTaskID());
    }
    
    @Test
    public void testGetDescription() {
        assertEquals("Task 1", task.getDescription());
    }
    
    @Test
    public void testSetDescription() {
        task.setDescription("Updated task description");
        assertEquals("Updated task description", task.getDescription());
    }
    
    @Test
    public void testGetDuration() {
        assertEquals(60, task.getDuration());
    }
    
    @Test
    public void testSetDuration() {
        task.setDuration(90);
        assertEquals(90, task.getDuration());
    }
    
    @Test
    public void testGetTimeWindow() {
        assertEquals(120, task.getTimeWindow());
    }
    
    @Test
    public void testSetTimeWindow() {
        task.setTimeWindow(180);
        assertEquals(180, task.getTimeWindow());
    }
}
