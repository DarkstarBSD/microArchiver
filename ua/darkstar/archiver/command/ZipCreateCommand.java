package ua.darkstar.archiver.command;


import ua.darkstar.archiver.ConsoleHelper;
import ua.darkstar.archiver.ZipFileManager;
import ua.darkstar.archiver.exception.PathIsNotFoundException;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ZipCreateCommand extends ZipCommand {
    @Override
    public void execute() throws Exception {
        try {
            ConsoleHelper.writeMessage("Creating archive...");

            ZipFileManager zipFileManager = getZipFileManager();

            ConsoleHelper.writeMessage("Enter absolute path to file or directory:");
            Path sourcePath = Paths.get(ConsoleHelper.readString());
            zipFileManager.createZip(sourcePath);

            ConsoleHelper.writeMessage("Archive created.");

        } catch (PathIsNotFoundException e) {
            ConsoleHelper.writeMessage("Wrong file name.");
        }
    }
}
