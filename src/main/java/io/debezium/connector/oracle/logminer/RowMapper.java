/*
 * Modified by @hyunkshinft to separate only the parser part out from the main debezium package.
 */
package io.debezium.connector.oracle.logminer;

public class RowMapper {
    public static final int INSERT = 0;
    public static final int UPDATE = 1;
    public static final int DELETE = 2;
    public static final int SELECT_LOB_LOCATOR = 3;
}
