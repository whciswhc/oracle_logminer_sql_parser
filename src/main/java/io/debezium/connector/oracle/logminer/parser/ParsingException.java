/*
 * Mocked by @hyunkshinft to separate only the parser part out from the main debezium package.
 */
package io.debezium.connector.oracle.logminer.parser;

public class ParsingException extends RuntimeException {
    public ParsingException(String m, String s, Throwable t) {
        super(s, t);
    }

    public ParsingException(Object o, String s) {
        super(s);
    }
}
