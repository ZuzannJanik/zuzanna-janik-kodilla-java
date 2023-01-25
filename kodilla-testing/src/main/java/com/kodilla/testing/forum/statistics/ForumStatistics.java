package com.kodilla.testing.forum.statistics;

public class ForumStatistics {
    private int userQuantity;
    private int postQuantity;
    private int commentQuantity;
    private double averagePost;
    private double averageComment;
    private double averageCommentOnPost;

    public int getUserQuantity() {
        return userQuantity;
    }
    public int getPostQuantity() {
        return postQuantity;
    }
    public int getCommentQuantity() {
        return commentQuantity;
    }
    public double getAveragePost() {
        return averagePost;
    }
    public double getAverageComment() {
        return averageComment;
    }
    public double getAverageCommentOnPost() {
        return averageCommentOnPost;
    }
    public void calculateAdvStatistics(Statistics statistics) {
        userQuantity = statistics.usersNames().size();
        postQuantity = statistics.postsCount();
        commentQuantity = statistics.commentsCount();
        averagePost = calculateAveragePost();
        averageComment = calculateAverageComment();
        averageCommentOnPost = calculateAverageCommentOnPost();
    }
    public double calculateAveragePost() {
        if (userQuantity > 0) {
            return postQuantity / userQuantity;
        } else {
            return 0;
        }
    }
    public double calculateAverageComment() {
        if (userQuantity > 0) {
            return commentQuantity / userQuantity;
        } else {
            return 0;
        }
    }
    public double calculateAverageCommentOnPost() {
        if (userQuantity > 0) {
            return commentQuantity / postQuantity;
        } else {
            return 0;
        }
    }
    public boolean morePostsThenComments(){
        if (postQuantity > commentQuantity) {
            return true;
        } else {
            return false;
        }
    }
    public void showStatistics() {
        System.out.println("Forum Statistics:");
        System.out.println("Users: " + userQuantity);
        System.out.println("Posts: " + postQuantity);
        System.out.println("Comments: " + commentQuantity);
        System.out.println("Average number of post per user: " + averagePost);
        System.out.println("Average number of comments per user: " + averageComment);
        System.out.println("Average number of comments per post: " + averageCommentOnPost);
    }
}
