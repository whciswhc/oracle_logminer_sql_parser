/*
 * Mocked by @hyunkshinft to separate only the parser part out from the main debezium package.
 */
package io.debezium.connector.oracle.logminer.parser;

public interface Column {
    public int position();
}
