package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String LASTNAME = "Undone";
    private static final String DESCRIPTION = "Test: Learn Hibernate";


    @Test
    void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(LASTNAME, DESCRIPTION);
        taskListDao.save(taskList);
        String lastName = taskList.getListName();

        //When
        List<TaskList> taskListList = taskListDao.findByListName(lastName);

        //Then
        assertEquals(1, taskListList.size());

        //CleanUp
        int id = taskListList.get(0).getId();
        taskListDao.deleteById(id);
    }
}

