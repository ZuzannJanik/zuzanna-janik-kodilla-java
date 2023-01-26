package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ForumStatisticsTestSuite {
    @Mock
    private Statistics statisticsMock;
    private ForumStatistics forumStatistics;
    @BeforeEach
    public void beforeTest() {
        forumStatistics = new ForumStatistics();
        statisticsMock = mock(Statistics.class);
        List<String> userName = new ArrayList<>();
        for(int n=0; n<5; n++) {
            userName.add("Name");
        }
        when(statisticsMock.usersNames()).thenReturn(userName);
        when(statisticsMock.postsCount()).thenReturn(15);
        when(statisticsMock.commentsCount()).thenReturn(5);
    }
    @Test
    void testQualityOfPost0() {
        //Given
        when(statisticsMock.postsCount()).thenReturn(0);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, forumStatistics.getPostQuantity());
    }
    @Test
    void testQualityOfPost1000() {
        //Given
        when(statisticsMock.postsCount()).thenReturn(1000);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(1000, forumStatistics.getPostQuantity());
    }
    @Test
    void testQualityOfComments0() {
        //Given
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, forumStatistics.getCommentQuantity());
    }
    @Test
    void testMorePostsThenComments() {
        //Given
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(10);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(true,forumStatistics.morePostsThenComments());

    }
    @Test
    void testMoreCommentsThenPosts() {
        //Given
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(10);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertTrue(forumStatistics.morePostsThenComments());
    }
    @Test
    void testQuantityOfUsers0() {
        //Given
        List<String> userName = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(userName);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, forumStatistics.getUserQuantity());
    }
    @Test
    void testQuantityOfUsers100() {
        //Given
        List<String> userName = new ArrayList<>();
        for(int n=0; n<100; n++) {
            userName.add("Name");
        }
        when(statisticsMock.usersNames()).thenReturn(userName);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(100, forumStatistics.getUserQuantity());
    }
}



