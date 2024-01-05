package org.launchcode;

public interface Rewritable {
    void Write(File file);
    void removeFile(File file);
    void reformatDisc();
    void runFile(File file);
}
