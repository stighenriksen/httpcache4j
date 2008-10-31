package org.httpcache4j.payload;

import org.httpcache4j.MIMEType;

import java.io.IOException;
import java.io.InputStream;

public interface Payload {

    /**
     * Return the mime-type of the payload.
     *
     * @return the mime-type
     */
    public MIMEType getMimeType();

    /**
     * Returns the input stream of the payload. This stream MUST be closed when you are done with it.
     *
     * @return the inputstream of the payload, may return {@code null} if the payload is not available.
     * @throws java.io.IOException if an IOException occurs while the inputstream is constructed
     */
    public InputStream getInputStream() throws IOException;

    /**
     * Returns {@code true} if the payload is available, IE. If the stream can be read from.
     *
     * @return {@code true} if the payload is available. {@code false} if not.
     */
    public boolean isAvailable();

    /**
     * Returns the transientness of the payload. I.E if the payload can be re-read.
     *
     * @return {@code true} if the payload can be re-read. {@code false} if not.
     */
    public boolean isTransient();
}