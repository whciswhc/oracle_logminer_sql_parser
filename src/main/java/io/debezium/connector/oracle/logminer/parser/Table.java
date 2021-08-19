/*
 * Mocked by @hyunkshinft to separate only the parser part out from the main debezium package.
 */
package io.debezium.connector.oracle.logminer.parser;

import java.util.ArrayList;
import java.util.List;

public interface Table {
    public List<Column> columns();
    public Column columnWithName(String columnName);
    public String id();
}
