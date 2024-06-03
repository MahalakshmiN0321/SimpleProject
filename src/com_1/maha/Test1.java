package com_1.maha;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

public class Test1 {
    public static void main(String[] args) throws Exception {
        BeanInfo beanInfo= Introspector.getBeanInfo(Employee1.class);
        PropertyDescriptor[] propertyDescriptors=beanInfo.getPropertyDescriptors();
        for(PropertyDescriptor p:propertyDescriptors){
            System.out.println(p.getName());
            System.out.println(p.getPropertyType());
            System.out.println(p.getReadMethod());
            System.out.println(p.getWriteMethod());
        }

    }
}
