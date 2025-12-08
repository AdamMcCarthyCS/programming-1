package main;

import models.MessagePost;
import controllers.NewsFeed;
import utils.ScannerInput;

/**
 * This class runs the application and handles user input/output.
 *
 * @author Adam McCarthy
 * @version 1.0
 */
public class Driver {
    private MessagePost post;
    private NewsFeed newsfeed = new NewsFeed();

    public Driver() {
        runMenu();
    }

    /**
     * The main method is the starting point for the program.
     *
     * @param args      a string array of command line arguments (unused)
     */
    public static void main(String[] args) {
        new Driver();
    }

    /**
     * This method prints the main menu to the UI.
     *
     * @return      a string representation of the menu options
     */
    private int mainMenu() {
        int option = ScannerInput.readNextInt("""
                Social Network Menu
                    ---------------------
                    1) Add a Message Post
                    2) List all Posts
                    3) Update a Post
                    4) Delete a Post
                    ---------------------
                    5) Save posts
                    6) Load posts
                    0) Exit
                 ==>>\s\s""");
        return option;
    }

    /**
     * The main menu loop of the program.
     */
    private void runMenu() {
        int option = mainMenu();

        while (option != 0) {
            System.out.println();
            // Call the appropriate method based on user choice
            switch(option) {
                case 1 -> addPost();
                case 2 -> listAllPosts();
                case 3 -> updatePost();
                case 4 -> deletePost();
                case 5 -> savePosts();
                case 6 -> loadPosts();
                default -> System.out.println("You have entered an invalid option: " + option);
            }

            // Pause program to allow user to read instructions in terminal
            ScannerInput.readNextLine("\nPress enter key to continue... ");
            System.out.println();
            // Display main menu again
            option = mainMenu();
        }

        // Add newline formatting for easier reading
        System.out.println();
        System.out.println("Exiting the program. Goodbye!");
        System.exit(0);
    }

    /**
     * Prints all stored posts.
     */
    private void listAllPosts() {
        System.out.println(newsfeed.show());
    }

    /**
     * Reads user input to create a post and stores in newsfeed.
     */
    private void addPost() {
        // Read in message details
        String author = ScannerInput.readNextLine("Enter the message author: ");
        String message = ScannerInput.readNextLine("Enter the message: ");
        int likes = ScannerInput.readNextInt("Enter the number of likes received: ");

        // Create a MessagePost instance
        post = new MessagePost(author, message);
        post.setLikes(likes);

        // Add post to newsfeed
        newsfeed.addPost(post);
        // Add newline formatting for easier reading
        System.out.println();
    }

    /**
     * Updates an existing post using user input.
     *
     * This method reads in new values for the author and content of the post if it exists at the
     * given value. It returns a message informing the user if the update has taken place.
     */
    private void updatePost() {
        listAllPosts();
        if (newsfeed.numberOfPosts() > 0) {
            // Only ask user to update the post if it exists
            int indexToUpdate = ScannerInput.readNextInt("Enter the index of the post to update ==> ");
            if (newsfeed.isValidIndex(indexToUpdate)) {
                String author = ScannerInput.readNextLine("Enter the message author: ");
                String message = ScannerInput.readNextLine("Enter the message: ");

                // Pass the index of the post and the new post details to NewsFeed for updating
                // and check for success.
                if (newsfeed.updatePost(indexToUpdate, author, message)) {
                    System.out.println("Update Successful");
                } else {
                    System.out.println("Update NOT Successful");
                }
            } else {
                System.out.println("There are no products for this index number");
            }
        }
    }

    /**
     * Deletes a post by user specified index if it exists.
     */
    public void deletePost() {
        listAllPosts();
        // Only prompt the user for the index of the post to delete if the NewsFeed isn't empty
        if (newsfeed.numberOfPosts() > 0) {
            int indexToDelete = ScannerInput.readNextInt("Enter the index of the post to delete: ");
            // Pass the index of the product to delete to the store and check for success
            MessagePost postToDelete = newsfeed.deletePost(indexToDelete);
            if (postToDelete != null) {
                System.out.println("Delete Successful! Deleted post: " + postToDelete.getAuthor() +
                    " - " + postToDelete.getMessage());
            } else {
                System.out.println("Delete NOT Successful");
            }
        }
    }

    /**
     * Saves all current MessagePost objects to XML file.
     */
    public void savePosts() {
        try {
            newsfeed.save();
        } catch (Exception e) {
            System.err.println("Error writing to the file: " + e);
        }
    }

    /**
     * Loads all messages from file and appends them to the posts ArrayList as MessagePost objects
     */
    public void loadPosts() {
        try {
            newsfeed.load();
        } catch (Exception e) {
            System.err.println("Error loading from the file: " + e);
        }
    }

}
