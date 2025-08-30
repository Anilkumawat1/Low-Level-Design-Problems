package Creational.Builder;

import java.util.HashMap;
import java.util.Map;

public class HttpRequest {
    private String url;
    private String method;
    private Map<String, String> headers;
    private String body;

    // Private constructor
    private HttpRequest(Builder builder) {
        this.url = builder.url;
        this.method = builder.method;
        this.headers = builder.headers;
        this.body = builder.body;
    }

    // Static nested Builder class
    public static class Builder {
        private String url;
        private String method = "GET"; // default
        private Map<String, String> headers = new HashMap<>();
        private String body;

        public Builder(String url) {
            this.url = url;
        }

        public Builder setMethod(String method) {
            this.method = method;
            return this;
        }

        public Builder setHeader(String key, String value) {
            this.headers.put(key, value);
            return this;
        }

        public Builder setBody(String body) {
            this.body = body;
            return this;
        }

        public HttpRequest build() {
            return new HttpRequest(this);
        }
    }

    // For demonstration
    @Override
    public String toString() {
        return "HttpRequest {\n" +
                "  url='" + url + "',\n" +
                "  method='" + method + "',\n" +
                "  headers=" + headers + ",\n" +
                "  body='" + body + "'\n" +
                '}';
    }
}

