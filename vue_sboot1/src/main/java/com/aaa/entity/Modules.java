package com.aaa.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.List;

public class Modules {
    private String moduleCode;
    private String moduleType;
    private String moduleText;
    private String moduleUrl;
    private String moduleIcon;
    private String parentCode;

    List<Modules> subModules;

    public List<Modules> getSubModules() {
        return subModules;
    }

    public void setSubModules(List<Modules> subModules) {
        this.subModules = subModules;
    }

    public String getModuleCode() {
        return moduleCode;
    }

    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
    }

    public String getModuleType() {
        return moduleType;
    }

    public void setModuleType(String moduleType) {
        this.moduleType = moduleType;
    }

    public String getModuleText() {
        return moduleText;
    }

    public void setModuleText(String moduleText) {
        this.moduleText = moduleText;
    }

    public String getModuleUrl() {
        return moduleUrl;
    }

    public void setModuleUrl(String moduleUrl) {
        this.moduleUrl = moduleUrl;
    }

    public String getModuleIcon() {
        return moduleIcon;
    }

    public void setModuleIcon(String moduleIcon) {
        this.moduleIcon = moduleIcon;
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    @Override
    public String toString() {
        return "Modules{" +
                "moduleCode='" + moduleCode + '\'' +
                ", moduleType='" + moduleType + '\'' +
                ", moduleText='" + moduleText + '\'' +
                ", moduleUrl='" + moduleUrl + '\'' +
                ", moduleIcon='" + moduleIcon + '\'' +
                ", parentCode='" + parentCode + '\'' +
                ", subModules=" + subModules +
                '}';
    }
}
