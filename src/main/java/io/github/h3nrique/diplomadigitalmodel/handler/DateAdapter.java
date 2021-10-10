package br.com.fabricads.gov.handler;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAdapter extends XmlAdapter<String, Date> {

    private static final String DATE_FORMAT = "yyyy-MM-dd";

    @Override
    public Date unmarshal(String s) throws Exception {
        DateFormat format = new SimpleDateFormat(DATE_FORMAT);
        return format.parse(s);
    }

    @Override
    public String marshal(Date xmlGregorianCalendar) throws Exception {
        return new SimpleDateFormat(DATE_FORMAT).format(xmlGregorianCalendar);
    }
}

