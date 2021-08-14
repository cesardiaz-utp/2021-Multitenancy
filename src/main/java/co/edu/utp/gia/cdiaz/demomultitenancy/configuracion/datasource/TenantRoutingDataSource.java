package co.edu.utp.gia.cdiaz.demomultitenancy.configuracion.datasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import co.edu.utp.gia.cdiaz.demomultitenancy.configuracion.tenant.ThreadTenantStorage;

public class TenantRoutingDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        return ThreadTenantStorage.getTenantId();
    }
}
