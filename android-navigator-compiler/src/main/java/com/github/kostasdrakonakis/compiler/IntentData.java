package com.github.kostasdrakonakis.compiler;

import com.github.kostasdrakonakis.annotation.IntentCategory;
import com.github.kostasdrakonakis.annotation.IntentExtra;
import com.github.kostasdrakonakis.annotation.IntentFlag;

import java.util.ArrayList;
import java.util.List;

class IntentData {
    private List<IntentExtraData> typeList;
    private List<IntentFlagData> flagList;
    private List<IntentCategoryData> categoryList;
    private String packageName;
    private String type;

    IntentData(IntentExtra[] values,
               IntentFlag[] flags,
               IntentCategory[] categories,
               String type,
               String packageName) {

        typeList = new ArrayList<>();
        flagList = new ArrayList<>();
        categoryList = new ArrayList<>();
        for (IntentExtra extra : values) {
            typeList.add(new IntentExtraData(extra.parameter(), extra.type()));
        }
        for (IntentFlag flag : flags) {
            flagList.add(new IntentFlagData(flag.value().name()));
        }
        for (IntentCategory category : categories) {
            categoryList.add(new IntentCategoryData(category.value().name()));
        }
        this.type = type;
        this.packageName = packageName;
    }

    List<IntentExtraData> getValues() {
        return typeList;
    }

    List<IntentFlagData> getFlags() {
        return flagList;
    }

    List<IntentCategoryData> getCategories() {
        return categoryList;
    }

    String getPackageName() {
        return packageName;
    }

    String getType() {
        return type;
    }
}
