/*
 * Modified by @hyunkshinft to separate only the parser part out from the main debezium package.
 */
/*
 * Copyright Debezium Authors.
 *
 * Licensed under the Apache Software License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package io.debezium.connector.oracle.logminer.parser;

/**
 * Exception returned by the {@link DmlParser}.
 *
 * @author Chris Cranford
 */
public class DmlParserException extends RuntimeException {
    public DmlParserException(String message) {
        super(message);
    }

    public DmlParserException(String message, Throwable t) {
        super(message, t);
    }
}
