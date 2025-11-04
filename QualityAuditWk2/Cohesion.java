/* In this example, we look at two classes
 * one with low cohesion and one with high 
 * Class Utility has many unrelated methods and 
 * that makes it hard to understand and maintain
 * However, FileReader has only one related method
 * This makes it so that the class has only related
 * methods, in our case, only one related method
 */

class Utility {
    void readFile() {}
    void sendEmail() {}
    void logError() {}
}

class FileReader {
    void readFile() {}
}

public class Cohesion {
    
}
