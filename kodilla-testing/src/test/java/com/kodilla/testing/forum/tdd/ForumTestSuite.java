package com.kodilla.testing.forum.tdd;

import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;
import org.junit.jupiter.api.*;

import java.net.Authenticator;
import java.security.PublicKey;

@DisplayName("TddL Forum Test Suite")
public class ForumTestSuite {
    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTest() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished");
    }

    @BeforeEach
    public void BeforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test#" + testCounter);
    }

    @Nested
    @DisplayName("Tests for posts")
    class TestPosts {
           @DisplayName("Test 1: Verifies that the number of posts is 1 after adding a new post.")
        @Test
        void testAddPost() {
            //Given
            ForumUser forumUser = new ForumUser("mrsmith", "JohnSmith");

            //When
            forumUser.addPost("mrsmith", "Hello everyone, this is my first contribution here!");

            //Then
            Assertions.assertEquals(1, forumUser.getPostsQuantity());
        }

           @DisplayName("Test 3: checking if the post retrieved from the ForumUser class is the same as the post that was inserted into the class.")
        @Test
        void testGetPost() {
            //Given
            ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
            ForumPost thePost = new ForumPost("Hello everyone, " + "this is my first contribution here!", "mrsmith");
            forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());

            //When
            ForumPost retrivedPost;
            retrivedPost = forumUser.getPost(0);

            //Then
            Assertions.assertEquals(thePost, retrivedPost);
        }

           @DisplayName("Test 5: checking whether an attempt to delete a non-existent post will return false.")
        @Test
        void testRemovePostNotExisting() {
            //Given
            ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
            ForumPost thePost = new ForumPost("Hello everyone, " + "this is my first contribution here!", "mrsmith");

            //When
            boolean result = forumUser.removePost((thePost));

            //Then
            Assertions.assertFalse(result);
        }

          @DisplayName("Test 7: verifying whether the selected post was removed from the class.")
        @Test
        void testRemovePost() {
            //Given
            ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
            ForumPost thePost = new ForumPost("Hello everyone, " + "this is my first contribution here!", "mrsmith");
            forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());

            //When
            boolean result = forumUser.removePost(thePost);

            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, forumUser.getPostsQuantity());
        }
    }

    @Nested
    @DisplayName("Tests for comments")
    class TestComments {
          @DisplayName("Test 2: Verifies that the number of comments is 1 after adding a new comment.")
        @Test
        void testAddComment() {
            //Given
            ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
            ForumPost thePost = new ForumPost("Hello everyone, " + "this is my first contribution here!", "mrsmith");

            //When
            forumUser.addComment(thePost, "mrsmith", "Thank you for all good words!");

            //Then
            Assertions.assertEquals(1, forumUser.getCommentsQuantity());
        }

           @DisplayName("Test 4: Verifying that the comment retrieved from the ForumUser class is the same as the comment that was inserted into the class.")
        @Test
        void testGetComment() {
            //Given
            ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
            ForumPost thePost = new ForumPost("Hello everyone, " + "this is my first contribution here!", "mrsmith");
            ForumComment theComment = new ForumComment(thePost, "mrsmith", "Thank you for all good words!");
            forumUser.addComment(thePost, theComment.getAuthor(), theComment.getCommentBody());

            //When
            ForumComment retriedComment = forumUser.getComment(0);

            //Then
            Assertions.assertEquals(theComment, retriedComment);
        }

           @DisplayName("Test 6: checking whether an attempt to delete a non-existent comment will return false.")
        @Test
        void testRemoveCommentNotExist() {
            //Given
            ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
            ForumPost thePost = new ForumPost("Hello everyone, " + "this is my first contribution here!", "mrsmith");
            ForumComment theComment = new ForumComment(thePost, "mrsmith", "Thank you for all good words!");

            //When
            boolean result = forumUser.removeComment(theComment);

            //Then
            Assertions.assertFalse(result);
        }

           @DisplayName("Test 8: verifying whether the selected comment was removed from the class.")
        @Test
        void testRemoveComment() {
            //Given
            ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
            ForumPost thePost = new ForumPost("Hello everyone, " + "this is my first contribution here!", "mrsmith");
            ForumComment theComment = new ForumComment(thePost, "mrsmith", "Thank you for all good words!");
            forumUser.addComment(thePost, theComment.getAuthor(), theComment.getCommentBody());

            //When
            boolean result = forumUser.removeComment(theComment);

            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, forumUser.getCommentsQuantity());
        }
    }
}

