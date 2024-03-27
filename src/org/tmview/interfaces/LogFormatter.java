package org.tmview.interfaces;

import java.util.Date;
import java.util.logging.LogRecord;
import java.util.logging.SimpleFormatter;

// sub-class of java.util.logging.SimpleFormatter to override format()
public class LogFormatter extends SimpleFormatter {

    private static final String LINE_SEPARATOR = System.getProperty("line.separator"); //$NON-NLS-1$

    @Override
    public String format(LogRecord record) {
        StringBuilder sb = new StringBuilder();

        sb.append(new Date(record.getMillis()))
            //.append(" ")
            //.append(record.getLevel().getLocalizedName())
            .append(": ") //$NON-NLS-1$
            .append(formatMessage(record))
            .append(LINE_SEPARATOR);

        return sb.toString();
    }
}
