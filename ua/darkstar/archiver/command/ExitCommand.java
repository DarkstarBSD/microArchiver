package ua.darkstar.archiver.command;

import ua.darkstar.archiver.ConsoleHelper;

public class ExitCommand implements Command {
    @Override
    public void execute() throws Exception {
        ConsoleHelper.writeMessage("Bye!");
    }
}
