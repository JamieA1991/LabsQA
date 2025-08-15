package threading;

import java.io.FileWriter;
import java.io.IOException;

public class FileUpdater implements Runnable {

    private final String message;

    public FileUpdater(String message) {
        this.message = message;
    }

    // Synchronized method to ensure thread safety
    public synchronized void writeToFile() {
        try (FileWriter writer = new FileWriter("C:\\Users\\airey1j\\eclipse-workspace\\shared_file.txt", true)) {
            writer.write(message + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        writeToFile(); // Call the method here
    }
}


