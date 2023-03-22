import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class TaskListTest {
    
    @Test
    public void testAddTask() {
        TaskList taskList = new TaskList();
        taskList.addTask(1, "Task 1", 40, 3);
        ArrayList<Task> tasks = taskList.getTaskList();
        assertEquals(1, tasks.size());
        assertEquals(1, tasks.get(0).getTaskID());
        assertEquals("Task 1", tasks.get(0).getDescription());
        assertEquals(60, tasks.get(0).getDuration());
        assertEquals(120, tasks.get(0).getTimeWindow());
    }
    
    @Test
    public void testClearList() {
        TaskList taskList = new TaskList();
        taskList.addTask(1, "Task 1", 40, 3);
        taskList.clearList();
        ArrayList<Task> tasks = taskList.getTaskList();
        assertTrue(tasks.isEmpty());
    }
    
    @Test
    public void testGetTaskList() {
        TaskList taskList = new TaskList();
        taskList.addTask(1, "Task 1", 40, 3);
        ArrayList<Task> tasks = taskList.getTaskList();
        assertEquals(1, tasks.size());
        assertEquals(1, tasks.get(0).getTaskID());
        assertEquals("Task 1", tasks.get(0).getDescription());
        assertEquals(60, tasks.get(0).getDuration());
        assertEquals(120, tasks.get(0).getTimeWindow());
    }
}
