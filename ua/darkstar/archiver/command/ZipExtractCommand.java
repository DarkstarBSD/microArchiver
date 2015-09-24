package ua.darkstar.archiver.command;


import ua.darkstar.archiver.ConsoleHelper;
import ua.darkstar.archiver.ZipFileManager;
import ua.darkstar.archiver.exception.PathIsNotFoundException;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ZipExtractCommand extends ZipCommand {
    @Override
    public void execute() throws Exception {
        try {
            ConsoleHelper.writeMessage("Unpacking archive.");

            ZipFileManager zipFileManager = getZipFileManager();

            ConsoleHelper.writeMessage("Enter path to unpack in:");
            Path destinationPath = Paths.get(ConsoleHelper.readString());
            zipFileManager.extractAll(destinationPath);

            ConsoleHelper.writeMessage("Unpacking successful.");

        } catch (PathIsNotFoundException e) {
            ConsoleHelper.writeMessage("Wrong path.");
        }
    }
}
