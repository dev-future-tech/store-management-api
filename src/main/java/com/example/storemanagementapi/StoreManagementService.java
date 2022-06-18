package com.example.storemanagementapi;

import com.example.storemanagementapi.model.Tables;
import com.example.storemanagementapi.model.tables.pojos.Store;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class StoreManagementService {

    @Autowired
    DSLContext context;

    public List<Store> getStores() {
        return context.selectFrom(Tables.STORE)
                .fetchInto(Store.class);
    }

    public void insertStore(Store store) {
        context.insertInto(Tables.STORE)
                .values(store.getStoreName(), store.getPhoneNo())
                .execute();
    }
}
