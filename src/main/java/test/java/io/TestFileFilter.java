package test.java.io;

import java.io.File;
import java.io.FileFilter;

/**
 * @author daxue0929
 * @date 2021/9/20
 */

public class TestFileFilter implements FileFilter {

    @Override
    public boolean accept(final File pathname) {
        if (pathname.getAbsolutePath().endsWith("json")) {
            return true;
        }else {
            return false;
        }
    }
}
