package seedu.moneymind.Command;

public class InvalidCommandException extends Exception {
    private String errorMessage;

    public InvalidCommandException(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public void showErrorMessage() {
        System.out.println(errorMessage);
    }
}
