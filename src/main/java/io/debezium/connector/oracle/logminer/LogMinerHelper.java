/*
 * Modified by @hyunkshinft to separate only the parser part out from the main debezium package.
 */
/*
 * Copyright Debezium Authors.
 *
 * Licensed under the Apache Software License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package io.debezium.connector.oracle.logminer;

import io.debezium.connector.oracle.logminer.parser.Column;
import io.debezium.connector.oracle.logminer.parser.DebeziumException;
import io.debezium.connector.oracle.logminer.parser.Table;

public class LogMinerHelper {
    /**
     * Returns a 0-based index offset for the column name in the relational table.
     *
     * @param columnName the column name, should not be {@code null}.
     * @param table the relational table, should not be {@code null}.
     * @return the 0-based index offset for the column name
     */
    public static int getColumnIndexByName(String columnName, Table table) {
        final Column column = table.columnWithName(columnName);
        if (column == null) {
            // throw new DebeziumException("No column '" + columnName + "' found in table '" + table.id() + "'");
            return -1;
        }
        // want to return a 0-based index and column positions are 1-based
        return column.position() - 1;
    }
}
