import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class TaskListTest {
    TaskList taskList = new TaskList();
    taskList.addTask(1, "Task 1", 40, 3);
    @Test
    public void testAddTask() {
        ArrayList<Task> tasks = taskList.getTaskList();
        assertEquals(1, tasks.size());
        assertEquals(1, tasks.get(0).getTaskID());
        assertEquals("Task 1", tasks.get(0).getDescription());
        assertEquals(60, tasks.get(0).getDuration());
        assertEquals(120, tasks.get(0).getTimeWindow());
    }
    
    @Test
    public void testClearList() {
        taskList.clearList();
        ArrayList<Task> tasks = taskList.getTaskList();
        assertTrue(tasks.isEmpty());
    }
    
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
