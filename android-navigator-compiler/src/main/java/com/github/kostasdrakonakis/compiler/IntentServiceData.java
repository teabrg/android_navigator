package com.github.kostasdrakonakis.compiler;

import com.github.kostasdrakonakis.annotation.IntentCategory;
import com.github.kostasdrakonakis.annotation.IntentExtra;
import com.github.kostasdrakonakis.annotation.IntentFlag;
import com.github.kostasdrakonakis.annotation.ServiceType;

class IntentServiceData extends IntentData {
    private ServiceType serviceType;

    IntentServiceData(IntentExtra[] values,
                      IntentFlag[] flags,
                      IntentCategory[] categories,
                      String type,
                      String packageName, ServiceType serviceType) {

        super(values, flags, categories, type, packageName);
        this.serviceType = serviceType;
    }

    ServiceType getServiceType() {
        return serviceType;
    }
}
