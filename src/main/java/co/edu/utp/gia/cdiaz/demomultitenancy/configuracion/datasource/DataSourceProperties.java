package co.edu.utp.gia.cdiaz.demomultitenancy.configuracion.datasource;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "tenants")
public class DataSourceProperties {

    private Map<Object, Object> datasources = new LinkedHashMap<>();

    public Map<Object, Object> getDatasources() {
        return datasources;
    }

    public void setDatasources(Map<String, Map<String, String>> datasources) {
        datasources.forEach((key, value) -> this.datasources.put(key, convert(value)));
    }

    public DataSource convert(Map<String, String> source) {
        return DataSourceBuilder.create()
                .url(source.get("url"))
                .driverClassName(source.get("driver"))
                .username(source.get("username"))
                .password(source.get("password"))
                .build();
    }
}