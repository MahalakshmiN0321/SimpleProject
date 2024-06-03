package com.maha;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class I18N {
    public static void main(String[] args) {
        Locale l=new Locale("it","IT");
        NumberFormat nf=NumberFormat.getInstance(l);
        System.out.println(nf.format(123456.678));
        System.out.println();

        Date d=new Date();
        System.out.println(d);
        System.out.println();

        DateFormat df=DateFormat.getDateInstance(0,l);
        System.out.println(df.format(new Date()));
        System.out.println();

        ResourceBundle rs=ResourceBundle.getBundle("com.maha.abc",l); // Resource Bundle take properties file data
        System.out.println(rs.getString("welcome"));

    }
}
